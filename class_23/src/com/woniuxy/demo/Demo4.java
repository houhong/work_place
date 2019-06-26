package com.woniuxy.demo;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.management.RuntimeErrorException;
/*
 * 4.�ô���ʵ����������
	(1)����ѧ����,��������(String name),�Ա�(String gender),����(int age)��������,���ɿղ��вι���,set��get����,toString����
	(2)����¼��6��ѧԱ��Ϣ(¼���ʽ:����,��,25),Ҫ����������ͬ����Ϣ,��6��ѧԱ��Ϣ���뵽ArrayList������
	(3)������6��ѧԱ��Ϣ��ArrayList���϶���д�뵽D:\\StudentInfo.txt�ļ���
	(4)��ȡD:\\StudentInfo.txt�ļ��е�ArrayList����
	(5)��ArrayList�����е�6��ѧ���������ȥ�ز����������С�����˳������
	(6)��ArrayList�����������Ľ�������ַ���д�뵽E:\\StudentInfo.txt�ļ���(д���ʽ������-��-25)
 */

public class Demo4 {
	public static List<student> arr = new ArrayList<>();
	
	public Demo4() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws Exception{
			function();
			function2();
		
		
	}
	
	public static void function()throws Exception{
		
		
		
		Scanner sca = new Scanner(System.in);
		
		int index=0;
		while(arr.size()<6) {
			
			String  str=sca.nextLine();
			String[] arrName = str.split(",");
			
			student stu = new student(arrName[0],arrName[1],Integer.parseInt(arrName[2]));
			/*stu.setName(arrName[0]);
			stu.setGender(arrName[1]);
			stu.setAge(Integer.parseInt(arrName[2]));
			*/
			arr.add(stu);
			
		}
		
		//������д���ļ���
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:\\StudentInfo.txt")));
		
		for (student student : arr) {
			
			oos.writeObject(student);
		}
		oos.close();
		
		
	}
	//(4)��ȡD:\\StudentInfo.txt�ļ��е�ArrayList����	
	public static void function2() throws Exception{
		File  file=new File("D:\\StudentInfo.txt");
		if(file.exists()){
			
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			System.out.println(arr.size());
			for (int i = 0; i < arr.size(); i++) {
				Object readObject = ois.readObject();
				System.out.println(readObject);
			}
			
			ois.close();
		}else{
			throw new RuntimeException("���ļ�������");
		}
		
		
		
	}
	/*5*/
	public static void require_5(ArrayList<student> student) {
		
		//����ð�ݵ�˼��
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i+1; j < arr.size(); j++) {
				
				if (compare(arr.get(i), arr.get(j))) {
					arr.remove(i);
				}
			}
		}
		
		//���Ϲ�����
		Collections.sort(student, new Comparator<student>() {
			 
			@Override
			public int compare(student o1, student o2) {
				int i = o1.getAge() - o2.getAge();
				if(i == 0){
					return o1.getAge() - o2.getAge();
				}
				return i;
			}
		});		
	}
	public  static  boolean compare(student s1, student s2){
		
		if (s1.getName().equals(s2.getName()) && s1.getGender().equals(s2.getGender()) && (s1.getAge()) == (s2.getAge()))
							
		{
			return true;
		}else {
			return false;
		}
	}
	
		
	
	
}
 
class student implements Serializable{
	
	private String name;
	private String gender;
	private int    age;
	
	
	public student() {
		
	}


	public student(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}


	
	@Override
	public String toString() {
		return "student [name=" + name + ", gender=" + gender + ", age=" + age
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	//set ��get
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	
	
	
	
	
}