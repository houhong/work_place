package hashMap_bianni;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * �ֽ�������ת�����ַ�������
 */


class classDemo {

	public static void main(String[] args) throws Exception {

		FileInputStream fis=null;
		FileOutputStream fos=null;
		InputStreamReader isr=null;
		OutputStreamWriter osr=null;

		/*FileInputStream */ fis = new FileInputStream("f:\\demo.txt");
		/*FileOutputStream*/ fos = new FileOutputStream("d:\\demo.txt");

		//ת����
		//��fisת����reder���� �ַ���ʽ��"utf-8" :��ʾ���ڶ���demo
		/*InputStreamReader*/ isr= new InputStreamReader(fis,"utf-8");
		/*OutputStreamWriter*/ osr = new OutputStreamWriter(fos,"utf-8");

		char[] bytes = new char[1024];
		int reader = -1;

		while((reader=isr.read(bytes))!=-1){
			osr.write(bytes,0,reader);
		}
		//��ס��һ��Ҫ����:һ��Ҫ����!!!!
		if(isr != null){

			isr.close();
		}

	}
}
