package com.woniuxy.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 * 2. �ô���ʵ����������
	(1)�������ַ���"If you want to change your fate I think you must come to the dark horse to learn java"(�ÿո���)
	(2)��ӡ��ʽ��
		to=3
		think=1
		you=2
		//........
	(3)��������Ĵ�ӡ��ʽ������д�뵽D:\\count.txt�ļ���(Ҫ���ø�Ч��)
 */

public class Demo2 {

	public Demo2() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) throws Exception{
		function();
	}
	
	public static void function() throws Exception{
		
		String str = "If you want to change your fate I think you must come to the dark horse to learn java";
		String[] arr =str.split(" ");

		
		/*hashMap��ͳ�Ʊ�*/
		Map<String, Integer> hmMap = new HashMap<>();
		int i=1;
		int j=1;
		int c=0;
	     c=i>j? 100 :200;
		
		for (String string : arr) {
			 
			/*hmMap=hmMap.containsKey(string)?hmMap.put(string, hmMap.get(string)+1):hmMap.put(string, 1);*/
			if(hmMap.containsKey(string)){
				hmMap.put(string, hmMap.get(string)+1);
			}else{
				hmMap.put(string, 1);
			}
		}
		
		/*����һ��arrayList*/
		List<String> arrayList  = new ArrayList<>();
		Iterator<Entry<String, Integer>> iterator = hmMap.entrySet().iterator();
		while (iterator.hasNext()) {
				Entry<String, Integer> next = iterator.next();
				String str1 = next.getKey()+"="+String.valueOf(next.getValue());
				arrayList.add(str1);
		}
		
		//����һ��������
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("D:\\count.txt")));
		
		while (!arrayList.isEmpty()) {
			
			int index=0;
			bw.write(arrayList.get(index));
			arrayList.remove(index);
			
			//���з�
			bw.newLine();

		}
		//����
		if (bw!=null) {
			bw.close();
		}
		
	}
}