package it.input.demo1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 输出类FileOutput
 */
public class output {

	public static void main(String[] args) throws Exception {
		
		//定义一个文件输出流   --- 输出流可以直接创建一个文本
		FileOutputStream fileOutputStream = new FileOutputStream("f:\\newdemo2.txt");
		
		//向文件写入数据
		fileOutputStream.write(97);//a
		
		//写入数组
		byte[] bytes = {98,99,100,101};
		fileOutputStream.write(bytes);
		
		//用简便方法
		fileOutputStream.write("你好".getBytes());
		
		fileOutputStream.close();
		
		
	}
}
