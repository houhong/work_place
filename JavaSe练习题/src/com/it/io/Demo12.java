package com.it.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.text.Position.Bias;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.PortableServer.ServantActivator;
/*
 * ��ȡָ��Ŀ¼�£�ָ����չ�����ļ�(������Ŀ¼�е�)����Щ�ļ��ľ���·��д�뵽һ���ı��ļ��С�
     ��˵�����ǽ���һ��ָ����չ�����ļ��嵥��
 */

public class Demo12 {

	public Demo12() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

	}

	//�����ļ���
	public static void treaverseDir(String  fatherPath, String targetFile){

		//����
		File fatherFile = new File(fatherPath);

		File[] listFiles = fatherFile.listFiles();

		//�ݹ�
		for (File subFile : listFiles) {

			if (!subFile.isDirectory()) {
				if (targetFile.equals(subFile.getAbsolutePath())) {

					writeFile(subFile, targetFile);

				}
			} else {

				treaverseDir(subFile.getAbsolutePath(), targetFile);

			}
		}




	}

	public static void writeFile(File file,String targetPath){

		try {
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(new File(targetPath));
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			int read = 0;
			byte[] buffer = new byte[1024];

			while ((read =bis.read(buffer))!= -1){
				bos.write(buffer,0,read);

			}
			if (bis!= null) {
				bis.close();

			}
			if (bos!= null) {
				bos.close();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}



}
