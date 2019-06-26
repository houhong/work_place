package Clone;

public class text {

	public text() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) throws Exception{

		Person person =new Person("侯洪","23","男",new Adder("四川", "达州", "曲线") );
		
		Person person2 =(Person)person.clone();
		//-----------------------
		person2.getAdder().setProvince("重庆");
		person2.getAdder().setCity("九龙坡");
		person2.getAdder().setRegion("石坪桥");
		System.out.println(person);
		System.out.println(person2);

	}


}
