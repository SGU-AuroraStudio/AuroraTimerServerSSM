package com.aurora.service.impl;

import com.aurora.domain.UserOnlineTime;
import com.aurora.domain.UserOnlineTimeExample;
import com.aurora.mapper.UserOnlineTimeMapper;
import com.aurora.service.IUserOnlineTimeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author Yao
 * @Date 2021/4/6 20:08
 * @Description
 */
@Service
public class UserOnlineTimeServiceImpl implements IUserOnlineTimeService {
    private static final Logger logger = LogManager.getLogger(UserOnlineTimeServiceImpl.class);
    @Autowired
    UserOnlineTimeMapper userOnlineTimeMapper;

    @Override
    public boolean addTime(String id) {
        if (id == null || id.isEmpty()) return false;
        long intervalTime = 15 * 60 * 1000; //间隔判断时间，大于这个时间的提交都算重新上线
        Date dateNow = new Date();
        //时间，HH-mm-ss，用于计算上线时间间隔
        Time timeNow = new Time(System.currentTimeMillis());
        timeNow = Time.valueOf(timeNow.toString());
        //根据id查询上线记录
        UserOnlineTimeExample example = new UserOnlineTimeExample();
        UserOnlineTimeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andTodayDateEqualTo(dateNow);
        List<UserOnlineTime> list = userOnlineTimeMapper.selectByExample(example);

        UserOnlineTime vo;
        //今日第一次上线
        if (list.size() == 0) {
            logger.info("今天第一次上线");
            vo = new UserOnlineTime(id, dateNow, 0l, dateNow);
            return userOnlineTimeMapper.insert(vo) > 0;
        } else {//不是第一次上线
            vo = list.get(0);
            long minute = vo.getTodayOnlineTime() / (60 * 1000);
            long second = vo.getTodayOnlineTime() / 1000 - minute * 60;
            logger.info("用户ID: " + vo.getId() + " 今日在线时间: " + minute + "分钟" + second + "秒");
            Time lastOnlineTime = new Time(vo.getLastOnlineTime().getTime());
            //正常情况，两次请求在设定间隔时间内
            if ((timeNow.getTime() - lastOnlineTime.getTime()) < intervalTime) {
                minute = (timeNow.getTime() - lastOnlineTime.getTime()) / (60 * 1000);
                second = (timeNow.getTime() - lastOnlineTime.getTime()) / 1000 - minute * 60;
                logger.info("将要新添加计时 = " + minute + "分钟" + second + "秒");
                UserOnlineTime voUpdate = new UserOnlineTime(id, dateNow, vo.getTodayOnlineTime() + (timeNow.getTime() - lastOnlineTime.getTime()), dateNow);
                return userOnlineTimeMapper.updateByPrimaryKeySelective(voUpdate) > 0;
            } else {//两次请求间隔过长，上线后又下线很久
                logger.info("今天两次上线间隔大于" + intervalTime / (60 * 1000) + "分钟，上次上线时间: " + vo.getLastOnlineTime());
                UserOnlineTime voUpdate = new UserOnlineTime(id, dateNow, vo.getTodayOnlineTime(), dateNow);
                return userOnlineTimeMapper.updateByPrimaryKeySelective(voUpdate) > 0;
            }
        }
    }

    @Override
    public List<UserOnlineTime> lastXWeekData(int x) {
        Date dateNow = new Date();
        UserOnlineTimeExample example = new UserOnlineTimeExample();
        UserOnlineTimeExample.Criteria criteria = example.createCriteria();
        //x*7天前的日期
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateNow);
        int dayOfWeekNow = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        //这周开头，即周日
        calendar.add(Calendar.DATE, -dayOfWeekNow);
        //设置查询条件，计算查询日期
        //查询本周，查询这周开头即周日到今天的记录
        if (x == 0) {
            criteria.andTodayDateBetween(calendar.getTime(), dateNow);
        } else {
            //这周开头-x*7即为x周前的第一天
            calendar.add(Calendar.DATE, -x * 7);
            Date lastXWeekSunday = calendar.getTime();
            //+7为最后一天
            calendar.add(Calendar.DATE, 7);
            Date lastWeekSaturday = calendar.getTime();
            criteria.andTodayDateBetween(lastXWeekSunday, lastWeekSaturday);
        }
        List<UserOnlineTime> userOnlineTimes = userOnlineTimeMapper.selectByExample(example);
        return userOnlineTimes;
    }

    @Override
    public List<UserOnlineTime> todayData() {
        UserOnlineTimeExample example = new UserOnlineTimeExample();
        UserOnlineTimeExample.Criteria criteria = example.createCriteria();
        criteria.andTodayDateEqualTo(new Date());
        return userOnlineTimeMapper.selectByExample(example);
    }

    @Override
    public UserOnlineTime searchByIdAndDate(String id, Date date) {
        UserOnlineTimeExample example = new UserOnlineTimeExample();
        UserOnlineTimeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andTodayDateEqualTo(date);
        List<UserOnlineTime> list = userOnlineTimeMapper.selectByExample(example);
        if (list.size() == 0)
            return null;
        return list.get(0);
    }

    @Override
    public List<UserOnlineTime> searchByFromDate2Today(Date dateStart) {
        UserOnlineTimeExample example = new UserOnlineTimeExample();
        UserOnlineTimeExample.Criteria criteria = example.createCriteria();
        criteria.andTodayDateBetween(dateStart, new Date());
        List<UserOnlineTime> userOnlineTimes = userOnlineTimeMapper.selectByExample(example);
        return userOnlineTimes;
    }
}
