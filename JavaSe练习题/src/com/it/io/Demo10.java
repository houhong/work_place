package com.it.io;


public class Demo10 {

	public Demo10() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		Object obj = new Object();

		//数字
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
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}

					}
				}


			}
		}).start();

		//字母
		new Thread(new Runnable() {

			int count =65 ;
			@Override
			public void run() {
				
				while(count<91){

					try {

						Thread.sleep(50);

					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}

					//当前线程拿到obj 。才执行synchronized后面的内容
					
					synchronized (obj) {

						System.out.print( (char)count + " ");
						
						count++;
						
						obj.notify();
						
						
						/*try {
							obj.wait();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
*/
					}

				}
			}
		}).start();



	}

}
