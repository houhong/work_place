package File练习题;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
 * copy目录文件夹
 */

public class Copy {

	public Copy() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {

	}
	//destination
	public static void copy_dictory(File originFile,File destFile ){

		File[] listFiles = originFile.listFiles();
		for (File subFile : listFiles) {

			if (subFile.isDirectory()) {
				copy_dictory(subFile, new File(destFile.getAbsolutePath()+"\\"+subFile.getName()));              
			} else if(subFile.isFile()){

				try {

					//1：创建NIO -- 得到通道
					FileInputStream fis = new FileInputStream(subFile);
					FileOutputStream fos = new FileOutputStream(destFile);
					
					FileChannel finc = fis.getChannel();
					FileChannel foutc = fos.getChannel();	

					//2：创建缓冲区
					ByteBuffer buffer = ByteBuffer.allocate(1024);

					//创建缓冲区
					try {
						finc.read(buffer);
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				} catch (FileNotFoundException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}




			}
		}

		// 3、遍历数组，如果是文件就用IO流读写
		// 4、如果是文件夹就递归调用





	}

}
