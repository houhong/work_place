package com.it.io;

import thread.thread;

public class Demo17 {

	public Demo17() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {

		//������
		Object obj = new Object();

		//�߳�һ
		new Thread(new Runnable() {


			int count = 1;
			@Override
			public void run() {
				
				while(count <53){
					synchronized (obj) {
						//���
						System.out.print(count++);
						System.err.print(count++);
						
						
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

		//�̶߳� д��ĸ
		new Thread(new Runnable() {


			int count =65;//A
			@Override
			public void run() {

				//д��ĸ
				while (count<91) {


					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  
					
					synchronized (obj) {
					    System.err.print((char)count + " ");
					    count++;
					    
					    obj.notify();
					}
					
				}

			}
		}).start();


	}

}
