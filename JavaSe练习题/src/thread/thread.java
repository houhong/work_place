package thread;

public class thread {

	public thread() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {
		Test test = new Test();
		//继承 --- 匿名内部类
		Thread thread=new Thread(){
			
			@Override
			public void run(){
				test.test();
			}
		};
		
		
		thread.setName("侯洪");
		thread.start();
	}

}
