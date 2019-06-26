package com.nio;
/*
 * 存储内容
 */

public class Person {

	public Person() {
		// TODO 自动生成的构造函数存根
	}
	
	public String name;
	public int   age;
	/**
	 * 
	 */
	public String username;
	public String userpass;
	public String sex;
	
	//构造方法
	public Person(String name, int age, String username, String userpass) {
		super();
		this.name = name;
		this.age = age;
		this.username = username;
		this.userpass = userpass;
	}

	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", username="
				+ username + ", userpass=" + userpass + ", sex=" + sex
				+ ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getUsername()=" + getUsername() + ", getUserpass()="
				+ getUserpass() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	public String getName() {
		return name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
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


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getUserpass() {
		return userpass;
	}


	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	
	
	
	
	

}
