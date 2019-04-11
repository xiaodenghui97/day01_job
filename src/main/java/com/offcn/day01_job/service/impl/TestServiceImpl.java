package com.offcn.day01_job.service.impl;

import com.offcn.day01_job.mapper.TestMapper;
import com.offcn.day01_job.pojo.Test;
import com.offcn.day01_job.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Resource
    private TestMapper testMapper;
    @Override
    public List<Test> findTestAll() {
        return testMapper.findAll();
    }
}
