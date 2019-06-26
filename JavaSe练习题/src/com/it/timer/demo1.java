package com.it.timer;

import java.util.Timer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;



/*
 * ��ʱ������ϰ��
 * 
 *  Timer��һ�ֶ�ʱ�����ߣ�������һ����̨�̼߳ƻ�ִ��ָ������
 *  �����԰�������ִ��һ�Ρ����߶��ڡ�ִ�ж�Ρ���                     
 *   Ȼ����ʵ�ʵĿ������̵��У�������ҪһЩ�����ԵĲ�����
 *   ����ÿ5����ִ��ĳһ�����ȡ�     
 *   ���������Ĳ�����㡢��Ч��ʵ�ַ�ʽ����ʹ��java.util.Timer�����ࡣ
    --------------------- 

 */
/*
 *    1�� ��ָ����ʱ����ĳ�£�ֻ��һ�Σ���
 *     schedule(TimerTask task, Date time) 
         Դ�밸������
 */
public class demo1 {

	public demo1() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {

		Timer mTimer = new Timer();
		//�趨ʱ��
		String time = "2019-5-27 18:05:00";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = sdf.parse(time);
			//System.out.println(	sdf.format(date));
		
			
			//ִ������
			mTimer.schedule(new Myclass(mTimer), date);
		

		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		


	}
}
class Myclass extends TimerTask{

	Timer timer = null;
	public Myclass() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public Myclass(Timer timer){
		
		this.timer = timer ;
	}
	@Override
	public void run() {
		
	//�ڹ涨ʱ����ͬ��������
		System.out.println("hello world");
		
		timer.cancel();
		
	}
	
	
	
}




