package com.woniu.it.练习题;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 题目；给出一个字符串，统计出每个字母出现的次数 --hashMap做统计表
 */

public class Demo8 {

	public Demo8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
	    //findCount("abcdefasassaadad");
		StringCount("abcdefasassaadad");
	    
	    
	}
	
	
	//统计给定字符串的长度
	public static void findCount(String str){
		
		if (str.length()<=0) {
			
			System.out.println("输入字符串不合法");
			return;
		}
		//做统计表
		Map<String ,Integer>   countTable = new HashMap<>();
		//遍历字符串
		int count =1;//用于统计数字的次数
		for (int i = 0; i < str.length(); i++) {
			
			String  curChar = String.valueOf(str.charAt(i));
			
			//如果不包含此值
			if (!countTable.containsKey(curChar)) {
				countTable.put(curChar, 1);
			}else {
			
				countTable.put(curChar, countTable.get(curChar)+1);
				
			}
		}
	     Set<String> keySet = countTable.keySet();	
	     for (String key : keySet) {
			System.out.println(key+"="+countTable.get(key));
		}
	     
	}
	
	//优化代码
	public static void StringCount(String str){
		
		char[] charArr = str.toCharArray();
		
		//做统计表
		Map<Character, Integer>  countTable = new HashMap<>();
		
		for (char c : charArr) {
			
			//if (!countTable.containsKey(c)) {
			//	countTable.put(c, 1);
			//} else {
			//	countTable.put(c, countTable.get(c)+1);
			//}
			countTable.put(c, !countTable.containsKey(c)? 1 : countTable.get(c)+1);
			
		}
		for (char c: countTable.keySet()) {
			System.out.println("("+c+")"+"="+countTable.get(c));
		}
	}
	

}
