package Io_练习题;
/*
 * implements
 */

public class MythreadImplentsRunnable implements Runnable{

	public MythreadImplentsRunnable() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根

	}


	public static void main(String[] args) {

		MythreadImplentsRunnable mythreadImplentsRunnable = new MythreadImplentsRunnable();

		Thread myThread = new Thread(mythreadImplentsRunnable);
		myThread.start();



	}

}
