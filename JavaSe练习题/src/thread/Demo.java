package thread;

import java.security.PublicKey;

public class Demo {

	public Demo() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {

		test1 t1 = new test1();
		Thread thread =new Thread(){

			@Override
			public void run() {
				t1.function();
			}
		};
	   thread.setName("���");	
	   thread.start();
	}
}
