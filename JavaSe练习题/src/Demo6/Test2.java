package Demo6;

import java.util.Timer;
/*
 * 2、有两个有序的集合，集合的每个元素都是一段范围
             求其交集，例如交集{[4,8],[9,13]}和{[6,12]}的交集
             是{[6,8],[9,12]}
 */
import java.util.TimerTask;

public class Test2 {

	public Test2() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		Timer t = new Timer();



		t.schedule(new TimerTask() {

			@Override
			public void run() {
				System.out.println("延时");

			}
		},1000);
		//System.out.println("输出main");
	}


}
