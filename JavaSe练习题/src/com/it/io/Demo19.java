package com.it.io;
/*
 * 三个线程跑 ABC ABC ABC ABC
 */

public class Demo19 {

	public Demo19() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {

		String[] key = new String[]{"A"};

		//创建一个线程
		new Thread(new Runnable() {

			int count =0;
			@Override
			public void run() { 

				while (count<9) {

					synchronized (key) {

						if (key[0] == "A") {

							System.out.print("A");
							key[0] = "B";

							count++;
							key.notifyAll();

							try {
								key.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}

				}

			}
		}).start();

		//创建一个线程
		new Thread(new Runnable() {

			int count =0;
			@Override
			public void run() {
				while(count<9){


					synchronized (key) {

						if (key[0] == "B") {

							System.out.print("B");
							key[0]="C";
							count ++;
							key.notifyAll();
							try {
								key.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}

			}
		}).start();

		//创建一个线程
		new Thread(new Runnable() {

			int count =0;
			@Override
			public void run() {
				while(count<9){
					synchronized (key) {

						if (key[0] == "C") {

							System.out.print("C"+" ");
							key[0] ="A";

							count++;;
							key.notifyAll();

							try {
								key.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}


			}
		}).start();

	}

}
