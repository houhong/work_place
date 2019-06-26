package com.woniu.it.¡∑œ∞Ã‚;

public class Demo2 {

	public Demo2() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {

		Object obj = new Object();

		new Thread( new Runnable() {

			int count =0;
			public void run() {

				while (count<53) {

					synchronized (obj) {

						System.out.print(count++);
						System.out.print(count++);

						try {

							obj.wait();
							obj.notify();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}


					}
				}

			}
		}).start();

		new Thread( new Runnable() {

			int count =65;
			public void run() {
				while(count <91){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}


					synchronized (obj) {
						System.out.print((char)count);
						count++;
						

						obj.notify();
						

						try {
							obj.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
 
					}

				}

			}
		}).start();

	}
}
