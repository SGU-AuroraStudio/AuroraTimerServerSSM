package com.aurora.interceptor;

import com.alibaba.druid.util.DruidWebUtils;
import com.aurora.controller.UserDataController;
import com.aurora.domain.UserData;
import com.aurora.domain.base.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author Yao
 * @Date 2021/4/15 17:45
 * @Description
 */

public class CommonInterceptor implements HandlerInterceptor {
    private static final Logger logger = LogManager.getLogger(CommonInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        UserData user = (UserData) session.getAttribute(Constants.SESSION_USER);
        logger.info("客户端信息：");
        logger.info("URI:  " + request.getRequestURI());
        logger.info("IP:  "+DruidWebUtils.getRemoteAddr(request));
        if(user!=null) {
            logger.info("ID:  " + user.getId());
            logger.info("Nickname:  " + user.getNickname());
        }else {
            logger.info("ID:  " + "NULL");
            logger.info("Nickname:  " + "NULL");
        }
        return true;
    }
}
