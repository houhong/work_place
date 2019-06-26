package Io_练习题;

import java.io.File;

/*
 * （二） 递归实现输入任意目录，列出文件以及文件夹，效果看图
 */
public class homework2 {

	public homework2() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {

		allFile("f:\\tomacat");

	}

	public static void allFile(String pathname){
		
		//路径
		File file = new File(pathname);
		
		File[] listFiles = file.listFiles();

		for (File subFile : listFiles) {
			if (!subFile.isDirectory()) {
				//System.out.println(subFile.getAbsolutePath());
				System.out.println(subFile.toString());
			} else if(subFile.isDirectory()) {

				allFile(subFile.toString());
			}
		}
	}

}


