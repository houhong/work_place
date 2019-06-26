package it.woniuxueyuan.utils;

import java.util.Scanner;
/*
 * 输入工具
 */

public class InfoByString {

	public static void main(String[] args) {

		/*Integer text = inToByInteger();
		System.out.println(text);*/
	}
	//1:按照String输入
	public static String inToByString(){

		//按照数组输入
		Scanner scanner = new Scanner(System.in);
		String input  =scanner.next();

		return input;
	}

	//2:按照Integer输入
	public static Integer inToByInteger(){

		Scanner scanner = new Scanner(System.in);
		String input  =scanner.next();
		
		Integer input1 = Integer.parseInt(input);
		return input1;
	}



}
