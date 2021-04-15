package com.aurora.service.impl;

import com.aurora.mapper.AdminUserMapper;
import com.aurora.service.IAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Yao
 * @Date 2021/4/15 19:57
 * @Description
 */
@Service
public class AdminUserServiceImpl implements IAdminUserService {
    @Autowired
    AdminUserMapper adminUserMapper;

    @Override
    public boolean isAdmin(String userId) {
        return adminUserMapper.selectByUserId(userId)>0;
    }
}
