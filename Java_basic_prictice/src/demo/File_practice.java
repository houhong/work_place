package demo;

import java.io.File;
/*
 * file�����ֹ��췽��
 */

public class File_practice {
	
		public static void main(String[] args) {
			//һ�ֹ��췽��
			File file =new File("src");
			//�ж��Ƿ����
			boolean exit = file.exists();
			
			System.out.println(exit);
		}
		
		
		
		
		
		
		
		
}
