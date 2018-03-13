package com.cr.provider.vo;

import java.io.Serializable;
import java.util.Date;

public class RoleVO implements Serializable {

	/****/
	private Integer id;
	/****/
	private String name;
	/****/
	private Date createTime;


	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

}
