package it.houhong.model;
/**
 * @author Administrator
 * ����Ա��
 */
public class Administrator {
	private String name;
	private String passWord;
	private final int ROLE = 2;//����Ա��ɫ
	
	public Administrator() {
		
	}
	public Administrator(String name, String passWord) {
		this.name = name;
		this.passWord = passWord;
	}
	
	//get ��set����
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
