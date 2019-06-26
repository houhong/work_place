package Io_练习题;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
 * 利用Callable接口创建线程  --有run()方法   ---Callable是一个泛型接口
 */

public class CallableDemo implements Callable<Integer>{

	public CallableDemo() {
		// TODO 自动生成的构造函数存根
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
		
		//callable实列对象
		Callable<Integer> callableDemo = new CallableDemo();
		
		FutureTask<Integer> oneTask = new FutureTask<>(callableDemo);
		
		Thread oneThread = new Thread(oneTask);
		
		oneThread.start();
		
		
		
		
	}












}
