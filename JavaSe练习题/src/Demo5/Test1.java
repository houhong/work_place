package Demo5;

import thread.thread;

/*
 * 守护线程  ：守护线程是一种在程序后台运行的通用服务，在所有的用户都结束时，才会结束
 * 
 * 注意事项：
 * 1：必须在开启线程之前设置守护线程， 否者会出现非法线程状态亦异常：
 * 2：在守护线程里面的线程也是守护线程
 * 3：守护线程永远不能被设置去访问固态资源，因为会在任意时刻被中断。
 * 
 */

public class Test1 {

	public Test1() {
		// TODO 自动生成的构造函数存根
	}


	public static void main(String[] args) {

		Thread t1=  new Thread(){

			@Override
			public void run() {
				// TODO 自动生成的方法存根
				for (int i = 0; i <10; i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread()+"侯洪");
				}
			}	

		};

		Thread  t2 =  new Thread(new Runnable() {

			@Override
			public void run() {
				while(true){
					System.out.println(Thread.currentThread()+"我是守护线程");
				}

			}
		});
		t1.start();
		t2.setDaemon(true);
		t2.start();


	}

}
