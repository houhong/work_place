package homework;
/*
 *   ���2���� 
 */
public class Thread_A implements Runnable{

	Mutex obj ;
	//׼������

	public Thread_A(Mutex obj) {
		this.obj =obj;// TODO �Զ����ɵĹ��캯�����
	}

	public Thread_A() {
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void run() {
		//�����������
		while(true){
			synchronized (obj) {

				//�����־λΪtrue,�߳�B����
				if(obj.flag==true){
					obj.notify();
					obj.flag=false;
				}	

				int[] numArray =new int[52];
				for (int i = 0; i < 52; i++) {

					numArray[i] = (i+1);
				}


				System.out.println("�����߳�A");	

				try {
					wait();
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}

			}

		}
	}

}


