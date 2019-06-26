package hashMap_bianni;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 字节输入流转换成字符输入流
 */


class classDemo {

	public static void main(String[] args) throws Exception {

		FileInputStream fis=null;
		FileOutputStream fos=null;
		InputStreamReader isr=null;
		OutputStreamWriter osr=null;

		/*FileInputStream */ fis = new FileInputStream("f:\\demo.txt");
		/*FileOutputStream*/ fos = new FileOutputStream("d:\\demo.txt");

		//转换流
		//将fis转换成reder流： 字符格式是"utf-8" :表示现在对于demo
		/*InputStreamReader*/ isr= new InputStreamReader(fis,"utf-8");
		/*OutputStreamWriter*/ osr = new OutputStreamWriter(fos,"utf-8");

		char[] bytes = new char[1024];
		int reader = -1;

		while((reader=isr.read(bytes))!=-1){
			osr.write(bytes,0,reader);
		}
		//记住：一定要关流:一定要关流!!!!
		if(isr != null){

			isr.close();
		}

	}
}
