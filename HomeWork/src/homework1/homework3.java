package homework1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class homework3 {

	public homework3() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {

		//t1为守护线程
		Thread t1 =new Thread("守护线程"){

			@Override
			public void run() {
				// TODO 自动生成的方法存根

				while(true){

					System.out.println("我是守护线程");
				}
			}

		};

		Thread t2 = new Thread( new Runnable() {

			@Override
			public void run() {
				// TODO 自动生成的方法存根
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
		});
		t2.start();
		t1.setDaemon(true);
		t1.start();
	
	}

	public static String tieme(){
		SimpleDateFormat sdf  = new SimpleDateFormat("YYYY年MM月dd日  HH时MM分ss秒");	
		Date date = new Date();
		/*System.out.println(date);*/
		String date1=sdf.format(date);
		return date1;

	}

}
