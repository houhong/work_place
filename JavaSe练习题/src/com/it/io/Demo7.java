package com.it.io;

public class Demo7 {


	public Demo7() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {

		Object obj = new Object();
		//��ӡ����
		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (obj) {

					for (int i = 0; i < 52;) {

						System.err.println(i++);
						System.err.println(i++);

						try {
							obj.wait();
						} catch (InterruptedException e) {
							// TODO �Զ����ɵ� catch ��
							e.printStackTrace();
						}

						obj.notify();


					}
				}

			}
		}).start();

		//��ӡ��ĸ
		new Thread(new Runnable() {

			@Override
			public void run() {

				synchronized (obj) {

					try {
						obj.notify();
						
					} catch (Exception e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
					obj.notify();

					for (char i = 'A'; i < 'Z'; i++) {

						System.out.println((char)i +" ");

						try {
							obj.wait();
						} catch (InterruptedException e) {
							// TODO �Զ����ɵ� catch ��
							e.printStackTrace();
						}

						obj.notifyAll();

					}
				}

			}
		}).start();
	}

}
