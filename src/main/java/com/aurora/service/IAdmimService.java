package com.aurora.service;

import com.aurora.domain.AdminData;

/**
 * @Author Yao
 * @Date 2021/4/9 17:03
 * @Description
 */
public interface IAdmimService {
    /**
     * 更新管理员界面数据
     *
     * @param vo 传入新的管理员界面数据
     * @return 成功返回true，否则返回false
     * @throws Exception
     */
    boolean updateByIdSelective(AdminData vo);

    /**
     * 获取管理员界面数据
     *
     * @return 管理员界面数据
     * @throws Exception
     */
    AdminData selectById1();
}
