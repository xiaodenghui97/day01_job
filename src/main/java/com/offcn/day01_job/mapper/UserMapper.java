package com.offcn.day01_job.mapper;

import com.offcn.day01_job.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> findUserAll();
}
