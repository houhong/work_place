package it.threadpool.a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/*
 * 线程池
 */
public class Demo1 {

	public Demo1() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		
		//线程池
		ExecutorService threadPool = Executors.newCachedThreadPool();
		
		//创建新的线程
		threadPool.execute(new Runnable() {
			
			@Override
			public void run() {
				
				
			}
		});
		
		//第二个线程
		threadPool.execute(new Runnable() {
			
			@Override
			public void run() {
				
				
			}
		});
		
		
		
		
	}

}
