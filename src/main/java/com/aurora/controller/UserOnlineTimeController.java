package com.aurora.controller;

import com.aurora.service.impl.UserOnlineTimeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author Yao
 * @Date 2021/4/6 20:08
 * @Description
 */
@Controller
public class UserOnlineTimeController {
    @Autowired
    UserOnlineTimeServiceImpl userOnlineTimeService;
}
