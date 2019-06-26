package com.it.io;

public class Demo8 {

	public Demo8() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		Object obj = new Object();

		//字母
		new Thread(new Runnable() {

			@Override
			public void run() {

				int count = 65;// == A
				while (count<91) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					synchronized (obj) {
						
						System.out.println((char)count);
						
						count++;
						obj.notify();
						
						try {
							obj.wait();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}

				}	
				

			


			}
		}).start();


		//数字
		new Thread(new Runnable() {

			@Override
			public void run() {

				synchronized (obj) {

					for (int i = 0; i < 52; i++) {

						System.out.println(i++);
						System.out.println(i++);

						obj.notify();

						try {
							obj.wait();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}


					}


				}

			}
		}).start();





		
	}

}
