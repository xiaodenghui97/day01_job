package com.offcn.day01_job.service;

import com.offcn.day01_job.pojo.Test;

import java.util.List;

public interface TestService {
    //查询每天的考试成绩
    List<Test> findTestAll();
}
