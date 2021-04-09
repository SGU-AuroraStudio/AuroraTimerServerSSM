package com.aurora.controller;

import com.aurora.domain.AdminData;
import com.aurora.domain.UserData;
import com.aurora.domain.base.Constants;
import com.aurora.service.impl.AdminServiceImpl;
import com.aurora.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Yao
 * @Date 2021/4/9 17:03
 * @Description
 */
@Controller
public class AdminController {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    AdminServiceImpl adminService;

    @PostMapping("/admin")
    @ResponseBody
    public boolean doPost(String id, String password, String announcement, String dutyList, String freeTimeStart, String freeTimeEnd) throws ParseException {
        //TODO:改成会话的方式检查权限
        //检查该id是不是管理员
        boolean isAdmin = false;
        for (String adminId : Constants.ADMIN_IDS)
            if (adminId.equals(id)) {
                isAdmin = true;
                break;
            }
        if (!isAdmin)
            return false;

        //检查账号密码是否正确
        UserData checkUser = userService.login(new UserData(id, password));
        if (checkUser == null)
            return false;
        //准备插入数据
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); //（SimpleDateFormat永远滴神！！！）
        AdminData adminData = new AdminData(1, announcement, dutyList, sdf.parse(freeTimeStart), sdf.parse(freeTimeEnd));
        return adminService.updateByIdSelective(adminData);
    }

    @GetMapping("/admin")
    @ResponseBody
    public Map<String, Object> doGet() {
        Map<String, Object> map = new HashMap<>();
        AdminData adminData = adminService.selectById1();
        map.put("freeTimeStart", adminData.getFreetimestart());
        map.put("freeTimeEnd", adminData.getFreetimeend());
        map.put("announcement", adminData.getAnnouncement());
        map.put("dutyList", adminData.getDutylist());
        return map;
    }

    @GetMapping("/freeTime")
    @ResponseBody
    public boolean isFreeTime() {
        AdminData adminData = adminService.selectById1();
        //比较系统当前时间和数据库设置的时间，要求 start<系统时间<end
        //用SimpleDateFormat统一格式化成HH:mm:ss，然后比较字符串大小就行了（SimpleDateFormat永远滴神！！！）
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String nowTime = sdf.format(new Date());
        String freeTimeStart = sdf.format(adminData.getFreetimestart());
        String freeTimeEnd = sdf.format(adminData.getFreetimeend());
        return nowTime.compareTo(freeTimeStart) > 0 && nowTime.compareTo(freeTimeEnd) < 0;
    }
}
