package com.woniu.it.��ϰ��;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * ��Ŀ������һ���ַ�����ͳ�Ƴ�ÿ����ĸ���ֵĴ��� --hashMap��ͳ�Ʊ�
 */

public class Demo8 {

	public Demo8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
	    //findCount("abcdefasassaadad");
		StringCount("abcdefasassaadad");
	    
	    
	}
	
	
	//ͳ�Ƹ����ַ����ĳ���
	public static void findCount(String str){
		
		if (str.length()<=0) {
			
			System.out.println("�����ַ������Ϸ�");
			return;
		}
		//��ͳ�Ʊ�
		Map<String ,Integer>   countTable = new HashMap<>();
		//�����ַ���
		int count =1;//����ͳ�����ֵĴ���
		for (int i = 0; i < str.length(); i++) {
			
			String  curChar = String.valueOf(str.charAt(i));
			
			//�����������ֵ
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
	
	//�Ż�����
	public static void StringCount(String str){
		
		char[] charArr = str.toCharArray();
		
		//��ͳ�Ʊ�
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
