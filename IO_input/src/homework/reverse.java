package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import com.sun.org.apache.bcel.internal.generic.NEW;

import jdk.jfr.events.FileWriteEvent;
import sun.applet.Main;
/*
 * ��ת�ļ�
 */

public class reverse {

	public reverse() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {

		//������д����
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		//1:��д�ļ�

		try {
			fileReader = new FileReader("f:\\write.txt");

			fileWriter = new FileWriter("d:\\write.txt");

			//׼������
			StringBuffer stringBuffer = new StringBuffer();

			int reader =-1;
			char[] buffer =new char[1024];
			//��д
			while( (reader =fileReader.read())!= -1){


				//�������������������  --д��������
				//static{
				stringBuffer.append( new String(buffer,0,reader));

				stringBuffer.reverse();



				//}
				//�����������д����

				fileWriter.write(buffer,0,reader);

			}


		} catch (Exception e) {

			// TODO: handle exception
		}


	}

}
