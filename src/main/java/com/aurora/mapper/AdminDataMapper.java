package com.aurora.mapper;

import com.aurora.domain.AdminData;
import com.aurora.domain.AdminDataExample;
import java.util.List;

public interface AdminDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminData record);

    int insertSelective(AdminData record);

    List<AdminData> selectByExample(AdminDataExample example);

    AdminData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminData record);

    int updateByPrimaryKey(AdminData record);
}