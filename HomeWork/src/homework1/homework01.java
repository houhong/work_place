package homework1;

import org.junit.Test;
/*
 * 22号
 * 
 */

public class homework01 extends MyRunnable{ 

	public homework01() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		Thread t0 = new Thread("守护线程"){

			@Override
			public void run() {
				while(true){
					System.out.println("我是守护线程");
				}
			}

		};
		MyRunnable  myRunnable = new MyRunnable();

		Thread t  = new Thread(myRunnable);
		t.start();
		t0.setDaemon(true);
		t0.start();
		//t.destroy()

	}




}
