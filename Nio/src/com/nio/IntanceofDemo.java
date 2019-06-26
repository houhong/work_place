package com.nio;
/*
 * intanceof用于判断该运算符前面的引用类型变量的对象
 */

interface IMamal{
	
	//内部接口
	void move();
}
public class IntanceofDemo {

	
	public IntanceofDemo() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {
		
		System.out.println(new Test() instanceof IMamal);
		
	}

	

}

class Test implements IMamal{
	
	 public static void main(String[] args) {
		
	}

	@Override
	public void move() {
	  System.out.println("hellp");
		
	}
}






