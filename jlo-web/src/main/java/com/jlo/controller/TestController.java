package com.jlo.controller;

import com.jlo.model.SysUser;
import com.jlo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lenovo on 2017/12/28.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/sayInfo")
    @ResponseBody
    public String sayInfo(HttpServletRequest request, HttpServletResponse response) {

        return "hello";
    }

    @RequestMapping(value = "/{id}")
    public
    @ResponseBody
    String getId(@PathVariable(value = "id") Integer id) {
        SysUser sysUser = sysUserService.selectByPrimaryKey(id);
        return sysUser.getName();
    }
}
