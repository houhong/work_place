package Thread_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;

import String��ϰ��.string;

/*
 * 1���ṩһ���ļ������ķ���������Ҫʵ�ֹ��ܣ���һ���ļ�������λ�ÿ��Բ����κ�����
 */
/**
 * @param filepath  �ļ�·��
 * @param postion   ����λ��
 * @param toContents ��������
 */

public class Utils {



	public static void main(String[] args) throws Exception{

		
		String filepath ="f:\\write.txt";
		int postion = 2;
		String contens = "hhh";
		
		Function(filepath, postion, contens);
	}


	public static void Function(String filepath,int postion,String toContents) throws IOException{

		//���ļ�λ�ú�������ݸ��Ƶ���ʳ�ļ��У�Ȼ����Ҫд�����ݼӽ�ȥ �ٽ���ʳ�ļ�д��ȥ

		File file = new File(filepath);

		if(!(file.exists()) && file.isFile()){
			System.out.println("�ļ�������");

			return;
		}

		if(postion<0 || postion> file.length()){

			System.out.println("����λ�ò��Ϸ�������");
			return;
		}

		//������ʱ�ļ�
		File temp = file.createTempFile("temp",".temp", new File("f:\\"));

		FileOutputStream fos = new FileOutputStream(temp);
		FileInputStream fis  =  new FileInputStream(file);
		
		//��JVMֹͣʱ��ɾ���ļ�
		temp.deleteOnExit();


		//��ȡ�ļ� 
		RandomAccessFile randomAcess = new RandomAccessFile(file, "rw");
		
		randomAcess.seek(postion);	
		
		//��postion�����ļ�д����ʱ�ļ���
		int tempindex;
		if(  ( tempindex =randomAcess.read())!= -1 ){
			 		fos.write(tempindex);
		}
		
		//������д���ļ�
		randomAcess.seek(postion);
		randomAcess.write(toContents.getBytes());
			while((tempindex = fis.read())!= -1){
				
				randomAcess.write(tempindex);
			}
			randomAcess.close();
			fos.close();
			fis.close();
	}
}
