package File练习题;

import java.io.File;
/*
 * 按照层级打印
 */

public class homework2 {

	public homework2() {
		// TODO 自动生成的构造函数存根
	}
	
	public static void main(String[] args) {
		File file = new File("f:\\idea_workplace");
		
		function(file, file.length());
	}
	
	public static void function(File file,long level){
		
		File[] listFiles = file.listFiles();
		
		for (File subFile : listFiles) {
			
			for (int i = 0; i < level; i++) {
			
				System.out.print("\t");
			}
			
			System.out.println(subFile);
			
			if (subFile.isDirectory()) {
				function(subFile, level+1);
			} 
			
			
			
		}
		
		
	}

}
