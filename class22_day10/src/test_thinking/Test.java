package test_thinking;

import java.nio.channels.spi.AbstractInterruptibleChannel;
/*
 * 锁的理解
 */


public class Test {

	public Test() {
		// TODO 自动生成的构造函数存根
	}

	// 锁对象
	public  synchronized void test1(){

		int i=10;
		while(i>0){

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"锁对象");
			i--;
		}
	}

	//锁对象
	public  void test2(){
		synchronized (this ) {
			int i=10;
			while(i>0){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"锁对象");
				i--;
			}
		}

	}

	//锁对象
	Object obj = new Object();

	public  void test3(){
		synchronized (obj) {

			int i=10;
			while(i>0){

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println("锁对象");
				i--;
			}

		}
	}

	//锁类
	public  static synchronized  void test4(){
		{   
			int i=10;
			while(i>0){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread()+"锁类");
				i--;
			}

		}
	}

	//锁类
	public void test5(){
		synchronized (Test.class) {

			int i=10;
			while(i>0){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread()+"锁类");
				i--;
			}


		}

	}

}
