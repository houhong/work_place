package homework;

public class Test {

	public Test() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		Mutex mutex = new  Mutex();
		
		//创建线程A  和B
		Thread_A thread1 = new Thread_A(mutex);
		Thread_B thread2 = new Thread_B(mutex);

		Thread thread_A = new Thread(thread1);
		Thread thread_B = new Thread(thread2);

		//开启线程
		thread_A.start();
		thread_B.start();



	}
}
