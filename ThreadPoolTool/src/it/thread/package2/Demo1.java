package it.thread.package2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

/**
 * �̳߳ص���ϰ
 * @author lijialin
 *
 */

public class Demo1 {
	/*
	 * fixedThreadPool����һ��ָ���߳��������̳߳أ�
	 * ����̵߳ĸ��������̳߳����������������������̻߳ᱻ�浽�����еȴ���
	 */

	public static void fixedThreadPoolTest() {
		int nThreads = 3; // �̳߳ص������涨Ϊ3
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(nThreads);
		for(int i = 0; i < 10; i++) {
			final int index = i;
			fixedThreadPool.execute(new Runnable() {// ÿ3�����3��
				public void run() {
					try {
						System.out.println(index);
						Thread.sleep(3000); 
					}catch(InterruptedException  e) {
						e.printStackTrace();
					}
				}
			});
		}
	} 

	public static void cachedThreadPoolTest() {
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		for(int i = 0; i < 10; i++) {
			final int index = i;
			try {
				Thread.sleep(index * 1000); // ȷ��ÿ���̶߳���ִ��������
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			cachedThreadPool.execute(new Runnable(){
				public void run() {
					System.out.println(index);
				}
			});
		}   
	}

	public static void scheduledThreadPool() {
		int corePoolSize = 3; // �̳߳ش�СΪ3
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(corePoolSize);
		scheduledThreadPool.scheduleAtFixedRate(new Runnable(){ // ִ�������Ե�����
			public void run() {
				System.out.println("delay 3 seconds"); 
			}
		}, 1, 3,TimeUnit.SECONDS); // �ӳ�1s��ÿ3sִ��һ��
	}

	public static void singleThreadExecutor() {
		// ����Ψһ���߳�
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		for(int i = 0; i < 10; i++) {
			final int index = i;
			singleThreadExecutor.execute(new Runnable(){ // ��˳��ִ��
				public void run() {
					try{
						System.out.println(index);
						Thread.sleep(2000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fixedThreadPoolTest();
		cachedThreadPoolTest();
		scheduledThreadPool();
		singleThreadExecutor();
	}

}

