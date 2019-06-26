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
 * ��֪һ�� HashMap<Integer��User>���ϣ� 
 * User �� name��String���� age��int�����ԡ���дһ������ʵ�ֶ�
HashMap �������ܣ��÷������� HashMap<Integer�� User>Ϊ�βΣ�
��������Ϊ HashMap<Integer�� User>��
Ҫ��� HashMap �е� User �� age ���������������ʱ key=value ��ֵ�Բ��ò�ɢ
--------------------- 

��
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
		
		//�����hashMap
		LinkedHashMap<Integer, User> orderMap = new LinkedHashMap<>();
		
		for (Entry<Integer, User> entry : list) {
			
			  orderMap.put(entry.getKey(), entry.getValue());
		}

	}

}
