package Io_��ϰ��;
/*
 * implements
 */

public class MythreadImplentsRunnable implements Runnable{

	public MythreadImplentsRunnable() {
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������

	}


	public static void main(String[] args) {

		MythreadImplentsRunnable mythreadImplentsRunnable = new MythreadImplentsRunnable();

		Thread myThread = new Thread(mythreadImplentsRunnable);
		myThread.start();



	}

}
