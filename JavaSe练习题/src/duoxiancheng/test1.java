package duoxiancheng;

import org.omg.PortableInterceptor.IORInterceptor;

public class test1 {

	public test1() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {
		
		
		//�̳�
		Thread  t1=	new Thread(){

			public void run(){
				for(int i=0;i<100; i++){
					
					System.out.println("hello && ���");
					
				}
			}
		};

		//�ӿ�
		Thread t2 =	new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<100; i++){

					System.out.println("лл && thank you ");
				}
			}
		});
		//�����߳�
		
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		t2.start();
	}

}
