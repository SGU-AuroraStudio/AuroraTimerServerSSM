package com.aurora.service;

import com.aurora.domain.UserData;

/**
 * @Author Yao
 * @Date 2021/4/5 19:33
 * @Description
 */
public interface IUserDataService {
    boolean register(UserData userData);

    UserData login(UserData userData);

    boolean updateBgById(UserData userData);

    UserData selectById(String id);
}
