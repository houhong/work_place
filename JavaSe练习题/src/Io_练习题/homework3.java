package Io_��ϰ��;

import java.io.File;
import java.io.FileFilter;
/*
 *  �ݹ�ʵ���г���ǰ����������.java�ļ�
 */

public class homework3{

	public homework3() {
		// TODO �Զ����ɵĹ��캯�����
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
