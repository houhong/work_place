package com.woniu.it.��ϰ��;
/*
 * ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
 * С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�   
 */

public class Demo1 {

	public Demo1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		//���ԣ���һ����
		System.out.println(count(10));

	}
	public static int  count(int month){
		
		
		//����������ǰ��������֮��
		if(month <3){
			return 1;
		}
		return count(month-1)+count(month -2);

	}

}
