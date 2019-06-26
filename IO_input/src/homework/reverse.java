package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import com.sun.org.apache.bcel.internal.generic.NEW;

import jdk.jfr.events.FileWriteEvent;
import sun.applet.Main;
/*
 * 逆转文件
 */

public class reverse {

	public reverse() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {

		//创建读写对象
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		//1:读写文件

		try {
			fileReader = new FileReader("f:\\write.txt");

			fileWriter = new FileWriter("d:\\write.txt");

			//准备缓冲
			StringBuffer stringBuffer = new StringBuffer();

			int reader =-1;
			char[] buffer =new char[1024];
			//读写
			while( (reader =fileReader.read())!= -1){


				//这个区域用于逆序数据  --写个方法？
				//static{
				stringBuffer.append( new String(buffer,0,reader));

				stringBuffer.reverse();



				//}
				//这个区域用于写出来

				fileWriter.write(buffer,0,reader);

			}


		} catch (Exception e) {

			// TODO: handle exception
		}


	}

}
