package com.it.timer;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;
/*
 *  安排指定的任务在“指定的延迟”后开始进行“重复”的固定延迟执行：
 *  
 */

public class demo4 {

	public demo4() {
		// TODO 自动生成的构造函数存根


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
		// TODO 自动生成的方法存根
		System.out.println("hello wolrd ");
	}
}
