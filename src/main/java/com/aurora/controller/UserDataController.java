package com.aurora.controller;

import com.aurora.domain.UserData;
import com.aurora.domain.base.Constants;
import com.aurora.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
        //旧版本密码是pwd，新版的password
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

    @RequestMapping("/checkLogin")
    @ResponseBody
    public String checkLogin(HttpServletRequest request) {
        UserData user = (UserData) request.getSession().getAttribute(Constants.SESSION_USER);
        if (user == null)
            return "请先登录";
        else
            return "true";
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
        map.put("bgUrl", userData.getBgurl());
//        map.put("tel", "0");
//        map.put("disp", "0");
//        map.put("stel", "0");
        return map;
    }

    /**
     * 获取背景图片，需要登录
     */
    @GetMapping("/bg/{fileName}")
//    @ResponseBody
    public void getBg(HttpServletRequest request, HttpServletResponse response, @PathVariable String fileName) throws IOException {
        //检查图片存不存在，检查是否是用户的头像
        File bg = new File(Constants.LOCAL_BG_BASE_PATH + "/" + fileName);
        UserData user = (UserData) request.getSession().getAttribute(Constants.SESSION_USER);
        String userRealProfileName = user.getBgurl().split("/")[5];
        if (!bg.exists() || !userRealProfileName.equals(fileName)) {
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().print("{\"code\":404,\"message\":\"资源不存在\",\"data\":null}");
            return;
        }
        FileInputStream in = new FileInputStream(bg);
        byte[] bytes = new byte[in.available()];
        in.read(bytes);
        in.close();
        response.getOutputStream().write(bytes);
    }

    /**
     * 上传背景图片，需要登录
     */
    @PostMapping("/bg")
    @ResponseBody
    public boolean bg(HttpServletRequest request, @RequestParam("file") MultipartFile file) throws IOException {
        if (file == null || !file.getContentType().contains("image"))
            return false;
        HttpSession session = request.getSession();
        UserData userData = (UserData) session.getAttribute(Constants.SESSION_USER);
        //获取图片后缀组成图片名称 如：id_bg.jpg
        String[] split = file.getOriginalFilename().split("\\.");
        String fileName = userData.getId() + "_bg." + split[split.length - 1];
        //保存到文件系统
        File fileToSave = new File(Constants.LOCAL_BG_BASE_PATH, fileName);
        file.transferTo(fileToSave);
        //设置新路径准备更新到数据库
        userData.setBgurl(Constants.SERVER_BASE_HTTP_URL + "/bg/" + fileName);
        //上传到数据库
        if (userDataService.updateByIdSelective(userData)) {
            //更新session里的user
            session.setAttribute(Constants.SESSION_USER, userData);
            return true;
        } else {
            fileToSave.delete();
            return false;
        }
    }

}
