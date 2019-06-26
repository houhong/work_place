package com.it.io;


/**

 * Created by sunshanpeng on 2016/9/27.

 */

public class ThreadTest {


	public static final String Lock = "lock";

	public final Object obj = new Object();


	
	/*三、类的static方法和synchronized（该类）块是同步的
	 * 
	 
	方法test2和test4同步
	*/

	synchronized static void test2() throws InterruptedException {

		for (int i = 0; i < 5; i++) {

			Thread.sleep(100);

			System.out.println("test2=" + i);
		}
	}
	
	void test4() throws InterruptedException {

		synchronized (this.getClass()) {

			for (int i = 0; i < 5; i++) {

				Thread.sleep(1000);

				System.out.println("test4=" + i);

			}

		}

	}
	/* 二、同一个对象的synchronized方法和synchronized（this）块是同步的
	 * 

    方法test1和test3同步
    这两个方法的锁都是加在当前对象上
    
    
	 */
	
	synchronized void test1() throws InterruptedException {

		for (int i = 0; i < 5; i++) {

			Thread.sleep(1000);

			System.out.println("test1="+i);

		}

	}

	void test3() throws InterruptedException {

		synchronized (this) {

			for (int i = 0; i < 5; i++) {

				Thread.sleep(1000);

				System.out.println("test3=" + i);

			}

		}

	}


	


	void test5() throws InterruptedException {

		synchronized (Lock) {

			for (int i = 0; i < 5; i++) {

				Thread.sleep(1000);

				System.out.println("test5=" + i);

			}

		}

	}



	void test6() throws InterruptedException {

		synchronized (obj) {

			for (int i = 0; i < 5; i++) {

				Thread.sleep(1000);

				System.out.println("test6=" + i);

			}

		}

	}
  
}

