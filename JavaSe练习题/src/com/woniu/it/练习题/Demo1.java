package com.woniu.it.练习题;
/*
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？   
 */

public class Demo1 {

	public Demo1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		//测试：第一个月
		System.out.println(count(10));

	}
	public static int  count(int month){
		
		
		//第三个数是前两个数字之和
		if(month <3){
			return 1;
		}
		return count(month-1)+count(month -2);

	}

}
