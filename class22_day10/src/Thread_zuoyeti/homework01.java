package Thread_zuoyeti;

import test_thinking.main_1;
/*
 * PO1 创建两个线程，其中一个输出1-52，另外一个输出A-Z。
 * 
 * v   输出格式要求：12A 34B 56C 78D
 */

public class homework01 {

	public homework01() {
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
