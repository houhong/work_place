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
 * 4.用代码实现以下需求
	(1)定义学生类,包含姓名(String name),性别(String gender),年龄(int age)三个属性,生成空参有参构造,set和get方法,toString方法
	(2)键盘录入6个学员信息(录入格式:张三,男,25),要求有两个相同的信息,将6个学员信息存入到ArrayList集合中
	(3)将存有6个学员信息的ArrayList集合对象写入到D:\\StudentInfo.txt文件中
	(4)读取D:\\StudentInfo.txt文件中的ArrayList对象
	(5)对ArrayList集合中的6个学生对象进行去重并按照年龄从小到大的顺序排序
	(6)将ArrayList集合中排序后的结果利用字符流写入到E:\\StudentInfo.txt文件中(写入格式：张三-男-25)
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
		
		//将对象写入文件中
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:\\StudentInfo.txt")));
		
		for (student student : arr) {
			
			oos.writeObject(student);
		}
		oos.close();
		
		
	}
	//(4)读取D:\\StudentInfo.txt文件中的ArrayList对象	
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
			throw new RuntimeException("该文件不存在");
		}
		
		
		
	}
	/*5*/
	public static void require_5(ArrayList<student> student) {
		
		//利用冒泡的思想
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i+1; j < arr.size(); j++) {
				
				if (compare(arr.get(i), arr.get(j))) {
					arr.remove(i);
				}
			}
		}
		
		//集合工具类
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

	
	
	//set 和get
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
