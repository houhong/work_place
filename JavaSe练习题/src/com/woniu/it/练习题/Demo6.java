package com.woniu.it.��ϰ��;
/*
 * ������Ʊ
 */

public class Demo6 {

	//�̹߳��������
	public static int tecket= 100;
	public Demo6() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {

		Object obj = new Object();

		new Thread(new Runnable() {

			@Override
			public void run() {
				while(tecket>0){
					synchronized (obj) {

						System.out.println(Thread.currentThread().getName()+" "+tecket);
						tecket--;
					}
				}


			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (tecket>0) {

					synchronized (obj) {
						System.out.println(Thread.currentThread().getName()+" "+tecket);
						tecket--;
					}
				}


			}
		}).start();
	}

}
