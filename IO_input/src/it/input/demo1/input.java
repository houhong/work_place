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

public class input {

	public static void main(String[] args) throws Exception{
		//给出现在的时间：
		/*long s = System.currentTimeMillis();
		//System.out.println(s);*/		
		
		File file = new File("f:\\copy2.txt");
		boolean createNewFile = file.createNewFile();

		
		System.out.println(createNewFile);
		if(createNewFile){
			//创建输入流
			FileInputStream fis = new FileInputStream("f:\\copy2.txt");
			
		}
	}


}
