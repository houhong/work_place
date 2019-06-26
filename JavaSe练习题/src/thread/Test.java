package thread;
/*
 * 5月22日
 */

public class Test {

	public Test() {
		// TODO 自动生成的构造函数存根
	}
    public void test(){
    	for (int i = 0; i < 100; i++) {
    		//得到当前线程
			Thread thread =Thread.currentThread();
			//System.out.println(thread.getName());
			System.out.println(thread );
			
			try {
				thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("这个线程  一");
		}
    }
}
