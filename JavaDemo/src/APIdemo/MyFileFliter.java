package APIdemo;

import java.io.File;
import java.io.FileFilter;
/*
 * getName:getName() 
          �����ɴ˳���·������ʾ���ļ���Ŀ¼������
 */
public class MyFileFliter implements FileFilter{

	
	@Override
	public boolean accept(File pathname) {
		
		//��д����������
		//�жϻ�ȡ����Ŀ¼,ֱ�ӷ���true
		if(pathname.isDirectory()){
			return true;
		}
		//���򷵻���".java"��β���ļ�
		return pathname.getName().toLowerCase().endsWith(".java");
	}
	
}
