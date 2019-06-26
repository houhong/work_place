package it.input.demo1;

import java.io.File;
import java.io.FileInputStream;



/*
 *  字节流复制文件
 *   采用数组缓冲提高效率
 *   字节数组
 *   FileInputStream 读取字节数组
 *   FileOutputStream 写字节数组
 */

public class input2 {

	public static void main(String[] args) throws Exception{

		//输入流：从硬盘到内存
		FileInputStream fis = new FileInputStream("f:\\newdemo2.txt");

		int len=0;
		while((len= fis.read()) != -1){

			System.out.print((char)len);
		}
		fis.close();
	}


}
