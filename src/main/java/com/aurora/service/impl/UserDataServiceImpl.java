package com.aurora.service.impl;

import com.aurora.domain.UserData;
import com.aurora.domain.UserDataExample;
import com.aurora.mapper.UserDataMapper;
import com.aurora.service.IUserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Yao
 * @Date 2021/4/5 19:33
 * @Description
 */
@Service
public class UserDataServiceImpl implements IUserDataService {
    @Autowired
    UserDataMapper userDataMapper;
    @Override
    public boolean register(UserData userData) {
        //先查找要注册的id存不存在
        UserData checkUser = userDataMapper.selectByPrimaryKey(userData.getId());
        //不存在就注册
        if(checkUser==null)
            return userDataMapper.insert(userData)>0;
        else
            return false;
    }

    @Override
    public UserData login(UserData userData) {
        UserDataExample example = new UserDataExample();
        UserDataExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(userData.getId());
        criteria.andPasswordEqualTo(userData.getPassword());
        List<UserData> list = userDataMapper.selectByExampleWithBLOBs(example);
        if(list.size()>0)
            return list.get(0);
        else
            return null;
    }

    @Override
    public boolean updateBgById(UserData userData) {
        return false;
    }

    @Override
    public UserData selectById(String id) {
        return userDataMapper.selectByPrimaryKey(id);
    }
}
