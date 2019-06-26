package APIdemo;

import java.io.File;
import java.io.FileFilter;
/*
 * getName:getName() 
          返回由此抽象路径名表示的文件或目录的名称
 */
public class MyFileFliter implements FileFilter{

	
	@Override
	public boolean accept(File pathname) {
		
		//重写过滤器方法
		//判断获取的是目录,直接返回true
		if(pathname.isDirectory()){
			return true;
		}
		//否则返回以".java"结尾的文件
		return pathname.getName().toLowerCase().endsWith(".java");
	}
	
}
