package it.houhong.model;
/**
 * @author Administrator
 * 管理员类
 */
public class Administrator {
	private String name;
	private String passWord;
	private final int ROLE = 2;//管理员角色
	
	public Administrator() {
		
	}
	public Administrator(String name, String passWord) {
		this.name = name;
		this.passWord = passWord;
	}
	
	//get 和set方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getROLE() {
		return ROLE;
	}
}
