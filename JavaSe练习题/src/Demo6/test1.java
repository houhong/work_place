package Demo6;

public class test1 {

	public test1() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {

		Thread t1 =	new Thread("��ǰ�߳�"){
			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				for (int i = 0; i <100; i++) {
					System.out.println(Thread.currentThread().getName()+(i+1)+"%");
				}
			}

		};
		Thread t2  = new Thread(){


			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				try {
					System.out.println("������ɣ���");
					t1.join();

				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}

		};
		t1.start();
		t2.start();
	}
}
