package com.aurora.service.impl;

import com.aurora.domain.UserData;
import com.aurora.domain.UserDataExample;
import com.aurora.mapper.UserDataMapper;
import com.aurora.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Yao
 * @Date 2021/4/5 19:33
 * @Description
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserDataMapper userDataMapper;

    @Override
    public boolean register(UserData userData) {
        return userDataMapper.insert(userData) > 0;
    }

    @Override
    public UserData login(UserData userData) {
        UserDataExample example = new UserDataExample();
        UserDataExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(userData.getId());
        criteria.andPasswordEqualTo(userData.getPassword());
        List<UserData> list = userDataMapper.selectByExample(example);
        if (list.size() > 0)
            return list.get(0);
        else
            return null;
    }

    @Override
    public boolean updateByIdSelective(UserData userData) {
        return userDataMapper.updateByPrimaryKeySelective(userData) > 0;
    }

    @Override
    public UserData selectById(String id) {
        return userDataMapper.selectByPrimaryKey(id);
    }
}
