package duoxiancheng;

public class test{

	public test() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		MyTnread myThread = new MyTnread();
		MyThread2 myThread2 = new MyThread2();
		Thread thread2 = new Thread(myThread2);
		Thread thread1 = new Thread(myThread);
		thread1.start();//线程开启
		thread2.start();//县城开启
		String name=thread1.getName();

		for (int i = 0; i < 100; i++) {
			
			System.out.println("主线程 - ----");
		}
	}

}
