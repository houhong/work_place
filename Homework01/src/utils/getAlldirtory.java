package utils;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

import org.omg.PortableServer.ServantActivator;

public class getAlldirtory {

	public getAlldirtory() {
		// TODO 自动生成的构造函数存根
	}

	//递归目录
	public static void getAlldirctory(String path){
		File file = new File("path");
		
		//遍历文件夹
		/*File[] listFiles = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO 自动生成的方法存根
				return  pathname.exists() && pathname.getName().toLowerCase().endsWith(".avi");                    
			}
		});
		*/
		String[] listFiles = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO 自动生成的方法存根
				//return  dir.exists() && 
			}
		});
		
		for (File file2 : listFiles) {
			if(file2.isDirectory()){
				getAlldirctory(file2);
			}
		}
	}

}
