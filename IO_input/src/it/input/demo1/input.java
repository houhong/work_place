package it.input.demo1;

import java.io.File;
import java.io.FileInputStream;



/*
 *  �ֽ��������ļ�
 *   �������黺�����Ч��
 *   �ֽ�����
 *   FileInputStream ��ȡ�ֽ�����
 *   FileOutputStream д�ֽ�����
 */

public class input {

	public static void main(String[] args) throws Exception{
		//�������ڵ�ʱ�䣺
		/*long s = System.currentTimeMillis();
		//System.out.println(s);*/		
		
		File file = new File("f:\\copy2.txt");
		boolean createNewFile = file.createNewFile();

		
		System.out.println(createNewFile);
		if(createNewFile){
			//����������
			FileInputStream fis = new FileInputStream("f:\\copy2.txt");
			
		}
	}


}
