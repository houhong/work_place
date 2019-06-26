package com.it.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/*
 * 在指定的时间做事情
 */

public class demo2 {

	public demo2() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {
		
		Timer mTimer = new Timer();
	
		
		//设置时间
		String time = "2019-5-27 18:24:50";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = sdf.parse(time);
			String time1 =sdf.format(date);
			//System.out.println(time1);
			mTimer.schedule(new Mydemo(mTimer), date);
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
	}
	

}

class Mydemo extends TimerTask{

	public Timer timer = null;



	public Mydemo(Timer timer) {

		this.timer = timer;
	}

	//就是线程

	@Override
	public void run() {
		System.out.println("hello world");
		
		timer.cancel();//取消定时

	}




}














