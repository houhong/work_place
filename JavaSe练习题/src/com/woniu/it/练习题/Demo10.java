package com.woniu.it.��ϰ��;
/*
 * ˮ�ɻ����⣺ˮ�ɻ���������һ����λ����ÿһλ����������������������������� 
 */

public class Demo10 {

	public Demo10() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		findNum(153);
		
	}

	public static void findNum(int num){
		
		int a=num/100;//��λ
		int b=(num/10)%10;//ʮλ
		int c=(num%10);
		
		if((a*a*a +b*b*b +c*c*c) ==num){
			System.out.println("ˮ�ɻ���");
		}
	}
}
