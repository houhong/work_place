package test_thinking;
/*
 * ���߳�
 */

public class main_1 {

	public main_1() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
     public static void main(String[] args) {
		
    	 //һ��Կ��  --��ʲô��Կ�ף�
    	 Test key1  =  new Test();
    	 Test key2 = new Test();
    	 
    	 
    	 //�߳�һ��
    	Thread t0 = new Thread("����"){

    		 
			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				//test1()�����Ķ���
				key1.test5();
			}
    		 
    	 };
    	 
    	 //�̶߳���
     	Thread t1 = new Thread("����"){

     		 
 			@Override
 			public void run() {
 				// TODO �Զ����ɵķ������
 				key2.test5();
 			}
     		 
     	 };
     	 
     	 //�����߳�
    	t0.start();
    	t1.start();
    	 
	}
     
	
	

}
