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
		// TODO �Զ����ɵĹ��캯�����
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
	

	//��dataLibrary����
	public static ArrayList<Person> resourt(List<Person>  personList){

		ArrayList<Person> arrayList = new ArrayList<>();

		//��дsort������
		Collections.sort(personList,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO �Զ����ɵķ������
				return   o1.getAge() - o2.getAge();
			}
		});
		arrayList = (ArrayList<Person>) personList;

		return arrayList;

	}
	
	
	
	//���ݽ�file�����ݶ���dataLibrary����
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		return dataLibrary;
		

	}

}
