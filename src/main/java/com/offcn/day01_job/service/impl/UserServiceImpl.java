package com.offcn.day01_job.service.impl;

import com.offcn.day01_job.mapper.UserMapper;
import com.offcn.day01_job.pojo.User;
import com.offcn.day01_job.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> findUserAll() {
        return userMapper.findUserAll();
    }
}
