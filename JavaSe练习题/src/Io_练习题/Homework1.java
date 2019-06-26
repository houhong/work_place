package Io_��ϰ��;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.omg.PortableServer.ServantActivator;
/*
 * ��һ�� �ڵ���D���´���һ���ļ�ΪHelloWorld.txt�ļ����ж������ļ�����Ŀ¼���ڴ���һ��Ŀ
          ¼IOTest,֮��HelloWorld.txt�ƶ���IOTestĿ¼��ȥ��֮�����IOTest���Ŀ¼�µ���
          ��
 */

public class Homework1 {

	public Homework1() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {

		 
		// �ڵ���D���´���һ���ļ�ΪHelloWorld.txt�ļ�
		File file = new File("f:\\HelloWorld.txt");
		try {
				
			
			//����һ���ļ������ж��Ƿ񴴽��ɹ�
			boolean flag =file.createNewFile();
			if (flag) {

				if (file.isDirectory()) {

					System.out.println("����һ��Ŀ¼");
				} else {
					System.out.println("����һ���ļ�");
					
					//�ļ�·��
					File ioTest = new  File("f:\\IOTest");
					
					//��ioTest��Ϊ·������һ��Ŀ¼
					boolean flag1=ioTest.mkdir();
						
					//������
					//�����ֻ��дbyte 
					BufferedInputStream bis  =  new BufferedInputStream(new FileInputStream(file));
					BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(ioTest.getAbsolutePath()+"\\"+file.getName()));                         
					
					int read = 0;
					byte[] buffer = new byte[1024];

					while( (read = bis.read(buffer))!= -1){
						bos.write(buffer,0,read);
					}
					
					if(flag1){
						File[] listFiles = ioTest.listFiles();
						for (File subFile : listFiles) {
							   System.out.println(subFile.toString());
						}
					}
					
					//�ر���
					bis.close();
					bos.close();

				}

			} else {
				System.out.println("����ʧ�ܣ�����");
			}
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}



	}

}
