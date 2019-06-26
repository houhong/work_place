package string_demo;


import java.util.Random;
/*
 * 题目：
1. 给定一个字符串,判断该字符串中是否包含某个子串.如果包含,求出子串的所有出现位置.
如:"abcbcbabcb34bcbd"中,"bcb"子串的出现位置为: 1,7,12.字符串和子串均由用户输入
2.给定一个长度,随机产生一个该长度的字符串,由大写,小写字母以及数字组成
Java中随机数的生成:
java.util.Random r = new java.util.Random();
int a = r.nextInt(100): a 0-99的随机数
3.给定一个由数字组成的字符串,如:"1239586838923173478943890234092",统计
出每个数字出现的次数
 */
import java.util.Scanner;

public class string_1 {

	public string_1() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		//Test_1("abcbcbabcb34bcbd", "bcb");
		functon2(10);
	}
	public static void Test_1(String str,String son){


		int index =0;
		while(true){
			if(index  == -1){
				break;
			}
			index=str.indexOf(son,index);
			System.out.println(index);
			index +=son.length();
			//str =str.substring(index);
		}


	}
	/*
	2.给定一个长度,随机产生一个该长度的字符串,由大写,小写字母以及数字组成
	Java中随机数的生成:
	java.util.Random r = new java.util.Random();
	int a = r.nextInt(100): a 0-99的随机数
	 */
	public static void functon2(int len){

		String str = "abcdefghijklmnopqrstuvwxyz";
		//字符数组
		char[] char_1 = new char[str.length()];
		char[] char_2 = new char[str.length()];
		int[]  int_3  =  new int[10];
		byte[] bytes = str.getBytes();

		int len_1 =  0;
		int len_2 = 0;
		for (byte b : bytes) {

			char i=(char)b;

			char_1[len_1++] =i;
			//len_1++;
		}


		for (byte b : bytes) {

			b -=32;
			//  System.out.println(b);

			char i=(char)b;

			char_2[len_2++] =i;

			//System.out.println(i);

		}

		for(int i=0;i<10;i++){

			int_3[i]=i;

		}
		//StringBuffer str1=null;  --错误做法
		StringBuffer str1= new StringBuffer();
		int i =0;
		while(true){


			Random  random  = new Random();
			int index =random.nextInt(char_1.length);

			char small = char_1[index];
			char large = char_2[index];
			
			Random  random1  = new Random();
			int index1 =random1.nextInt(9);
			
			int  number = int_3[index1];


			/*Integer.valueOf(small);
		Integer.valueOf(large);
		Integer.valueOf(number);*/
			/*  错误*/
			//这次错误
			i++;
			str1.append(i);
		
			
			System.out.println(str1.length());
			if(str1.length()==len){
				System.out.println(str1);
				break;
			}

		} 


	}
}
