package ���ģʽ;
/*
 * ������
 */

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		//���������
		WechatServer server = new WechatServer();
		
		//ʵ�й۲���
		Observe userZhangsan = new User("Zhangsan");
		Observe userLisi = new User("Lisi");
		Observe userWangwu = new User("Wangwu");
		
		/* --------------------------------------*/
		server.registerObserver(userWangwu);
		server.registerObserver(userLisi);
		server.registerObserver(userZhangsan);
		
		/* --------------------------------------*/
		
		server.setInformation("php����������õ����ԣ�������");
		
		System.out.println("--------------------------");
		
		server.removeObserver(userZhangsan);
		server.setInformation("JAVA����������õ�����");
			
		
	}
	
	
}
