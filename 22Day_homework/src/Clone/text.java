package Clone;

public class text {

	public text() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) throws Exception{

		Person person =new Person("���","23","��",new Adder("�Ĵ�", "����", "����") );
		
		Person person2 =(Person)person.clone();
		//-----------------------
		person2.getAdder().setProvince("����");
		person2.getAdder().setCity("������");
		person2.getAdder().setRegion("ʯƺ��");
		System.out.println(person);
		System.out.println(person2);

	}


}
