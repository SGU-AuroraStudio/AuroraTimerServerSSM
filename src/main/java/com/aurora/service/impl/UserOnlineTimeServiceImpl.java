package com.aurora.service.impl;

import com.aurora.domain.UserOnlineTime;
import com.aurora.domain.UserOnlineTimeExample;
import com.aurora.mapper.UserOnlineTimeMapper;
import com.aurora.service.IUserOnlineTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.sql.Time;

/**
 * @Author Yao
 * @Date 2021/4/6 20:08
 * @Description
 */
@Service
public class UserOnlineTimeServiceImpl implements IUserOnlineTimeService {
    @Autowired
    UserOnlineTimeMapper userOnlineTimeMapper;

    @Override
    public boolean addTime(String id) {
        if(id==null||id.isEmpty()) return false;
        long intervalTime = 15 * 60 * 1000; //间隔判断时间，大于这个时间的提交都算重新上线
        Date dateNow = new Date();
        //时间，HH-mm-ss，用于计算上线时间间隔
        Time timeNow = new Time(System.currentTimeMillis());
        timeNow = Time.valueOf(timeNow.toString());
        //根据id查询上线记录
        UserOnlineTimeExample example = new UserOnlineTimeExample();
        UserOnlineTimeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andTodaydateEqualTo(new java.util.Date());
        List<UserOnlineTime> list = userOnlineTimeMapper.selectByExample(example);

        UserOnlineTime vo;
        //今日第一次上线
        if(list==null){
            vo=new UserOnlineTime(id, dateNow, 0l, new Date());
            userOnlineTimeMapper.insert(vo);
        }else {//不是第一次上线
            vo = list.get(0);
            //正常情况，两次请求在设定间隔时间内
            if ((timeNow.getTime() - vo.getLastOnlineTime().getTime()) < intervalTime){
                UserOnlineTime voUpdate = new UserOnlineTime(id, dateNow, timeNow.getTime()-vo.getLastOnlineTime().getTime(), dateNow);
                userOnlineTimeMapper.insert(voUpdate);
            }else{//两次请求间隔过长，上线后又下线很久
                UserOnlineTime voUpdate = new UserOnlineTime(id, dateNow, timeNow.getTime(), vo.getLastOnlineTime());
                userOnlineTimeMapper.updateByPrimaryKeySelective(voUpdate);
            }
        }
        return false;
    }

    @Override
    public Set<UserOnlineTime> lastXWeekData(int x) {
        Set<UserOnlineTime> set = new HashSet<>();
        Date dateNow = new Date();
        UserOnlineTimeExample example = new UserOnlineTimeExample();
        UserOnlineTimeExample.Criteria criteria = example.createCriteria();
        //x*7天前的日期
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateNow);
        int dayOfWeekNow = calendar.get(Calendar.DAY_OF_WEEK)-1;
        //这周开头，即周日
        calendar.add(Calendar.DATE, -dayOfWeekNow);
        //设置查询条件，计算查询日期
        //查询本周，查询这周开头即周日到今天的记录
        if(x==0){
            criteria.andTodaydateBetween(calendar.getTime(), dateNow);
        }else {
            //这周开头-x*7即为x周前的第一天
            calendar.add(Calendar.DATE, -x*7);
            Date lastXWeekSunday = calendar.getTime();
            //+7为最后一天
            calendar.add(Calendar.DATE,7);
            Date lastWeekSaturday = calendar.getTime();
            criteria.andTodaydateBetween(lastXWeekSunday, lastWeekSaturday);
        }
        List<UserOnlineTime> userOnlineTimes = userOnlineTimeMapper.selectByExample(example);
        set.addAll(userOnlineTimes);
        return set;
    }

    @Override
    public Set<UserOnlineTime> todayData() {
        return null;
    }

    @Override
    public UserOnlineTime searchByUnique(String id, Date date) {
        return null;
    }

    @Override
    public Set<UserOnlineTime> searchByFromDate2Today(Date dateStart) {
        return null;
    }
}
