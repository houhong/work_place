package ��ҵ1_reNew;
/*
 * ���һ����ĸ
 */

public class Thread_2 extends Thread{


	Mutex mutex;
	int index = 0;
	char[] charArr = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	public Thread_2(Mutex mutex) {
		this.mutex = mutex;
	}

	public Thread_2() {
		// TODO �Զ����ɵĹ��캯�����
	}


	@Override
	public void run() {
		// TODO �Զ����ɵķ������


		while(index<26){
			synchronized (mutex) {

				if (mutex.flag == true) {


					char ch = charArr[index];
					System.out.println(ch+ " ");
					index++;
					mutex.setSynchrnized(false);
					mutex.notify();
					try {
						mutex.wait();
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				} else {
					//�����õ�Կ��  -- ����Ҫ�ȴ��ô��̻߳ص��ȴ��б�
					mutex.notify();
					try {
						mutex.wait();


					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}


				}
			}

		}

	}


}
