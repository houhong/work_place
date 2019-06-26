package com.woniu.it.练习题;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.junit.Test;

import String练习题.string;

/*
 *   4、某公司组织年会,会议入场时有两个入口,在入场时每位员工都能获取一张双色球彩票,
 *   假设公司有100个员工,
 *   利用多线程模拟年会入场过程,
 并分别统计每个入口入场的人数,以及每个员工拿到的彩票的号码。线程运行后打印格式如下：
 编号为: 2 的员工 从后门 入场! 拿到的双色球彩票号码是: [17, 24, 29, 30, 31, 32, 07]
 编号为: 1 的员工 从后门 入场! 拿到的双色球彩票号码是: [06, 11, 14, 22, 29, 32, 15]
 //.....
 从后门入场的员工总共: 13 位员工
 从前门入场的员工总共: 87 位员工

 */

public class Demo5 {


	public Demo5() {
		// TODO Auto-generated constructor stub
	}


	public static String getDoubleBall(){


		//初始化
		String[] redBall = new String[33];

		for (int i = 0; i < 10; i++) {

			String str = "红0"+i+",";
			redBall[i] =str;
		}
		for (int i = 10; i < 33; i++) {

			if (i<32) {
				String str = "红"+i+",";
				redBall[i] =str;
			}
			if (i==32) {
				String str = "红"+i+",";
				redBall[i] =str;
			}


		}


		String[] blueBall = new String[10];
		//初始化蓝球
		for (int i = 0; i < 10; i++) {

			if (i<9) {
				String str = "蓝0"+i+",";
				blueBall[i] =str;
			}
			if (i==9) {
				String str = "蓝0"+i+",";
				blueBall[i] =str;
			}


		}
		/*for (String string : blueBall) {
			System.out.println(string);
		}
		for (String string : redBall) {
			System.out.println(string);
		}*/


		//得到彩票
		Set<String> doubleBall = new HashSet<>();
		Random rand = new Random();

		int i=0;
		while (doubleBall.size()<6) {
			doubleBall.add(redBall[rand.nextInt(redBall.length)]);
			i++;
		}
		doubleBall.add(blueBall[rand.nextInt(blueBall.length)]);
		StringBuffer sb = new StringBuffer();
		for (String string : doubleBall) {

			sb.append("["+string+"]");
		}

		return sb.toString();


	}
	public static  int countEmployee = 100;
	public static  int before = 0;
	public static  int after =  0;
	@Test
	public void Test(){
		
	}
	public static void main(String[] args) {


		getDoubleBall();


		Object obj = new Object();//锁


		Thread t0 = new Thread(){

			@Override
			public void run() {
				
				while (countEmployee>1) {
					
					synchronized (obj) {
						String caipiao=getDoubleBall();
						System.out.println(" 编号为: "+countEmployee+"的员工 从后门 入场! 拿到的双色球彩票号码是: "+ caipiao);	
						countEmployee--;
						after++;
					}
				}
				if (countEmployee==0) {
					System.out.println("后门是："+after);
					System.out.println("前门是："+before);
				}

			}

		};
		
		//前门
		Thread t1 = new Thread(){

			@Override
			public void run() {
				
				while (countEmployee>1) {
					
					synchronized (obj) {
						String caipiao = getDoubleBall();
						System.out.println(" 编号为: "+countEmployee+"的员工 前门 入场! 拿到的双色球彩票号码是: "+caipiao );	
						countEmployee--;
						before++;
					}
					if(countEmployee ==0){
						System.out.println("后门人数"+after);
						System.out.println("前门人数"+before);
					}
					
					
				}	
				/*if (countEmployee==0) {
					System.out.println("后门是："+after);
					System.err.println("前门是："+before);
				}*/


			}

		};
		
		t0.start();
		t1.start();
		

		/*	//前门
		new Thread(new Runnable() {

			@Override
			public void run() {

				while (countEmployee>0) {

					synchronized (obj) {

						System.out.println(" 编号为: "+countEmployee+"的员工 从后门 入场! 拿到的双色球彩票号码是: "+ getDoubleBall());				

					}


				}


			}
		}).start();


		//后门
		new Thread(new Runnable() {

			@Override
			public void run() {

				while(countEmployee>0){

					synchronized (obj) {


					}
				}


			}
		}).start();*/

	}

}
class Employee{

	private int num;
	private Set<String> douBall;


	public Employee() {

	}


	public Employee(int num, Set<String> douBall) {

		this.num = num;
		this.douBall = douBall;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public Set<String> getDouBall() {
		return douBall;
	}


	public void setDouBall(Set<String> douBall) {
		this.douBall = douBall;
	}


	@Override
	public String toString() {
		return "Employee [num=" + num + ", douBall=" + douBall + ", getNum()="
				+ getNum() + ", getDouBall()=" + getDouBall() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}




}


