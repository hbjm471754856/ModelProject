package com.cr.provider.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 *
 *
 *
 **/
@SuppressWarnings("serial")
@Table(name = "t_user")
public class User implements Serializable {

    /****/
    @Id
    @Column(name = "id")
    private Integer id;

    /****/
    @Column(name = "account")
    private String account;

    /****/
    @Column(name = "password")
    private String password;

    /****/
    @Column(name = "age")
    private Integer age;

    /****/
    @Column(name = "sex")
    private Integer sex;

    /****/
    @Column(name = "create_time")
    private Date createTime;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return this.account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

}
