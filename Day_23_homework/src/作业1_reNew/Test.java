package 作业1_reNew;
/*
 * 测试
 */

public class Test {

	public Test() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		Mutex mutex = new Mutex();//钥匙
		Thread_1 thread_1 = new Thread_1(mutex);
		Thread_2 thread_2 = new Thread_2(mutex);
		
		Thread thread_A =new Thread(thread_1);
		Thread thread_B =new Thread(thread_2);
		
		thread_A.start();
		thread_B.start();
		
	}

}
