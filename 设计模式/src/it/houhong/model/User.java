package it.houhong.model;
/**
 * @author Administrator
 * 用户类
 */
public class User {
	private String name;
	private String passWord;
	private int money;
	private int frozen = 1;//冻结状态：1：正常 2：被冻结
	private final int ROLE = 1;//用户类角色
	
	public User() {
		
	}
	public User(String name, String passWord, int money, int frozen) {
		this.name = name;
		this.passWord = passWord;
		this.money = money;
		this.frozen = frozen;
	}
	
	
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
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getROLE() {
		return ROLE;
	}
	public int getFrozen() {
		return frozen;
	}
	public void setFrozen(int frozen) {
		this.frozen = frozen;
	}
	
}
