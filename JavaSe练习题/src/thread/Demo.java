package thread;

import java.security.PublicKey;

public class Demo {

	public Demo() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		test1 t1 = new test1();
		Thread thread =new Thread(){

			@Override
			public void run() {
				t1.function();
			}
		};
	   thread.setName("侯洪");	
	   thread.start();
	}
}
