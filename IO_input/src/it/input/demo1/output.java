package it.input.demo1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * �����FileOutput
 */
public class output {

	public static void main(String[] args) throws Exception {
		
		//����һ���ļ������   --- ���������ֱ�Ӵ���һ���ı�
		FileOutputStream fileOutputStream = new FileOutputStream("f:\\newdemo2.txt");
		
		//���ļ�д������
		fileOutputStream.write(97);//a
		
		//д������
		byte[] bytes = {98,99,100,101};
		fileOutputStream.write(bytes);
		
		//�ü�㷽��
		fileOutputStream.write("���".getBytes());
		
		fileOutputStream.close();
		
		
	}
}
