package buke_homework03;

import javax.swing.UIDefaults.ProxyLazyValue;

/*
 * 抽象类
 */

public abstract class Role {
	private String name;
	private int age;
	private String sex;
	
	public Role(String name,int age,String sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public Role() {
		// TODO 自动生成的构造函数存根
	}
	
	public abstract void play();
	
	
	
	//set和get方法
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	 
	
	
	
}
