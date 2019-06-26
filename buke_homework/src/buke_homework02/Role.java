package buke_homework02;

/*
 * 抽象类
 */

public abstract class Role {
	private String name;
	private int age;
	private String sex;
	
	
	
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
