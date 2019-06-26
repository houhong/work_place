package com.nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class demo {

	public demo() {
		// TODO 自动生成的构造函数存根
	}


	public static void main(String[] args) {

		List<Person>  personList = new ArrayList<>();
		
		File file = new File("E:\\demo.txt");
		personList =readData(file);
		personList = resourt(personList);
		for (Person person : personList) {
			
			System.out.println(person.toString());
		}



	}
	

	//将dataLibrary排序
	public static ArrayList<Person> resourt(List<Person>  personList){

		ArrayList<Person> arrayList = new ArrayList<>();

		//重写sort方法：
		Collections.sort(personList,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO 自动生成的方法存根
				return   o1.getAge() - o2.getAge();
			}
		});
		arrayList = (ArrayList<Person>) personList;

		return arrayList;

	}
	
	
	
	//根据将file的数据读入dataLibrary里面
	public static ArrayList<Person> readData(File file){

			ArrayList<Person> dataLibrary = new ArrayList<>();
		try {
			String read = null;
			BufferedReader br = new BufferedReader(new FileReader(file));

			while (( read=br.readLine())!= null) {
				
				Person person = new Person();
				String[] liststring = read.split("=");
				person.setName(liststring[0]);
				person.setAge(Integer.valueOf(liststring[1]));
				person.setUsername(liststring[2]);
				person.setUserpass(liststring[3]);
				
				dataLibrary.add(person);


			}
			
		

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		return dataLibrary;
		

	}

}
