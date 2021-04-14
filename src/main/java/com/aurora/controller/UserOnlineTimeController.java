package com.aurora.controller;

import com.aurora.domain.UserOnlineTime;
import com.aurora.service.impl.UserOnlineTimeServiceImpl;
import com.aurora.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * @Author Yao
 * @Date 2021/4/6 20:08
 * @Description
 */
@Controller
public class UserOnlineTimeController {
    @Autowired
    UserOnlineTimeServiceImpl userOnlineTimeService;
    @Autowired
    UserServiceImpl userDataService;

    @RequestMapping("/timer")
    @ResponseBody
    public String timer(@RequestParam String id) {
        if (userDataService.selectById(id) == null)
            return "用户不存在";
        //在service层里进行各种判断
        return String.valueOf(userOnlineTimeService.addTime(id));
    }

    @RequestMapping("/lastXWeek")
    @ResponseBody
    public Map<String, Object> lastXWeek(@RequestParam Integer x) {
        //Map的key为id
        Map<String, Object> map = new HashMap<>();
        Map<String, Long> weekTimeMap = new HashMap<>();
        Map<String, Long> termTimeMap = new HashMap<>();
        //==========计算本周时间==========
        List<UserOnlineTime> userOnlineTimesWeek = userOnlineTimeService.lastXWeekData(x);
        for (UserOnlineTime userOnlineTime : userOnlineTimesWeek) {
            Long todayOnlineTime;
            //从map看看有没有记录，没有的话直接插入，有的话拿map记录的时间+要插入的时间
            if ((todayOnlineTime = weekTimeMap.get(userOnlineTime.getId())) == null) {
                weekTimeMap.put(userOnlineTime.getId(), userOnlineTime.getTodayOnlineTime());
            } else {
                weekTimeMap.put(userOnlineTime.getId(), todayOnlineTime + userOnlineTime.getTodayOnlineTime());
            }
        }
        //==========计算学期时间==========
        // 开学日期，用于获取本学期计时
        Date termStart;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int month = calendar.get(Calendar.MONTH);
        //==计算学期开学时间==
        // 第一学期的开学日期
        if (month > 9) { // 9月份之后-12月，为当前年份，比如2020-09是第一学期
            calendar.set(calendar.get(Calendar.YEAR), 9, 1);
        } else if (month < 2) { // 2月份之前，是前一年开学的，比如2021-01开学时间是2020-09
            calendar.set(calendar.get(Calendar.YEAR) - 1, 9, 1);
        }
        // 第二学期好办，假设2月1号开学，7月多放假。都在同一年，即当前年份
        else {
            calendar.set(calendar.get(Calendar.YEAR), 2, 1);
        }
        termStart = calendar.getTime();
        // 计算每个人的总和
        List<UserOnlineTime> userOnlineTimesTerm = userOnlineTimeService.searchByFromDate2Today(termStart);
        for (UserOnlineTime userOnlineTime : userOnlineTimesTerm) {
            Long todayOnlineTime;
            //从map看看有没有记录，没有的话直接插入，有的话拿map记录的时间+要插入的时间
            if ((todayOnlineTime = termTimeMap.get(userOnlineTime.getId())) == null) {
                termTimeMap.put(userOnlineTime.getId(), userOnlineTime.getTodayOnlineTime());
            } else {
                termTimeMap.put(userOnlineTime.getId(), todayOnlineTime + userOnlineTime.getTodayOnlineTime());
            }
        }

        //遍历map，之前只是添加了时间。把本周和本学期有时间的都返回（有时这个人这学期有计时，但是这周没有，不返回的话不方便对比所有人的计时，所以返回长的那个，本学期的肯定比本周的长啦）。
        //TODO:旧版返回的时间是字符串，这里返回是的long
        Set<String> ids = termTimeMap.keySet();
        for (String id : ids) {
            //在map里存map
            Map<String, Object> each = new HashMap<>();
            each.put("id", id);
            each.put("name", userDataService.selectById(id).getNickname());
            each.put("time", weekTimeMap.get(id) == null ? 0 : weekTimeMap.get(id));
            each.put("termTime", termTimeMap.get(id));
            map.put(id, each);
        }
        return map;
    }

    @RequestMapping("/todayTime")
    @ResponseBody
    public Map<String, Object> todayTime() {
        Map<String, Object> map = new HashMap<>();
        List<UserOnlineTime> userOnlineTimes = userOnlineTimeService.todayData();
        //TODO:旧版返回的时间是字符串，这里返回是的long
        for (UserOnlineTime userOnlineTime : userOnlineTimes) {
            Map<String, Object> each = new HashMap();
            each.put("id", userOnlineTime.getId());
            each.put("time", userOnlineTime.getTodayOnlineTime());
            map.put(userOnlineTime.getId(), each);
        }
        return map;
    }

}
