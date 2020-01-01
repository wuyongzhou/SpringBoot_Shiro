package com.example.springbootshiro.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheckPermission {

    @RequestMapping(value = "/checkPermission")
    @ResponseBody
    @RequiresPermissions("1")
    public String check(){
        return "如果你能看到这句话，证明有权限";
    }
}
