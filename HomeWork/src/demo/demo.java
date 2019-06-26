package demo;

public class demo {

	public demo() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		
		

		Thread t1=new Thread(){

			@Override
			public void run() {
				// TODO 自动生成的方法存根
				
				System.out.println("我喜欢你！！");
	
			}

		};
		Thread t2 =	new Thread(new Runnable() {

			@Override
			public void run() {
				
				try {
					t1.join();//没有开线程的话，就不会执行
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println("我也喜欢ni");
				

			}
		});
		t2.start();
		t1.start();
		
	}

}
