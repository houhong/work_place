package utils;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

import org.omg.PortableServer.ServantActivator;

public class getAlldirtory {

	public getAlldirtory() {
		// TODO �Զ����ɵĹ��캯�����
	}

	//�ݹ�Ŀ¼
	public static void getAlldirctory(String path){
		File file = new File("path");
		
		//�����ļ���
		/*File[] listFiles = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO �Զ����ɵķ������
				return  pathname.exists() && pathname.getName().toLowerCase().endsWith(".avi");                    
			}
		});
		*/
		String[] listFiles = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO �Զ����ɵķ������
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
