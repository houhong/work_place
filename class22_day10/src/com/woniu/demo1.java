package com.woniu;
/*
 * talking is less,show me your code
 * 线程安全：
 */

public class demo1 extends MyRunnable{

	public demo1() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {



		Thread t1 =new Thread("窗口一"){

			@Override
			public void run() {

				// TODO 自动生成的方法存根
				//卖票
				int i = 0;
				while(true){

					if(i>99){
						break;
					}
					System.out.println(Thread.currentThread().getName()+"第几张票"+(i++));
				}

			}

		};
		MyRunnable myRunnable = new MyRunnable();

		Thread t2 = new Thread(myRunnable);

		t1.start();
		t2.start();

	}

	public void sail(){

		//卖票
		int i = 0;
		while(true){

			if(i>99){
				break;
			}
			System.out.println(Thread.currentThread().getName()+"第几张票"+(i++));
		}


	}
}
