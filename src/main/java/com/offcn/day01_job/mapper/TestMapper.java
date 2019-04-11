package com.offcn.day01_job.mapper;

import com.offcn.day01_job.pojo.Test;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestMapper {
    @Select("select * from test")
    List<Test> findAll();
}
