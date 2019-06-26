package com.woniu.it.练习题;
/*
 * 窗口卖票
 */

public class Demo6 {

	//线程共享的数据
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
