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

public class input2 {

	public static void main(String[] args) throws Exception{

		//����������Ӳ�̵��ڴ�
		FileInputStream fis = new FileInputStream("f:\\newdemo2.txt");

		int len=0;
		while((len= fis.read()) != -1){

			System.out.print((char)len);
		}
		fis.close();
	}


}
