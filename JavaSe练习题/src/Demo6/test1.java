package Demo6;

public class test1 {

	public test1() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {

		Thread t1 =	new Thread("当前线程"){
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				for (int i = 0; i <100; i++) {
					System.out.println(Thread.currentThread().getName()+(i+1)+"%");
				}
			}

		};
		Thread t2  = new Thread(){


			@Override
			public void run() {
				// TODO 自动生成的方法存根
				try {
					System.out.println("下载完成！！");
					t1.join();

				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}

		};
		t1.start();
		t2.start();
	}
}
