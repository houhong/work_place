package demo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 利用hashset方法去重
 */

public class demo_1 {
	
 public static void main(String[] args) {
	 
	 //创建一个hash数组
	 HashSet<Character> hashSet = new HashSet<>();
	 
	 Scanner scanner = new Scanner(System.in);
	 String input = scanner.nextLine();
	 
	 char[] charArray = input.toCharArray();
	 
	 //装入
	 for(char c : charArray){
		 hashSet.add(c);
	 }
	 //输出
	Iterator<Character> iterator = hashSet.iterator();
	while(iterator.hasNext()){
		
		char c = iterator.next();
		System.out.print(c);
	}
	 
	 
	 
 }
	 
}
