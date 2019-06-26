package com.woniu.it.练习题;
/*
 * 水仙花问题：水仙花，即给定一个三位数，每一位的数字立方加起来等于这个数本身。 
 */

public class Demo10 {

	public Demo10() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		findNum(153);
		
	}

	public static void findNum(int num){
		
		int a=num/100;//百位
		int b=(num/10)%10;//十位
		int c=(num%10);
		
		if((a*a*a +b*b*b +c*c*c) ==num){
			System.out.println("水仙花数");
		}
	}
}
