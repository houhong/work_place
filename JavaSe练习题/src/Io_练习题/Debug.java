package Io_练习题;
/*
 * 多线程Debug
 */


public class Debug extends Thread{

	public Debug() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName()+"hello world");
	}

	public static void main(String[] args) {

		Debug debug01 =  new Debug();
		
		Debug debug02 =  new Debug();
		
		Debug debug03 =  new Debug();
		
		Debug debug04 =  new Debug();
		
		Debug debug05 =  new Debug();
		
		debug01.start();
		debug02.start();
		debug03.start();
		debug04.start();
		debug05.start();
	
		


	}
}
