package Synchronized;
/*
 * �����߳�ʹ��
 */
public class Test {


	static Resource resource = new Resource();
	
	public Test() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {
		
		Thread t0 = new Thread("����"){
			@Override
			public void run() {

				/*ʹ����Դ */	
				
			while(true){
				try {
					Thread.sleep(1000);
					resource.wc();
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
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
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			
			}
		},"����");
		
		t0.start();
		t1.start();
	}
	

}
