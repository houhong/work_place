package filewrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter
 */

public class filewrite {

	public static void main(String[] args) {

		Write();
		Read();

	}
	public static void Write(){

		FileWriter fw =null;
		try {
			fw = new FileWriter("f:\\demo.txt");

			fw.write("你好！！");
			fw.flush();//缓冲一定要写
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			if(fw!= null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
					throw new RuntimeException("运行时异常！！！！");
				}
			}
		}

	}

	//读取方法
	public static void Read(){

		FileReader fr =null;
		try {
			fr = new FileReader("f:\\demo.txt");
			int read =-1;
			while((read =fr.read())!= -1){
				
			    Write();
				System.out.print((char)read);
			}

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}
}
