package com.nio;
/*
 * intanceof�����жϸ������ǰ����������ͱ����Ķ���
 */

interface IMamal{
	
	//�ڲ��ӿ�
	void move();
}
public class IntanceofDemo {

	
	public IntanceofDemo() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {
		
		System.out.println(new Test() instanceof IMamal);
		
	}

	

}

class Test implements IMamal{
	
	 public static void main(String[] args) {
		
	}

	@Override
	public void move() {
	  System.out.println("hellp");
		
	}
}






