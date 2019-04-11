package com.offcn.day01_job.controller;

import com.offcn.day01_job.pojo.Test;
import com.offcn.day01_job.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping("testAll")
    public List<Test> findTestAll(){
        return testService.findTestAll();
    }

}
