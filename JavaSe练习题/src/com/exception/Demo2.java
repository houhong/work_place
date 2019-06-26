package com.exception;

/*
 * 自定义异常
 */

class Exception2 extends Exception{

	public Exception2(String msg) {
		
		super(msg);
		System.out.println("这是一个异常");
	}
	
	
}

public class Demo2 {

	public Demo2() {
		// TODO Auto-generated constructor stub
	}
	//抛出自定义异常
	public static void f() throws Exception2{
		System.out.println("Throwing MyException from f()");
		throw new Exception2("from f()");
	}
	public static void main(String[] args) {
		
		try {	
			f();
		} catch (Exception2 e) {
			
			System.out.println("caught Exception from f()");
			e.printStackTrace();
		}finally{
			System.out.println("Made it to finally");
		}
	}

}
