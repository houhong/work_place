package com.it.timer;

import java.util.Timer;
import java.util.TimerTask;
/*
 *  ������ָ���ӳٺ�ִ��ָ��������schedule(TimerTask task,long delay) 
 */

public class demo3 {

	public demo3() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public static void main(String[] args) {
		
		Timer mTimer = new Timer();
		//�ӳ�10���ִ������
		
		mTimer.schedule(new Mycalss(mTimer),5000);
	}
	
	
	
	
	
}

class Mycalss extends TimerTask{

	Timer Timer = new Timer();
	
	
	
	public Mycalss(Timer timer) {
		super();
		Timer = timer;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		System.out.println("hello world");
	}
	
	
	
	
	
	
}
