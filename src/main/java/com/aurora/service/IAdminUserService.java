package com.aurora.service;

import com.aurora.mapper.AdminUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Yao
 * @Date 2021/4/15 19:56
 * @Description
 */
public interface IAdminUserService {
    boolean isAdmin(String userId);

}
