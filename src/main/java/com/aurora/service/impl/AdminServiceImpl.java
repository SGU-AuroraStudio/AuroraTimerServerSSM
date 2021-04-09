package com.aurora.service.impl;

import com.aurora.domain.AdminData;
import com.aurora.mapper.AdminDataMapper;
import com.aurora.service.IAdmimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Yao
 * @Date 2021/4/9 17:04
 * @Description
 */
@Service
public class AdminServiceImpl implements IAdmimService {
    @Autowired
    AdminDataMapper adminDataMapper;

    @Override
    public boolean updateByIdSelective(AdminData vo) {
        return adminDataMapper.updateByPrimaryKeySelective(vo) > 0;
    }

    @Override
    public AdminData selectById1() {
        return adminDataMapper.selectByPrimaryKey(1);
    }
}
