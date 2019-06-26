package Thread_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;

import String练习题.string;

/*
 * 1、提供一个文件操作的方法，其需要实现功能：对一个文件的任意位置可以插入任何内容
 */
/**
 * @param filepath  文件路径
 * @param postion   插入位置
 * @param toContents 插入内容
 */

public class Utils {



	public static void main(String[] args) throws Exception{

		
		String filepath ="f:\\write.txt";
		int postion = 2;
		String contens = "hhh";
		
		Function(filepath, postion, contens);
	}


	public static void Function(String filepath,int postion,String toContents) throws IOException{

		//将文件位置后面的内容复制到零食文件中，然后将需要写的内容加进去 再将零食文件写进去

		File file = new File(filepath);

		if(!(file.exists()) && file.isFile()){
			System.out.println("文件不存在");

			return;
		}

		if(postion<0 || postion> file.length()){

			System.out.println("插入位置不合法！！！");
			return;
		}

		//创建临时文件
		File temp = file.createTempFile("temp",".temp", new File("f:\\"));

		FileOutputStream fos = new FileOutputStream(temp);
		FileInputStream fis  =  new FileInputStream(file);
		
		//在JVM停止时，删除文件
		temp.deleteOnExit();


		//读取文件 
		RandomAccessFile randomAcess = new RandomAccessFile(file, "rw");
		
		randomAcess.seek(postion);	
		
		//将postion后面文件写入临时文件中
		int tempindex;
		if(  ( tempindex =randomAcess.read())!= -1 ){
			 		fos.write(tempindex);
		}
		
		//将内容写入文件
		randomAcess.seek(postion);
		randomAcess.write(toContents.getBytes());
			while((tempindex = fis.read())!= -1){
				
				randomAcess.write(tempindex);
			}
			randomAcess.close();
			fos.close();
			fis.close();
	}
}
