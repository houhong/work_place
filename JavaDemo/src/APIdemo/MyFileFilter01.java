package APIdemo;

import java.io.File;
import java.io.FileFilter;
/*
 * ʵ���ļ�������
 */

public class MyFileFilter01 implements FileFilter{

	
	@Override
	public boolean accept(File pathname) {
		
		/* �����ж��Ƿ����ļ� - ��������ļ��еĻ����ͷ�����".java"��β���ļ�*/
		if(pathname.isDirectory()){
			return true;
		}else{
			return pathname.getName().toLowerCase().endsWith(".java");
		}
		
	}

}
