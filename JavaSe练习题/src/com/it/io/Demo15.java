package com.it.io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.print.attribute.standard.RequestingUserName;

import org.junit.Test;
/*
 * 已知一个 HashMap<Integer，User>集合， 
 * User 有 name（String）和 age（int）属性。请写一个方法实现对
HashMap 的排序功能，该方法接收 HashMap<Integer， User>为形参，
返回类型为 HashMap<Integer， User>，
要求对 HashMap 中的 User 的 age 倒序进行排序。排序时 key=value 键值对不得拆散
--------------------- 

！
 */
class User{

	public String name;
	public int     age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}

public class Demo15 {

	public Demo15() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {

	}
	@Test
	public void sort(){
		
		HashMap<Integer,User> hashMap = new HashMap<>();
		
		List<Entry<Integer,User>> list = new ArrayList<>(hashMap.entrySet());
		
		Collections.sort(list,new Comparator<Entry<Integer,User>>() {

			@Override
			public int compare(Entry<Integer, User> o1, Entry<Integer, User> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().age - o2.getValue().age;
			}
		});
		
		//有序的hashMap
		LinkedHashMap<Integer, User> orderMap = new LinkedHashMap<>();
		
		for (Entry<Integer, User> entry : list) {
			
			  orderMap.put(entry.getKey(), entry.getValue());
		}

	}

}
