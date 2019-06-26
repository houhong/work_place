package sisuo;

import test_thinking.main_1;
/*
 * 死锁
 * 
 */

public class demo1 {

	public demo1() {
		// TODO 自动生成的构造函数存根
	}
	public static String left ="左边筷子";
	public static String right ="右边筷子";
	public static void main(String[] args) {


		//开启线程：
		Thread t0 = new Thread("线程-："){

			@Override
			public void run() {
				// TODO 自动生成的方法存根
				synchronized (left) {
					//try {
						//Thread.sleep(1000);
                         System.out.println(Thread.currentThread().getName()+"拿到左边筷子，开始抢右边筷子--");
					//} //catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						//e.printStackTrace();
					//}
				
					
					synchronized (right) {
						System.out.println(Thread.currentThread().getName()+"拿到了右边筷子");
						System.out.println(Thread.currentThread().getName()+"开始吃饭！！");

					}
				}
			}

		};


		//线程二
		Thread t1 = new Thread("线程二"){

			@Override
			public void run() {
				/*// TODO 自动生成的方法存根
			super.run();*/
				synchronized (right) {
					
					System.out.println(Thread.currentThread().getName()+"拿到右边筷子，开始抢左边筷子--");
					synchronized (left) {
						System.out.println(Thread.currentThread().getName()+"拿到左边筷子，开始抢右边筷子--");
						System.out.println(Thread.currentThread().getName()+"开始吃饭！！");
					}

				}
			}

		};
		t0.start();
		t1.start();
	}
}
