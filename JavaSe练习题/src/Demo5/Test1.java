package Demo5;

import thread.thread;

/*
 * �ػ��߳�  ���ػ��߳���һ���ڳ����̨���е�ͨ�÷��������е��û�������ʱ���Ż����
 * 
 * ע�����
 * 1�������ڿ����߳�֮ǰ�����ػ��̣߳� ���߻���ַǷ��߳�״̬���쳣��
 * 2�����ػ��߳�������߳�Ҳ���ػ��߳�
 * 3���ػ��߳���Զ���ܱ�����ȥ���ʹ�̬��Դ����Ϊ��������ʱ�̱��жϡ�
 * 
 */

public class Test1 {

	public Test1() {
		// TODO �Զ����ɵĹ��캯�����
	}


	public static void main(String[] args) {

		Thread t1=  new Thread(){

			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				for (int i = 0; i <10; i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread()+"���");
				}
			}	

		};

		Thread  t2 =  new Thread(new Runnable() {

			@Override
			public void run() {
				while(true){
					System.out.println(Thread.currentThread()+"�����ػ��߳�");
				}

			}
		});
		t1.start();
		t2.setDaemon(true);
		t2.start();


	}

}
