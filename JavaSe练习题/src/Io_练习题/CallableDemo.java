package Io_��ϰ��;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
 * ����Callable�ӿڴ����߳�  --��run()����   ---Callable��һ�����ͽӿ�
 */

public class CallableDemo implements Callable<Integer>{

	public CallableDemo() {
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public Integer call() throws Exception {

		int i = 10;
		for (int j = 0; j < i; j++) {

			System.out.println(j);


		}
		return i;
	}
	
	
	public static void main(String[] args) {
		
		//callableʵ�ж���
		Callable<Integer> callableDemo = new CallableDemo();
		
		FutureTask<Integer> oneTask = new FutureTask<>(callableDemo);
		
		Thread oneThread = new Thread(oneTask);
		
		oneThread.start();
		
		
		
		
	}












}
