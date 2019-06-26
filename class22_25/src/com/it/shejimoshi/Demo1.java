package com.it.shejimoshi;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
 * BigInteger ---
 */

public class Demo1 {

	public Demo1() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		BigInteger bigInteger1 = new BigInteger("123456787654321");
		BigInteger bigInteger2 = new BigInteger("123456787654321");

		//大数据的四则运算
		//加
		BigInteger add = bigInteger1.add(bigInteger2);
		
		System.out.println(add);
		
		//减
		BigInteger s2 = bigInteger1.subtract(bigInteger2);
		System.out.println(s2);
		
		//乘
		BigInteger multiply = bigInteger1.multiply(bigInteger1);
		System.out.println(multiply);
		
		//除
		BigInteger divide = bigInteger1.divide(bigInteger1);
		System.out.println(divide);
	}



}
