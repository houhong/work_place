package thread;

public class thread {

	public thread() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {
		Test test = new Test();
		//�̳� --- �����ڲ���
		Thread thread=new Thread(){
			
			@Override
			public void run(){
				test.test();
			}
		};
		
		
		thread.setName("���");
		thread.start();
	}

}
