package APIdemo;

import java.io.File;
import java.io.FileFilter;
/*
 * 实现文件过滤器
 */

public class MyFileFilter01 implements FileFilter{

	
	@Override
	public boolean accept(File pathname) {
		
		/* 用于判断是否是文件 - 如果不是文件夹的话，就返回以".java"结尾的文件*/
		if(pathname.isDirectory()){
			return true;
		}else{
			return pathname.getName().toLowerCase().endsWith(".java");
		}
		
	}

}
