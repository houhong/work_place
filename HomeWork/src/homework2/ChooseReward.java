package homework2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;
/*
 * 	抽奖箱
 */

public class ChooseReward {

	public ChooseReward() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {


		Thread t0 =new Thread(){

			@Override
			public void run() {
				int i=0;
				while(true){
					//数据
					Thread thread =Thread.currentThread();
					thread.setName("抽奖箱1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					int[] arr =new int[]{10,5,20,100,200,500,800,2,80,300};	
					Random random = new Random();
					int j =random.nextInt(10);
					int money=arr[j];

					System.out.println(thread.getName()+ "\t" + "又产生了一个"+money+"元大奖");
					i++;
					if(i>10){
						break;
					}
				}


			}	
		};
		Thread t1 =new Thread(new Runnable() {

			@Override

			public void run() {
				int i=0;
				while(true){
					int[] arr =new int[]{10,5,20,100,200,500,800,2,80,300};	

					Thread thread =Thread.currentThread();
					thread.setName("抽奖箱2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}

					String  newthread =thread.getName();
					Random random = new Random();
					int j =random.nextInt(10);
					int money=arr[j];

					System.out.println(newthread + "\t" + "又产生了一个"+money+"元大奖");

					// random.
					// TODO 自动生成的方法存根}
					i++;
					if(i>10){
						break;
					}
				}

			}
		});

		t0.start();
		t1.start();
	}


}
