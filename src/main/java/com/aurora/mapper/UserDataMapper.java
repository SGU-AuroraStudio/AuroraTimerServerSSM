package com.aurora.mapper;

import com.aurora.domain.UserData;
import com.aurora.domain.UserDataExample;
import java.util.List;

public interface UserDataMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserData record);

    int insertSelective(UserData record);

    List<UserData> selectByExampleWithBLOBs(UserDataExample example);

    List<UserData> selectByExample(UserDataExample example);

    UserData selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserData record);

    int updateByPrimaryKeyWithBLOBs(UserData record);

    int updateByPrimaryKey(UserData record);
}