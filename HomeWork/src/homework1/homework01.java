package homework1;

import org.junit.Test;
/*
 * 22��
 * 
 */

public class homework01 extends MyRunnable{ 

	public homework01() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {

		Thread t0 = new Thread("�ػ��߳�"){

			@Override
			public void run() {
				while(true){
					System.out.println("�����ػ��߳�");
				}
			}

		};
		MyRunnable  myRunnable = new MyRunnable();

		Thread t  = new Thread(myRunnable);
		t.start();
		t0.setDaemon(true);
		t0.start();
		//t.destroy()

	}




}
