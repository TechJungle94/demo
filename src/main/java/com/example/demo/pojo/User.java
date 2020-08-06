package com.example.demo.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class User {
    private String name;
    @JsonIgnore //用来在前端隐藏部分信息
    private String password;
    private Integer age;
    //指定日期的显示格式
    @JsonFormat(pattern = "yyyy-mm-dd hh:mm:ss a", locale = "zh", timezone = "GMT+8")
    private Date birthday;
    //值是non-null才会显示
    @JsonInclude(Include.NON_NULL)
    private String description;

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }
}