package duoxiancheng;

public class test{

	public test() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {

		MyTnread myThread = new MyTnread();
		MyThread2 myThread2 = new MyThread2();
		Thread thread2 = new Thread(myThread2);
		Thread thread1 = new Thread(myThread);
		thread1.start();//�߳̿���
		thread2.start();//�سǿ���
		String name=thread1.getName();

		for (int i = 0; i < 100; i++) {
			
			System.out.println("���߳� - ----");
		}
	}

}
