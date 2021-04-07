package com.aurora.mapper;

import com.aurora.domain.UserOnlineTime;
import com.aurora.domain.UserOnlineTimeExample;
import com.aurora.domain.UserOnlineTimeKey;
import java.util.List;

public interface UserOnlineTimeMapper {
    int deleteByPrimaryKey(UserOnlineTimeKey key);

    int insert(UserOnlineTime record);

    int insertSelective(UserOnlineTime record);

    List<UserOnlineTime> selectByExample(UserOnlineTimeExample example);

    UserOnlineTime selectByPrimaryKey(UserOnlineTimeKey key);

    int updateByPrimaryKeySelective(UserOnlineTime record);

    int updateByPrimaryKey(UserOnlineTime record);
}