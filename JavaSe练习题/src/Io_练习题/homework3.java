package Io_练习题;

import java.io.File;
import java.io.FileFilter;
/*
 *  递归实现列出当前工程下所有.java文件
 */

public class homework3{

	public homework3() {
		// TODO 自动生成的构造函数存根
	}
	
	public static void main(String[] args) {
		getAllDir(new File("f:\\tomacat"));
	}
	
	public static void getAllDir(File file){
		
		File[] listFiles = file.listFiles();
		
		for (File subFile : listFiles) {
			
			if (!subFile.isDirectory()) {
				
				System.out.println(subFile.getName());
				
			} else if(subFile.isDirectory()) {
				getAllDir(subFile);

			}
			
		}
		
		
		
	}


}
