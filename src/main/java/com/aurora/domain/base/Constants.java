package com.aurora.domain.base;

import com.aurora.domain.UserData;

/**
 * @Author Yao
 * @Date 2021/4/6 19:57
 * @Description
 */
public class Constants {
    public static final String SESSION_ID = "sessionId";
    public static final String SESSION_USER = "user";
    public static UserData user; //TODO:从会话获取的用户应该可以保存到这里，就不用重复获取了
//    public static final String LOCAL_BG_BASE_PATH = "E:\\Timer";
//    public static final String SERVER_BASE_HTTP_URL = "http://localhost:8080/timer";

    public static final String LOCAL_BG_BASE_PATH = "/root/timer";
    public static final String SERVER_BASE_HTTP_URL = "http://47.99.134.104:8083/timer";
}
