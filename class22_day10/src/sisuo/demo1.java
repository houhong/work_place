package sisuo;

import test_thinking.main_1;
/*
 * ����
 * 
 */

public class demo1 {

	public demo1() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static String left ="��߿���";
	public static String right ="�ұ߿���";
	public static void main(String[] args) {


		//�����̣߳�
		Thread t0 = new Thread("�߳�-��"){

			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				synchronized (left) {
					//try {
						//Thread.sleep(1000);
                         System.out.println(Thread.currentThread().getName()+"�õ���߿��ӣ���ʼ���ұ߿���--");
					//} //catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						//e.printStackTrace();
					//}
				
					
					synchronized (right) {
						System.out.println(Thread.currentThread().getName()+"�õ����ұ߿���");
						System.out.println(Thread.currentThread().getName()+"��ʼ�Է�����");

					}
				}
			}

		};


		//�̶߳�
		Thread t1 = new Thread("�̶߳�"){

			@Override
			public void run() {
				/*// TODO �Զ����ɵķ������
			super.run();*/
				synchronized (right) {
					
					System.out.println(Thread.currentThread().getName()+"�õ��ұ߿��ӣ���ʼ����߿���--");
					synchronized (left) {
						System.out.println(Thread.currentThread().getName()+"�õ���߿��ӣ���ʼ���ұ߿���--");
						System.out.println(Thread.currentThread().getName()+"��ʼ�Է�����");
					}

				}
			}

		};
		t0.start();
		t1.start();
	}
}
