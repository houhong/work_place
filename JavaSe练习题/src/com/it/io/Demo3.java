
package com.it.io;



/**

 * Created by SunYuqin in 2018/8/9

 * Description:

 * ���������̣߳�����һ�����1-52������һ�����A-Z�������ʽҪ��12A 34B 56C 78D����

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


