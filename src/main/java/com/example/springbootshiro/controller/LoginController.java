package com.example.springbootshiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping(value = "/")
    public String index()  {
        return "forward:index";
    }

    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request){
        String exceptionClassName= (String) request.getAttribute("shiroLoginFailure");
        System.out.println("----------   exceptionClassName: --------------"+exceptionClassName);
        return "ftl/login";
    }
}
