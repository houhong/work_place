package it.input.demo2;

import java.io.FileInputStream;
import java.io.FileOutputStream;





import java.io.InputStream;

import com.sun.org.apache.bcel.internal.util.ByteSequence;

import sun.applet.Main;
/*
 * 将一个文件复制到另一个文件：
 */

public class copy {

	public static void main(String[] args) throws Exception{
		
		//0：记录开始 的时间
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		//1:创建输入流-- 将硬盘的文件读取到内存
		
		//2:创建输出流 -- 将内存的文件输出到硬盘
		FileOutputStream fos= new FileOutputStream("d:\\tomacat");
		
		FileInputStream fis = new FileInputStream("f:\\tomacat");
		//定义输出缓存数组
		byte[] bytes =new byte[1024];
		
		int len=0;
		//读取数据
		while((len =fis.read(bytes))!=-1){
			
			fos.write(bytes,0,len);
		}
		long stopTime =System.currentTimeMillis();
		
		System.out.println(stopTime);
		System.out.println((stopTime - startTime));
		
		
		fos.close();
		fis.close();

		
	}
}
