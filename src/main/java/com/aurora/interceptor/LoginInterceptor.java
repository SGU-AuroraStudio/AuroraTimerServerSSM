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
public class LoginInterceptor implements HandlerInterceptor {
    public static final double LOWEST_ALLOW_VER = 4.4;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //计时功能 检查计时器版本
        //TODO:严谨一点可以设置一个算法，根据时间戳生成字符串，客户端和服务端都生成，比较是不是一样的，就可以强制用客户端计时了
        if (request.getRequestURI().equals("/timer/timer")) {
            String verStr = request.getParameter("ver");
            if(verStr==null)
                return false;
            double ver = Double.parseDouble(verStr);
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
