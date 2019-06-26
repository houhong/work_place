package com.woniu.it.练习题;
/*
 * 练习题  1：用迭代的方法，判断是不是一个回文字符串，如”abdba”

 */

public class Demo3 {

	public Demo3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		System.out.println(function("abcdcba"));


	}

	public static boolean function(String str){

		int count =str.length()-1;

		char[] arr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {

			arr[count--] = str.charAt(i);
		}
		String  after = String.valueOf(arr);

		if (str.equals(after)) {

			return true;
		}
		return false;
	}

}


/**
 * 用迭代的方法，判断是不是一个回文字符串，如”abdba”
 * @author BZ70000910
 *
 */
class AbcbA {
	public static void main(String [] args){
		AbcbA instance = new AbcbA();
		System.out.println(instance.isAbcbA("abcba"));
	}

	public boolean isAbcbA(String str){

		while(str.length() > 1){
			int length = str.length();
			char first = str.charAt(0);
			char last = str.charAt(length - 1);
			if(first == last){
				String strcpy = str.substring(1, length - 1);
				System.out.println(strcpy);				
				isAbcbA(strcpy);
			}else{
				return false;				
			}
			//不加break,就会进入死循环,因为退出循环也是一层一层的。做改错题肯定有意思。
			break;
		}
		return true;
	}
}
class Demo7{
	public static void main(String[] args) {
			function("abcba");
	}

	public static boolean function(String  str){
		//第一个数
		char first = str.charAt(0);
		char last  = str.charAt(str.length()-1);

		while (str.length()>1){

			if (first == last) {
				//得到子串
				String subString = str.substring(1, str.length()-1);
				//再去比较子串
				function(subString);
			}else{
				return false;
			}
			//跳出循环
			break;
		}
		return true;

	}


}
