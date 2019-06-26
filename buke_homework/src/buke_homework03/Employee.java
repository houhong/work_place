package buke_homework03;
/* 
 * 创建Employee
 */
public class Employee extends Role{
	
	public  final  int ID =0;

	//空参构造器
	public Employee(){

	}
	//有参构造器
	public Employee(String name,int age,String sex){
		super(name,age,sex);
	}
	@Override
	public void play() {
		System.out.println("睡觉-----");

	}
}
