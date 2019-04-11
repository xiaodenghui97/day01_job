package com.offcn.day01_job.service;

import com.offcn.day01_job.pojo.User;

import java.util.List;

public interface UserService {
    //查询所有的用户
    List<User> findUserAll();
}
