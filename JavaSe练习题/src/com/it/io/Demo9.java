package com.it.io;
/*
 * 利用睡眠机制
 */
public class Demo9 {

	public Demo9() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {

		Object obj = new Object();//锁

		//数字
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
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
						
					
					}

				}

			}
		}).start();


		//字母	
		new Thread(new Runnable() {

			int count = 65;//A
			@Override
			public void run() {
				while(count<91){
					//先睡眠此线程
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					
					//拿到obj 才能进入下面代码块
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
