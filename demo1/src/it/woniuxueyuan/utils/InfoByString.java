package it.woniuxueyuan.utils;

import java.util.Scanner;
/*
 * ���빤��
 */

public class InfoByString {

	public static void main(String[] args) {

		/*Integer text = inToByInteger();
		System.out.println(text);*/
	}
	//1:����String����
	public static String inToByString(){

		//������������
		Scanner scanner = new Scanner(System.in);
		String input  =scanner.next();

		return input;
	}

	//2:����Integer����
	public static Integer inToByInteger(){

		Scanner scanner = new Scanner(System.in);
		String input  =scanner.next();
		
		Integer input1 = Integer.parseInt(input);
		return input1;
	}



}
