package com.it.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/*
 * ��ָ����ʱ��������
 */

public class demo2 {

	public demo2() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {
		
		Timer mTimer = new Timer();
	
		
		//����ʱ��
		String time = "2019-5-27 18:24:50";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = sdf.parse(time);
			String time1 =sdf.format(date);
			//System.out.println(time1);
			mTimer.schedule(new Mydemo(mTimer), date);
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		
	}
	

}

class Mydemo extends TimerTask{

	public Timer timer = null;



	public Mydemo(Timer timer) {

		this.timer = timer;
	}

	//�����߳�

	@Override
	public void run() {
		System.out.println("hello world");
		
		timer.cancel();//ȡ����ʱ

	}




}














