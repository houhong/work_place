package demo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
 * ����hashset����ȥ��
 */

public class demo_1 {
	
 public static void main(String[] args) {
	 
	 //����һ��hash����
	 HashSet<Character> hashSet = new HashSet<>();
	 
	 Scanner scanner = new Scanner(System.in);
	 String input = scanner.nextLine();
	 
	 char[] charArray = input.toCharArray();
	 
	 //װ��
	 for(char c : charArray){
		 hashSet.add(c);
	 }
	 //���
	Iterator<Character> iterator = hashSet.iterator();
	while(iterator.hasNext()){
		
		char c = iterator.next();
		System.out.print(c);
	}
	 
	 
	 
 }
	 
}
