package Io_练习题;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.omg.PortableServer.ServantActivator;
/*
 * （一） 在电脑D盘下创建一个文件为HelloWorld.txt文件，判断他是文件还是目录，在创建一个目
          录IOTest,之后将HelloWorld.txt移动到IOTest目录下去；之后遍历IOTest这个目录下的文
          件
 */

public class Homework1 {

	public Homework1() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {

		 
		// 在电脑D盘下创建一个文件为HelloWorld.txt文件
		File file = new File("f:\\HelloWorld.txt");
		try {
				
			
			//创建一个文件，并判断是否创建成功
			boolean flag =file.createNewFile();
			if (flag) {

				if (file.isDirectory()) {

					System.out.println("这是一个目录");
				} else {
					System.out.println("这是一个文件");
					
					//文件路径
					File ioTest = new  File("f:\\IOTest");
					
					//以ioTest作为路径创建一个目录
					boolean flag1=ioTest.mkdir();
						
					//创建流
					//输出流只能写byte 
					BufferedInputStream bis  =  new BufferedInputStream(new FileInputStream(file));
					BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(ioTest.getAbsolutePath()+"\\"+file.getName()));                         
					
					int read = 0;
					byte[] buffer = new byte[1024];

					while( (read = bis.read(buffer))!= -1){
						bos.write(buffer,0,read);
					}
					
					if(flag1){
						File[] listFiles = ioTest.listFiles();
						for (File subFile : listFiles) {
							   System.out.println(subFile.toString());
						}
					}
					
					//关闭流
					bis.close();
					bos.close();

				}

			} else {
				System.out.println("创建失败！！！");
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}



	}

}
