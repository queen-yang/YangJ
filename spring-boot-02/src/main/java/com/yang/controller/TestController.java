package com.yang.controller;

import com.yang.bean.User;
import com.yang.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//    @Value("${user.abc}")
//    private String name;
//    @Value("${user.sex}")
//    private String sex;

    @Autowired
    private UserConfig userConfig;
    @RequestMapping("/json")
    public User json(){
        User user = new User();
        user.setName(userConfig.getABC());
        user.setSex(userConfig.getSex());
        return user;
    }
}
