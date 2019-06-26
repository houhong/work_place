
package com.it.io;



/**

 * Created by SunYuqin in 2018/8/9

 * Description:

 * 创建两个线程，其中一个输出1-52，另外一个输出A-Z。输出格式要求：12A 34B 56C 78D……

 **/



public class Demo3 {

	public static void main(String[] args) {

		Object obj = new Object();

		new Thread() {

			@Override

			public void run() {

				synchronized (obj) {

					for (int i = 1; i <= 52; i++) {

						if (i % 2 == 0) {

							System.out.print(i);

							try {

								obj.wait();

							} catch (InterruptedException e) {

								e.printStackTrace();

							}

						} else {

							System.out.print(i);



						}

					}

				}

			}





		}.start();



		new Thread() {

			@Override

			public void run() {

				int i = 65;

				while (i < 91) {

					try {

						Thread.sleep(50);

					} catch (InterruptedException e) {

						e.printStackTrace();

					}

					synchronized (obj) {

						System.out.println((char) i++);

						obj.notify();

					}

				}

			}



		}.start();





	}

}


