package it.thread.package2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * fixThreadPool
 */

public class Demo2 {

	public Demo2() {
		// TODO Auto-generated constructor stub
	}
	
	//�̶����̳߳�
	public static void fixThreadPool(){
		
		int nThread = 3;//��ʼ���̳߳��е��̸߳���
		
		ExecutorService nctp = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 10; i++) {
			
			final int index = i;
			
			nctp.execute(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(index);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			
			
		}
		
		
		
		
		
		
		
	}

}
