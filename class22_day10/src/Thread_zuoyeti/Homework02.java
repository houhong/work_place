package Thread_zuoyeti;

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

		//线程一
		Thread t0 = new Thread("线程一"){



			@Override
			public void run() {
				// TODO 自动生成的方法存根
				super.run();
			}

		};

		Thread t1 = new Thread("线程二"){



			@Override
			public void run() {
				// TODO 自动生成的方法存根
				super.run();
			}

		};
		
		
	}

}
