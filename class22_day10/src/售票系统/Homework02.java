package 售票系统;

import test_thinking.main_1;
/*
 *    网上抢票，方便又高效，很舒服。应用多线程的同步运行可以模拟很多人抢票，
 *    而且不会发生冲突。下面，我们就来利用多线程来模拟一把。
 */

public class Homework02 {

	public Homework02() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {
      
		 //给一把钥匙
		Object obj = new Object();
		WindowThread  thread01 =new WindowThread("窗口一",obj);
		WindowThread  thread02 =new WindowThread("窗口二",obj);
		WindowThread  thread03 =new WindowThread("窗口三",obj);
		
		
		thread01.start();
		thread02.start();
		thread03.start();
		
		
	}

}
