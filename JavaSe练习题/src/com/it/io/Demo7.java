package com.it.io;

public class Demo7 {


	public Demo7() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		Object obj = new Object();
		//打印数字
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
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}

						obj.notify();


					}
				}

			}
		}).start();

		//打印字母
		new Thread(new Runnable() {

			@Override
			public void run() {

				synchronized (obj) {

					try {
						obj.notify();
						
					} catch (Exception e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					obj.notify();

					for (char i = 'A'; i < 'Z'; i++) {

						System.out.println((char)i +" ");

						try {
							obj.wait();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}

						obj.notifyAll();

					}
				}

			}
		}).start();
	}

}
