package com.woniu.it.��ϰ��;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.junit.Test;

import String��ϰ��.string;

/*
 *   4��ĳ��˾��֯���,�����볡ʱ���������,���볡ʱÿλԱ�����ܻ�ȡһ��˫ɫ���Ʊ,
 *   ���蹫˾��100��Ա��,
 *   ���ö��߳�ģ������볡����,
 ���ֱ�ͳ��ÿ������볡������,�Լ�ÿ��Ա���õ��Ĳ�Ʊ�ĺ��롣�߳����к��ӡ��ʽ���£�
 ���Ϊ: 2 ��Ա�� �Ӻ��� �볡! �õ���˫ɫ���Ʊ������: [17, 24, 29, 30, 31, 32, 07]
 ���Ϊ: 1 ��Ա�� �Ӻ��� �볡! �õ���˫ɫ���Ʊ������: [06, 11, 14, 22, 29, 32, 15]
 //.....
 �Ӻ����볡��Ա���ܹ�: 13 λԱ��
 ��ǰ���볡��Ա���ܹ�: 87 λԱ��

 */

public class Demo5 {


	public Demo5() {
		// TODO Auto-generated constructor stub
	}


	public static String getDoubleBall(){


		//��ʼ��
		String[] redBall = new String[33];

		for (int i = 0; i < 10; i++) {

			String str = "��0"+i+",";
			redBall[i] =str;
		}
		for (int i = 10; i < 33; i++) {

			if (i<32) {
				String str = "��"+i+",";
				redBall[i] =str;
			}
			if (i==32) {
				String str = "��"+i+",";
				redBall[i] =str;
			}


		}


		String[] blueBall = new String[10];
		//��ʼ������
		for (int i = 0; i < 10; i++) {

			if (i<9) {
				String str = "��0"+i+",";
				blueBall[i] =str;
			}
			if (i==9) {
				String str = "��0"+i+",";
				blueBall[i] =str;
			}


		}
		/*for (String string : blueBall) {
			System.out.println(string);
		}
		for (String string : redBall) {
			System.out.println(string);
		}*/


		//�õ���Ʊ
		Set<String> doubleBall = new HashSet<>();
		Random rand = new Random();

		int i=0;
		while (doubleBall.size()<6) {
			doubleBall.add(redBall[rand.nextInt(redBall.length)]);
			i++;
		}
		doubleBall.add(blueBall[rand.nextInt(blueBall.length)]);
		StringBuffer sb = new StringBuffer();
		for (String string : doubleBall) {

			sb.append("["+string+"]");
		}

		return sb.toString();


	}
	public static  int countEmployee = 100;
	public static  int before = 0;
	public static  int after =  0;
	@Test
	public void Test(){
		
	}
	public static void main(String[] args) {


		getDoubleBall();


		Object obj = new Object();//��


		Thread t0 = new Thread(){

			@Override
			public void run() {
				
				while (countEmployee>1) {
					
					synchronized (obj) {
						String caipiao=getDoubleBall();
						System.out.println(" ���Ϊ: "+countEmployee+"��Ա�� �Ӻ��� �볡! �õ���˫ɫ���Ʊ������: "+ caipiao);	
						countEmployee--;
						after++;
					}
				}
				if (countEmployee==0) {
					System.out.println("�����ǣ�"+after);
					System.out.println("ǰ���ǣ�"+before);
				}

			}

		};
		
		//ǰ��
		Thread t1 = new Thread(){

			@Override
			public void run() {
				
				while (countEmployee>1) {
					
					synchronized (obj) {
						String caipiao = getDoubleBall();
						System.out.println(" ���Ϊ: "+countEmployee+"��Ա�� ǰ�� �볡! �õ���˫ɫ���Ʊ������: "+caipiao );	
						countEmployee--;
						before++;
					}
					if(countEmployee ==0){
						System.out.println("��������"+after);
						System.out.println("ǰ������"+before);
					}
					
					
				}	
				/*if (countEmployee==0) {
					System.out.println("�����ǣ�"+after);
					System.err.println("ǰ���ǣ�"+before);
				}*/


			}

		};
		
		t0.start();
		t1.start();
		

		/*	//ǰ��
		new Thread(new Runnable() {

			@Override
			public void run() {

				while (countEmployee>0) {

					synchronized (obj) {

						System.out.println(" ���Ϊ: "+countEmployee+"��Ա�� �Ӻ��� �볡! �õ���˫ɫ���Ʊ������: "+ getDoubleBall());				

					}


				}


			}
		}).start();


		//����
		new Thread(new Runnable() {

			@Override
			public void run() {

				while(countEmployee>0){

					synchronized (obj) {


					}
				}


			}
		}).start();*/

	}

}
class Employee{

	private int num;
	private Set<String> douBall;


	public Employee() {

	}


	public Employee(int num, Set<String> douBall) {

		this.num = num;
		this.douBall = douBall;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public Set<String> getDouBall() {
		return douBall;
	}


	public void setDouBall(Set<String> douBall) {
		this.douBall = douBall;
	}


	@Override
	public String toString() {
		return "Employee [num=" + num + ", douBall=" + douBall + ", getNum()="
				+ getNum() + ", getDouBall()=" + getDouBall() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}




}


