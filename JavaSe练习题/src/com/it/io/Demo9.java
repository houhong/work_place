package com.it.io;
/*
 * ����˯�߻���
 */
public class Demo9 {

	public Demo9() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {

		Object obj = new Object();//��

		//����
		new Thread(new Runnable() {

			int count  = 0;
			@Override
			public void run() {

				while(count<52){


					synchronized (obj) {

						
						System.out.print(count++);
						System.out.print(count++);

						
						obj.notify();
						try {
							obj.wait();
						} catch (InterruptedException e) {
							// TODO �Զ����ɵ� catch ��
							e.printStackTrace();
						}
						
					
					}

				}

			}
		}).start();


		//��ĸ	
		new Thread(new Runnable() {

			int count = 65;//A
			@Override
			public void run() {
				while(count<91){
					//��˯�ߴ��߳�
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
					
					//�õ�obj ���ܽ�����������
					synchronized (obj) {

						System.out.print((char)count +" ");
						
						count++;
						
					
						obj.notify();
					}



				}

			}
		}).start();


	}

}
