package com.jlo.serviceImpl;

import com.jlo.dao.SysUserMapper;
import com.jlo.model.SysUser;
import com.jlo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/12/28.
 */

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insertSelective(SysUser record) {
        return 0;
    }

    @Override
    public SysUser selectByPrimaryKey(Integer id) {
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(id);
        return sysUser;
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return 0;
    }
}
