package com.cr.core.vo;

import java.io.Serializable;
import java.util.Date;

public class UserVO implements Serializable {
    private static final long serialVersionUID = -5765182481279488542L;

    private String name;
    private int age;
    private int sex;
    private Date birthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
