package it.input.demo1;

import java.io.FileInputStream;
/*
 * 
 *  FileInputStream��ȡ�ļ�
 *   ��ȡ����  int read(byte[] b) ��ȡ�ֽ�����
 *   ��������: ���������, ���Ч��
 *   read���ص�int,��ʾʲô���� ��ȡ�����ٸ���Ч���ֽ���
 */
import java.io.FileNotFoundException;

public class input3 {

	public static void main(String[] args) throws Exception {
		function1();
		System.out.println("�Ա����£�");
		function2();
	}
	public static void function1() throws Exception{

		//����������
		long s1 =System.currentTimeMillis();
		System.out.print(s1);
		FileInputStream fis = new FileInputStream("f:\\newdemo2.txt");

		//���������
		byte[] bytes = new byte[1024];
		int len =0;
		while((len=fis.read(bytes)) != -1){

			System.out.print(new String(bytes,0,len));	
		}
		long s2 =System.currentTimeMillis();
		System.out.println(s2);
		System.out.println((s2-s1));
	}
	public static void function2() throws Exception{
		long s1 = System.currentTimeMillis();
		System.out.println(s1);

		FileInputStream fis = new FileInputStream("f:\\newdemo2.txt");

		int len= 0;
		while((len=fis.read())!= -1){

			System.out.print((char)len);
		}
		long s2 =System.currentTimeMillis();
		System.out.println(s2);
		System.out.println((s2-s1));

	}
}
