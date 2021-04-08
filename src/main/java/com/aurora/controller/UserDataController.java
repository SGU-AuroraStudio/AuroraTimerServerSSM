package com.aurora.controller;

import com.aurora.domain.UserData;
import com.aurora.domain.base.Constants;
import com.aurora.service.impl.UserDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author Yao
 * @Date 2021/4/6 19:48
 * @Description
 */
@Controller
@RequestMapping("/user")
public class UserDataController {
    @Autowired
    UserDataServiceImpl userDataService;

    @RequestMapping("/register")
    @ResponseBody
    public String register(HttpServletRequest request, UserData userData) {
        if (userData.getId() == null || userData.getPassword() == null)
            return "请检查账号或密码是否输入正确";
        //在业务层已经进行id重复检测了
        if (userDataService.register(userData)) {
            request.setAttribute(Constants.SESSION_USER, userData);
            return "true";
        } else {
            return "出现异常错误，请联系管理员";
        }
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request, @RequestParam(value = "id") String id, @RequestParam(value = "password") String password) {
        UserData user = userDataService.login(new UserData(id, password));
        if (user != null) {
            request.setAttribute(Constants.SESSION_USER, user);
            return "true";
        } else {
            if (userDataService.selectById(id) == null)
                return "账号不存在";
            else
                return "密码错误";
        }
    }

    //TODO:findById


}
