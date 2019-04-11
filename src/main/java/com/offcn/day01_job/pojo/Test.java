package com.offcn.day01_job.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Test {
    private Integer id;
    private Double highest;
    private Double lowestPoints;
    private Double average;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date time;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getHighest() {
        return highest;
    }

    public void setHighest(Double highest) {
        this.highest = highest;
    }

    public Double getLowestPoints() {
        return lowestPoints;
    }

    public void setLowestPoints(Double lowestPoints) {
        this.lowestPoints = lowestPoints;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }
}
