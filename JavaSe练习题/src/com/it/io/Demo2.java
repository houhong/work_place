package com.it.io;
/*
 
 */

public class Demo2 {

	public boolean flag= true;
	public Demo2() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			public void run() {
				
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				
			}
		}).start();
	}

}
