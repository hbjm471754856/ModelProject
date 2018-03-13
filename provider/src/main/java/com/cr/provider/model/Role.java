package com.cr.provider.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
@Table(name = "t_role")
public class Role implements Serializable {

	/****/
	@Id
	@Column(name = "id")
	private Integer id;

	/****/
	@Column(name = "name")
	private String name;

	/****/
	@Column(name = "create_time")
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
