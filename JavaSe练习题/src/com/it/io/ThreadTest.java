package com.it.io;


/**

 * Created by sunshanpeng on 2016/9/27.

 */

public class ThreadTest {


	public static final String Lock = "lock";

	public final Object obj = new Object();


	
	/*�������static������synchronized�����ࣩ����ͬ����
	 * 
	 
	����test2��test4ͬ��
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
	/* ����ͬһ�������synchronized������synchronized��this������ͬ����
	 * 

    ����test1��test3ͬ��
    �����������������Ǽ��ڵ�ǰ������
    
    
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

