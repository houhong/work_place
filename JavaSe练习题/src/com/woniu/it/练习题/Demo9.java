package com.woniu.it.��ϰ��;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import HashMap��ϰ��.homework5;

/*
 * 4.����һ���ַ����������һ����Ч�㷨���ҵ���һ���ظ����ֵ��ַ��� 
����һ���ַ���(��һ��ȫΪ��ĸ)A�����ĳ���n���뷵�ص�һ���ظ����ֵ��ַ���
��֤�ַ��������ظ��ַ����ַ����ĳ���С�ڵ���500��
 
 * �������һ�����ִ�����Ϊ1���ַ�
 */

public class Demo9 {

	public Demo9() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		System.out.println(firstRe("abdsjdsfhjadahl"));
	}
	
	//����hashMap?
	public static char  firstRe(String str){
		
		//����hashMap��ͳ�Ʊ� -- �ҵ���һ�γ��ֵĴ���
		Map<Character, Integer> hmMap = new HashMap<>();
		
		//�õ��ַ�����
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
