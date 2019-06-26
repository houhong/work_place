package homework1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyRunnable implements Runnable {


	public String tieme(){
		SimpleDateFormat sdf  = new SimpleDateFormat("YYYY年MM月dd日  HH时MM分ss秒");	
		Date date = new Date();
		/*System.out.println(date);*/
		String date1=sdf.format(date);
		return date1;

	}
	public MyRunnable() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void run() {

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 100; i++) {
			Scanner scanner = new Scanner(System.in);
			//String  sc      =s
			Thread currentThread = Thread.currentThread();
			
			System.out.println(currentThread.getName()+"进入了网吧"+tieme());
		}
		long  endTime  =System.currentTimeMillis();

		System.out.println((endTime-startTime));

	}

}
