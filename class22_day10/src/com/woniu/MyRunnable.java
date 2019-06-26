package com.woniu;

/*
 * 线程
 */
public class MyRunnable implements Runnable{

	public MyRunnable() {
		// TODO 自动生成的构造函数存根
	}


	@Override
	public void run() {
			
		sail();

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
