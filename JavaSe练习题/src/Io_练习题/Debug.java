package Io_��ϰ��;
/*
 * ���߳�Debug
 */


public class Debug extends Thread{

	public Debug() {
		// TODO �Զ����ɵĹ��캯�����
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
