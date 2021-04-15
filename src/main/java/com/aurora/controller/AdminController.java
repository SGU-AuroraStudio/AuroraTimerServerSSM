package com.aurora.controller;

import com.aurora.domain.AdminData;
import com.aurora.domain.UserData;
import com.aurora.domain.base.Constants;
import com.aurora.service.impl.AdminServiceImpl;
import com.aurora.service.impl.AdminUserServiceImpl;
import com.aurora.service.impl.UserServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
    @Autowired
    AdminUserServiceImpl adminUserService;

    private static Logger logger = LogManager.getLogger(AdminController.class);

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        logger.info("测试log4j");
        logger.debug("测试log4j");
        logger.warn("测试log4j");
        logger.error("测试log4j");
        return "连接成功！";
    }

    @PostMapping("/admin")
    @ResponseBody
    public boolean doPost(HttpServletRequest request, String announcement, String dutyList, String freeTimeStart, String freeTimeEnd) throws ParseException {
        //TODO:很多功能都可以改成会话方式获取
        //从会话里获取登录者
        UserData userData = (UserData) request.getSession().getAttribute(Constants.SESSION_USER);
        if(userData==null)
            return false;
        //检查该id是不是管理员
        if (!adminUserService.isAdmin(userData.getId()))
            return false;
        //准备插入数据
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); //（SimpleDateFormat永远滴神！！！）
        AdminData adminData = new AdminData(1, announcement, dutyList, sdf.parse(freeTimeStart), sdf.parse(freeTimeEnd));
        logger.info("修改公告界面，新内容：");
        logger.info(adminData.getAnnouncement());
        logger.info(adminData.getDutylist());
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
