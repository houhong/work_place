package demo1;

import it.woniuxueyuan.utils.InfoByString;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/*
 * try-catch-finlly
 */
import java.io.IOException;
import java.io.WriteAbortedException;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;
import javax.sound.sampled.LineListener;

public class io {

	public static void main(String[] args) {

		Copy_1();
	}

	//copy方法：
	public static void Copy_1(){

		//局部变量必须赋初值。
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("d:\\newdemo2.txt");
			fos = new FileOutputStream("f:\\newdemo2.txt");
			byte[] bytes = new byte[1024];
			int read = -1;
			while((read = fis.read(bytes) )!=-1){
				fos.write(bytes,0,read);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}finally{

			//一定要关闭流！！！！！！！！
			if(fis !=null){
				try {
					fis.close();
					System.out.println("一定要关闭流!!!!!!!");
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}finally{

					if(fos !=null){
						try {
							fos.close();
							System.out.println("一定要关闭流!!!!!!!!");
						} catch (IOException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}

				}
			}

		}
	}

	//向绑定的文件写入东西
	public static void write() {

		FileOutputStream fos = null;

		try {
			//定义输出流
			fos= new FileOutputStream("f:\\newdemo2.txt");

			//缓冲数组
			ArrayList<Byte> list = new ArrayList<>();

			//输入数据
			System.out.println("请输入需要写入的数据：");
			String str =  InfoByString.inToByString();


			char[] charArray = str.toCharArray();

			for(char c: charArray){

				list.add((byte)c);
			}
			//fos.write(list);

		} catch ( IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();

			//定义运行时异常
			throw new RuntimeException(e);
		}finally{
			//一定要关流！！！！
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}
}
