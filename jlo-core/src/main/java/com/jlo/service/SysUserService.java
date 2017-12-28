package com.jlo.service;

import com.jlo.model.SysUser;

/**
 * Created by lenovo on 2017/12/28.
 */
public interface SysUserService {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

}
