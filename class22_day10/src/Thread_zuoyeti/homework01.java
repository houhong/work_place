package Thread_zuoyeti;

import test_thinking.main_1;
/*
 * PO1 ���������̣߳�����һ�����1-52������һ�����A-Z��
 * 
 * v   �����ʽҪ��12A 34B 56C 78D
 */

public class homework01 {

	public homework01() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {

		//�߳�һ
		Thread t0 = new Thread("�߳�һ"){



			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				super.run();
			}

		};

		Thread t1 = new Thread("�̶߳�"){



			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				super.run();
			}

		};
		
		
	}

}
