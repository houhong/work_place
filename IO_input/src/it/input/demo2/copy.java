package it.input.demo2;

import java.io.FileInputStream;
import java.io.FileOutputStream;





import java.io.InputStream;

import com.sun.org.apache.bcel.internal.util.ByteSequence;

import sun.applet.Main;
/*
 * ��һ���ļ����Ƶ���һ���ļ���
 */

public class copy {

	public static void main(String[] args) throws Exception{
		
		//0����¼��ʼ ��ʱ��
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		//1:����������-- ��Ӳ�̵��ļ���ȡ���ڴ�
		
		//2:��������� -- ���ڴ���ļ������Ӳ��
		FileOutputStream fos= new FileOutputStream("d:\\tomacat");
		
		FileInputStream fis = new FileInputStream("f:\\tomacat");
		//���������������
		byte[] bytes =new byte[1024];
		
		int len=0;
		//��ȡ����
		while((len =fis.read(bytes))!=-1){
			
			fos.write(bytes,0,len);
		}
		long stopTime =System.currentTimeMillis();
		
		System.out.println(stopTime);
		System.out.println((stopTime - startTime));
		
		
		fos.close();
		fis.close();

		
	}
}