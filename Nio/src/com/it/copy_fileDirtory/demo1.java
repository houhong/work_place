package com.it.copy_fileDirtory;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
/*
 * �����ļ��е������ļ���Ŀ���ļ�
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.sound.midi.spi.MidiFileWriter;
import javax.swing.plaf.metal.OceanTheme;

public class demo1 {

	public demo1() {
		// TODO �Զ����ɵĹ��캯�����
	}



	public static void main(String[] args) {
		int count = 0;	
		File originalFile = new File("F:\\mysql");
		//search(originalFile);
		File dir = new File("d:\\mysql");
		dir.mkdir();
		count = copy_dir(originalFile, dir,count);
		System.out.println("�ļ������ǣ�"+count);
	}


	public static void search(File originalFile){

		File[] listFiles = originalFile.listFiles();

		for (File subFile : listFiles) {

			if (!subFile.isDirectory()) {
				System.out.println(subFile.toString());
			} else {
				search(subFile);
			}

		}


	}
	//�����ļ���
	public static int copy_dir(File originlDir,File  destDir,int count){
		
		
		
		File[] listFiles = originlDir.listFiles();
		
		for (File subFile : listFiles) {
			if(!subFile.isDirectory()){
				count+=listFiles.length;
			}
			
			//1��������ļ��У��͵ݹ����
			if (subFile.isDirectory()) {

				//�������ر���Ҫ
				File subDestFile = new File(destDir.getAbsolutePath()+"\\"+subFile.getName());   
				//��Ŀ¼����һ���ļ���
				subDestFile.mkdir();
			
				copy_dir(subFile, subDestFile,count);
				//	copy_dir(subFile, );
			} else if(subFile.isFile()){
				
				count = copyTool(subFile, destDir,count);
				
			}
		} 
		
		return count;

	}

	//��������
	public static int  copyTool(File orignalFile, File destFile,int count){

		try {
			long starttime = System.currentTimeMillis();

			FileInputStream fis = new FileInputStream(orignalFile);
			//Ŀ����ļ������ֵľ���·��+Դ�ļ�������
			FileOutputStream fos = new FileOutputStream(destFile.getAbsolutePath()+"\\"+orignalFile.getName());

			//������
			BufferedInputStream br = new BufferedInputStream(fis);
			BufferedOutputStream bw = new BufferedOutputStream(fos);

			//��������д��
			int len=0;
			byte[] buffer = new byte[1024];

			while(-1 !=(len=br.read(buffer))){
				bw.write(buffer,0,len);
			}

			br.close();
			bw.close();
			long endTime = System.currentTimeMillis();
			String path = destFile.getAbsolutePath()+"\\"+orignalFile.getName();
			System.out.println(path);
			System.out.println("��ǰ�ļ�����ʱ�䣺"+(endTime-starttime));
			count ++;
			

		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return count;

	}


}



