package test_thinking;

import java.nio.channels.spi.AbstractInterruptibleChannel;
/*
 * �������
 */


public class Test {

	public Test() {
		// TODO �Զ����ɵĹ��캯�����
	}

	// ������
	public  synchronized void test1(){

		int i=10;
		while(i>0){

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"������");
			i--;
		}
	}

	//������
	public  void test2(){
		synchronized (this ) {
			int i=10;
			while(i>0){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"������");
				i--;
			}
		}

	}

	//������
	Object obj = new Object();

	public  void test3(){
		synchronized (obj) {

			int i=10;
			while(i>0){

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				System.out.println("������");
				i--;
			}

		}
	}

	//����
	public  static synchronized  void test4(){
		{   
			int i=10;
			while(i>0){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread()+"����");
				i--;
			}

		}
	}

	//����
	public void test5(){
		synchronized (Test.class) {

			int i=10;
			while(i>0){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread()+"����");
				i--;
			}


		}

	}

}
