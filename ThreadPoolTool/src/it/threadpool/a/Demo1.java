package it.threadpool.a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/*
 * �̳߳�
 */
public class Demo1 {

	public Demo1() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		
		//�̳߳�
		ExecutorService threadPool = Executors.newCachedThreadPool();
		
		//�����µ��߳�
		threadPool.execute(new Runnable() {
			
			@Override
			public void run() {
				
				
			}
		});
		
		//�ڶ����߳�
		threadPool.execute(new Runnable() {
			
			@Override
			public void run() {
				
				
			}
		});
		
		
		
		
	}

}
