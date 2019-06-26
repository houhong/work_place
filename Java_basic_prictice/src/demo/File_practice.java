package demo;

import java.io.File;
/*
 * file的三种构造方法
 */

public class File_practice {
	
		public static void main(String[] args) {
			//一种构造方法
			File file =new File("src");
			//判断是否存在
			boolean exit = file.exists();
			
			System.out.println(exit);
		}
		
		
		
		
		
		
		
		
}
