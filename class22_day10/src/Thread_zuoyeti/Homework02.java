package Thread_zuoyeti;

import test_thinking.main_1;
/*
 *    ������Ʊ�������ָ�Ч���������Ӧ�ö��̵߳�ͬ�����п���ģ��ܶ�����Ʊ��
 *    ���Ҳ��ᷢ����ͻ�����棬���Ǿ������ö��߳���ģ��һ�ѡ�
 */

public class Homework02 {

	public Homework02() {
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
