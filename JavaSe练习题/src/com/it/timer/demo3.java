package com.it.timer;

import java.util.Timer;
import java.util.TimerTask;
/*
 *  安排在指定延迟后执行指定的任务：schedule(TimerTask task,long delay) 
 */

public class demo3 {

	public demo3() {
		// TODO 自动生成的构造函数存根
	}
	
	public static void main(String[] args) {
		
		Timer mTimer = new Timer();
		//延迟10秒后执行任务
		
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
		// TODO 自动生成的方法存根
		System.out.println("hello world");
	}
	
	
	
	
	
	
}
