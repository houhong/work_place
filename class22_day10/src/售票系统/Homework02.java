package ��Ʊϵͳ;

import test_thinking.main_1;
/*
 *    ������Ʊ�������ָ�Ч���������Ӧ�ö��̵߳�ͬ�����п���ģ��ܶ�����Ʊ��
 *    ���Ҳ��ᷢ����ͻ�����棬���Ǿ������ö��߳���ģ��һ�ѡ�
 */

public class Homework02 {

	public Homework02() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {
      
		 //��һ��Կ��
		Object obj = new Object();
		WindowThread  thread01 =new WindowThread("����һ",obj);
		WindowThread  thread02 =new WindowThread("���ڶ�",obj);
		WindowThread  thread03 =new WindowThread("������",obj);
		
		
		thread01.start();
		thread02.start();
		thread03.start();
		
		
	}

}
