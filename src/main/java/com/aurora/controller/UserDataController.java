package com.aurora.controller;

import com.aurora.domain.UserData;
import com.aurora.domain.base.Constants;
import com.aurora.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Yao
 * @Date 2021/4/6 19:48
 * @Description
 */
@Controller
public class UserDataController {
    @Autowired
    UserServiceImpl userDataService;

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

    @PostMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request, UserData userData) { //前台用json穿参数的话，要用RequestBody
        UserData user = userDataService.login(new UserData(userData.getId(), userData.getPassword()));
        if (user != null) {
            request.getSession().setAttribute(Constants.SESSION_ID, request.getSession().getId());
            request.getSession().setAttribute(Constants.SESSION_USER, user);
            return "true";
        } else {
            if (userDataService.selectById(userData.getId()) == null)
                return "账号不存在";
            else
                return "密码错误";
        }
    }

    //TODO:findById，感觉这个好像不用
    @RequestMapping("/findById")
    @ResponseBody
    public Map<String, Object> findById(String id) {
        Map<String, Object> map = new HashMap<>();
        UserData userData = userDataService.selectById(id);
        map.put("name", userData.getNickname());
        map.put("id", userData.getId());
        map.put("isAdmin", true);
        map.put("tel", "0");
        map.put("disp", "0");
        map.put("stel", "0");

        return map;
    }


}
