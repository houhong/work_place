package com.it.timer;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;
/*
 *  ����ָ���������ڡ�ָ�����ӳ١���ʼ���С��ظ����Ĺ̶��ӳ�ִ�У�
 *  
 */

public class demo4 {

	public demo4() {
		// TODO �Զ����ɵĹ��캯�����


	}
	
	public static void main(String[] args) {
		
		Timer mTimer = new Timer();
		
		mTimer.schedule(new Myclass01(), 1000,3000);
	}
	
	
	
	
	


}

class Myclass01 extends TimerTask{

	//Timer timer = new Timer();
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		System.out.println("hello wolrd ");
	}
}
