package buke_homework03;
/* 
 * ����Employee
 */
public class Employee extends Role{
	
	public  final  int ID =0;

	//�ղι�����
	public Employee(){

	}
	//�вι�����
	public Employee(String name,int age,String sex){
		super(name,age,sex);
	}
	@Override
	public void play() {
		System.out.println("˯��-----");

	}
}
