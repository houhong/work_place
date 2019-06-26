package it.input.demo1;

import java.io.FileInputStream;
/*
 * 
 *  FileInputStream读取文件
 *   读取方法  int read(byte[] b) 读取字节数组
 *   数组作用: 缓冲的作用, 提高效率
 *   read返回的int,表示什么含义 读取到多少个有效的字节数
 */
import java.io.FileNotFoundException;

public class input3 {

	public static void main(String[] args) throws Exception {
		function1();
		System.out.println("对比如下：");
		function2();
	}
	public static void function1() throws Exception{

		//创建输入流
		long s1 =System.currentTimeMillis();
		System.out.print(s1);
		FileInputStream fis = new FileInputStream("f:\\newdemo2.txt");

		//用数组接收
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
