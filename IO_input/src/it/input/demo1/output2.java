package it.input.demo1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 *  FileOutputStream �ļ�����д�ͻ�������
 *  ��д: FileOutputStream���췽��, �ĵڶ���������,����true
 *  ���ļ���,д�뻻��,���Ż���  \r\n
 *  \r\n ����д����һ�е�ĩβ, Ҳ����д����һ�еĿ�ͷ
 */
public class output2 {

	public static void main(String[] args) throws Exception {
		
		//����һ���ļ������   --- ���������ֱ�Ӵ���һ���ı�
		FileOutputStream fileOutputStream = new FileOutputStream("f:\\newdemo2.txt",true);
		
		//���У�
		
		 //fileOutputStream.write("hello\r\n".getBytes());
		 fileOutputStream.write("hello world\r\n".getBytes());
	    /*	
		fileOutputStream.write("hello\r\n".getBytes());
		fileOutputStream.write("world".getBytes());
		fileOutputStream.write("\r\n world hello".getBytes());
		fileOutputStream.close();*/
		/*//���ļ�д������
		fileOutputStream.write(97);//a
		
		//д������
		byte[] bytes = {98,99,100,101};
		fileOutputStream.write(bytes);
		
		//�ü�㷽��
		fileOutputStream.write("���".getBytes());
		
		fileOutputStream.close();*/
		
		
		
	}
}
