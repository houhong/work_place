package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import sun.applet.Main;

public class homework_3 {

	public static void main(String[] args) throws Exception{

		function();
	}

	//练习
	public static void function() throws Exception{

		//转换流
		InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\a.txt"),"utf-8");
		OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("E:\\text\\a.txt"), "utf-8");

		int ch= -1;
		char[] ch_1 = new char[1024];
		
		while( (ch=isr.read(ch_1)) != -1 ){
			osr.write(ch_1,0,ch);//写出数组  ：从 0，ch;
		}
		isr.close();
		osr.close();
	}
} 																																
