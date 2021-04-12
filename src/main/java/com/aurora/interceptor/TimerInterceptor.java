package com.aurora.interceptor;

import com.aurora.domain.base.Constants;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author Yao
 * @Date 2021/4/8 21:37
 * @Description
 */
public class TimerInterceptor implements HandlerInterceptor {
    public static final double LOWEST_ALLOW_VER = 4.4;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //计时功能 检查计时器版本
        if (request.getRequestURI().equals("/timer/timer")) {
            double ver = Double.parseDouble(request.getParameter("ver"));
            if (ver < LOWEST_ALLOW_VER) {
                return false;
            }
        }
        if (request.getSession().getAttribute(Constants.SESSION_USER) == null) {
            request.getRequestDispatcher("/checkLogin").forward(request, response);
            return false;
        }
        return true;
    }
}
