package com.it.timer;

import java.util.Timer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;



/*
 * 定时器的练习：
 * 
 *  Timer是一种定时器工具，用来在一个后台线程计划执行指定任务。
 *  它可以安排任务“执行一次”或者定期“执行多次”。                     
 *   然而在实际的开发过程当中，经常需要一些周期性的操作，
 *   比如每5分钟执行某一操作等。     
 *   对于这样的操作最方便、高效的实现方式就是使用java.util.Timer工具类。
    --------------------- 

 */
/*
 *    1、 在指定的时间做某事（只做一次）：
 *     schedule(TimerTask task, Date time) 
         源码案例如下
 */
public class demo1 {

	public demo1() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		Timer mTimer = new Timer();
		//设定时间
		String time = "2019-5-27 18:05:00";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = sdf.parse(time);
			//System.out.println(	sdf.format(date));
		
			
			//执行任务
			mTimer.schedule(new Myclass(mTimer), date);
		

		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		


	}
}
class Myclass extends TimerTask{

	Timer timer = null;
	public Myclass() {
		// TODO 自动生成的构造函数存根
	}
	public Myclass(Timer timer){
		
		this.timer = timer ;
	}
	@Override
	public void run() {
		
	//在规定时间做同样的事情
		System.out.println("hello world");
		
		timer.cancel();
		
	}
	
	
	
}




