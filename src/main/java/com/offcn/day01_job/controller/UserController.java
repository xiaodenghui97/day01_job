package com.offcn.day01_job.controller;

import com.offcn.day01_job.pojo.User;
import com.offcn.day01_job.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("userAll")
    private List<User> findUserAll(){
        List<User> userAll = userService.findUserAll();
        return userAll;
    }
}
