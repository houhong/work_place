package File��ϰ��;

import java.io.File;
/*
 * ���ղ㼶��ӡ
 */

public class homework2 {

	public homework2() {
		// TODO �Զ����ɵĹ��캯�����
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
