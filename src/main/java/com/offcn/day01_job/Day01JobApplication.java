package com.offcn.day01_job;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.offcn.day01_job.mapper")
public class Day01JobApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day01JobApplication.class, args);
    }

}
