package com.it.io;

import org.omg.CORBA.INTERNAL;

public class Demo11 {

	public Demo11() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {

		Object obj =  new Object();



		new Thread(new Runnable() {

			int count = 1 ;
			@Override
			public void run() {

				while(count<53){



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

			int count =65;//A
			@Override
			public void run() {
				while(count<91){


					try {

						Thread.sleep(50);

					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}

					synchronized (obj) {


						System.out.println((char)count + " ");

						count++;

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

	} 
}
