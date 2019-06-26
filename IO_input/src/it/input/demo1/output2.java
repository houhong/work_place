package it.input.demo1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 *  FileOutputStream 文件的续写和换行问题
 *  续写: FileOutputStream构造方法, 的第二个参数中,加入true
 *  在文件中,写入换行,符号换行  \r\n
 *  \r\n 可以写在上一行的末尾, 也可以写在下一行的开头
 */
public class output2 {

	public static void main(String[] args) throws Exception {
		
		//定义一个文件输出流   --- 输出流可以直接创建一个文本
		FileOutputStream fileOutputStream = new FileOutputStream("f:\\newdemo2.txt",true);
		
		//换行：
		
		 //fileOutputStream.write("hello\r\n".getBytes());
		 fileOutputStream.write("hello world\r\n".getBytes());
	    /*	
		fileOutputStream.write("hello\r\n".getBytes());
		fileOutputStream.write("world".getBytes());
		fileOutputStream.write("\r\n world hello".getBytes());
		fileOutputStream.close();*/
		/*//向文件写入数据
		fileOutputStream.write(97);//a
		
		//写入数组
		byte[] bytes = {98,99,100,101};
		fileOutputStream.write(bytes);
		
		//用简便方法
		fileOutputStream.write("你好".getBytes());
		
		fileOutputStream.close();*/
		
		
		
	}
}
