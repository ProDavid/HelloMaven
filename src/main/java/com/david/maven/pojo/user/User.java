package com.david.maven.pojo.user;

import java.io.Serializable;

/**
 * 
 * @author David
 * @modifyDate 2016年7月15日
 * @description 用户实体类
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer user_id;

	private String user_name;

	private int user_age;

	private int user_gender;

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_age=" + user_age + ", user_gender="
				+ user_gender + "]";
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getUser_age() {
		return user_age;
	}

	public void setUser_age(int user_age) {
		this.user_age = user_age;
	}

	public int getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(int user_gender) {
		this.user_gender = user_gender;
	}
}
