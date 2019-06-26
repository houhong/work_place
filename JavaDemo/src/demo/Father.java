package demo;

public class Father {
	
	public  String age;
	public  String name;
	public  String sex;

	public Father() {
		// TODO 自动生成的构造函数存根
	}
	
	public Father(String age,String name,String sex) {
		this.age=age;
		this.name=name;
		this.sex=sex;
	}
	
	public void eat(){
		System.out.println("我是爸爸！！！");
	}
}
