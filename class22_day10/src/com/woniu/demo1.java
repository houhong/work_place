package com.woniu;
/*
 * talking is less,show me your code
 * �̰߳�ȫ��
 */

public class demo1 extends MyRunnable{

	public demo1() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {



		Thread t1 =new Thread("����һ"){

			@Override
			public void run() {

				// TODO �Զ����ɵķ������
				//��Ʊ
				int i = 0;
				while(true){

					if(i>99){
						break;
					}
					System.out.println(Thread.currentThread().getName()+"�ڼ���Ʊ"+(i++));
				}

			}

		};
		MyRunnable myRunnable = new MyRunnable();

		Thread t2 = new Thread(myRunnable);

		t1.start();
		t2.start();

	}

	public void sail(){

		//��Ʊ
		int i = 0;
		while(true){

			if(i>99){
				break;
			}
			System.out.println(Thread.currentThread().getName()+"�ڼ���Ʊ"+(i++));
		}


	}
}
