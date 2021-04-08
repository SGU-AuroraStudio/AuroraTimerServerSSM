package com.aurora.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;

/**
 * @Author Yao
 * @Date 2021/4/8 21:37
 * @Description
 */
public class TimerInterceptor implements HandlerInterceptor {
    public static final double LOWEST_ALLOW_VER=4.4;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //检查计时器版本
        double ver = Double.parseDouble(request.getParameter("ver"));
        if(ver<LOWEST_ALLOW_VER) {
            return false;
        }
        return true;
    }
}
