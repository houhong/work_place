package com.it.shejimoshi;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
 * BigInteger ---
 */

public class Demo1 {

	public Demo1() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {

		BigInteger bigInteger1 = new BigInteger("123456787654321");
		BigInteger bigInteger2 = new BigInteger("123456787654321");

		//�����ݵ���������
		//��
		BigInteger add = bigInteger1.add(bigInteger2);
		
		System.out.println(add);
		
		//��
		BigInteger s2 = bigInteger1.subtract(bigInteger2);
		System.out.println(s2);
		
		//��
		BigInteger multiply = bigInteger1.multiply(bigInteger1);
		System.out.println(multiply);
		
		//��
		BigInteger divide = bigInteger1.divide(bigInteger1);
		System.out.println(divide);
	}



}
