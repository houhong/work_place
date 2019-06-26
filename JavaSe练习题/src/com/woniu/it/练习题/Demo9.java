package com.woniu.it.练习题;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import HashMap练习题.homework5;

/*
 * 4.对于一个字符串，请设计一个高效算法，找到第一次重复出现的字符。 
给定一个字符串(不一定全为字母)A及它的长度n。请返回第一个重复出现的字符。
保证字符串中有重复字符，字符串的长度小于等于500。
 
 * 返回最后一个出现次数不为1的字符
 */

public class Demo9 {

	public Demo9() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		System.out.println(firstRe("abdsjdsfhjadahl"));
	}
	
	//利用hashMap?
	public static char  firstRe(String str){
		
		//利用hashMap做统计表 -- 找到第一次出现的次数
		Map<Character, Integer> hmMap = new HashMap<>();
		
		//得到字符数组
		char[] charArr = str.toCharArray();
		
		for (char c : charArr) {
			 
			if (!hmMap.containsKey(c)) {
				
				hmMap.put(c, 1);
			} else {
				
				return c;
			}
		}
		
		return 'a';
		
		
		
	}
	
	public static char  lastRe(String str){
		
	    Map<Character, Integer> hmMap = new LinkedHashMap<>();
	    
	    char[] charArr = str.toCharArray();
	    
	    for (char c : charArr) {
			
	    	if (!hmMap.containsKey(c)) {
	    		
				hmMap.put(c, 1);
			} else {
				hmMap.put(c, hmMap.get(c)+1);
			}
		}
		
		return 'a';
	}
	
	
	
	

}
