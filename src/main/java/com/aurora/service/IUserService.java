package com.aurora.service;

import com.aurora.domain.UserData;

/**
 * @Author Yao
 * @Date 2021/4/5 19:33
 * @Description
 */
public interface IUserService {
    boolean register(UserData userData);

    UserData login(UserData userData);

    boolean updateByIdSelective(UserData userData);

    UserData selectById(String id);
}
