package com.it.houhong.login;
/*
 * 用户登录注册案例.MD 
 */

public class User {

	//用户登陆案列
	private  String username;
	private  String password;
	
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}



	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	

}
