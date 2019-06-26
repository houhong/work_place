package file;

import java.io.File;

/*
 * file工具类
 */
public class fileutils {

	public fileutils() {
		// TODO 自动生成的构造函数存根
	}
	/**
	 * 创建文件，若文件夹不存在则自动创建文件夹，若文件存在则删除旧文件
	 * @param path :待创建文件路径
	 * */
	public static File createNewFile(String pathname){
		
		File file =new File(pathname);
		
		return file;
	}

}
