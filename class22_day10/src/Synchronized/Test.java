package Synchronized;
/*
 * 开启线程使用
 */
public class Test {


	static Resource resource = new Resource();
	
	public Test() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {
		
		Thread t0 = new Thread("李四"){
			@Override
			public void run() {

				/*使用资源 */	
				
			while(true){
				try {
					Thread.sleep(1000);
					resource.wc();
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				
			}
				
			}

		};


		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(1000);
					resource.wc();
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			
			}
		},"张三");
		
		t0.start();
		t1.start();
	}
	

}
