package duoxiancheng;

import org.omg.PortableInterceptor.IORInterceptor;

public class test1 {

	public test1() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {
		
		
		//继承
		Thread  t1=	new Thread(){

			public void run(){
				for(int i=0;i<100; i++){
					
					System.out.println("hello && 你好");
					
				}
			}
		};

		//接口
		Thread t2 =	new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<100; i++){

					System.out.println("谢谢 && thank you ");
				}
			}
		});
		//开启线程
		
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		t2.start();
	}

}
