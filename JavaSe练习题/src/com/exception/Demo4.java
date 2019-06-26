package com.exception;
/*
 * Chapter Exceptions, Exercise 2, page 452

Define an object reference and initialize it to null. Try to call a method

* through this reference. Now wrap the code in a try-catch clause to catch the

* exception.
 */

public class Demo4 {

	public Demo4() {
		// TODO Auto-generated constructor stub
	}
	public static Integer integer =null;
	
	public static void main(String[] args) {
		try {
			System.out.println(integer.toString());
		} catch (NullPointerException e) {
			System.out.println("空指针异常");
		}
		
		try{
			integer=10;
			
		}catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("空指针异常");
		}
		
	}

}
