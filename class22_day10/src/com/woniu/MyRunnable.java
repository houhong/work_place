package com.woniu;

/*
 * �߳�
 */
public class MyRunnable implements Runnable{

	public MyRunnable() {
		// TODO �Զ����ɵĹ��캯�����
	}


	@Override
	public void run() {
			
		sail();

	}
	public void sail(){

		//��Ʊ
		int i = 0;
		while(true){
			
			if(i>99){
				break;
			}
			System.out.println(Thread.currentThread().getName()+"�ڼ���Ʊ"+(i++));
		}


	}


}
