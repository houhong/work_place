package com.it.io;


public class Demo10 {

	public Demo10() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {

		Object obj = new Object();

		//����
		new Thread(new Runnable() {

			int i = 1;
			@Override
			public void run() {

				while(i< 53){
					synchronized (obj) {

						System.out.print(i++);
						System.out.print(i++);

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

			int count =65 ;
			@Override
			public void run() {
				
				while(count<91){

					try {

						Thread.sleep(50);

					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}

					//��ǰ�߳��õ�obj ����ִ��synchronized���������
					
					synchronized (obj) {

						System.out.print( (char)count + " ");
						
						count++;
						
						obj.notify();
						
						
						/*try {
							obj.wait();
						} catch (InterruptedException e) {
							// TODO �Զ����ɵ� catch ��
							e.printStackTrace();
						}
*/
					}

				}
			}
		}).start();



	}

}
