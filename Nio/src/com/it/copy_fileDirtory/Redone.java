package com.it.copy_fileDirtory;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
/*
 * ����һ���ļ��У�����ԭ����Ŀ¼����
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Redone {

	public Redone() {
		// TODO �Զ����ɵĹ��캯�����
	}



	//������
	public static void main(String[] args) {

		  File originaFile = new File("f:\\mysql");
		  File destFile = new File("d:\\mysql");
		  destFile.mkdir();
		  
		 int count =   copy_dir(originaFile, destFile,0);
		 System.out.println("���ļ����ǣ�"+count);
		
		
	}

	//copy
	public static int  copy_dir(File originalFile,File destFile,int count){
		
		File[] listFiles = originalFile.listFiles();
		for (File subFile : listFiles) {
			count++;
			if (subFile.isDirectory()) {
				//�ݹ����
				//��֤���һ��
				File subDestFile = new File(destFile.getAbsolutePath()+"\\" + subFile.getName());
				subDestFile.mkdir();
				//RAM overflow
				copy_dir(subFile, subDestFile,count);
			} else if(subFile.isFile()){
				//��ӡ
				
				

				copyTool(subFile, destFile);
				
			}

			

		}
		return count;	

	}
	public static void copyTool(File originalFile,File destFile){
		
		long startTime = System.currentTimeMillis();
		try {

			FileInputStream fis  = new FileInputStream(originalFile);
			
			//��֤���һ��-- �õ�ǰ��Ŀ���ļ��еľ���·����Դ�ļ��е�������ƴ��
			FileOutputStream fos = new FileOutputStream(destFile.getAbsolutePath()+"\\"+originalFile.getName());                      

			BufferedInputStream br  = new BufferedInputStream(fis);
			BufferedOutputStream bw = new BufferedOutputStream(fos);
			
			int len = 0;
			byte[] arr = new  byte[1024];
			
			try {
				
				while((len = br.read(arr))!=-1){
					
					bw.write(arr,0,len);
				}
				
				br.close();
				bw.close();
				
				long endTime = System.currentTimeMillis();
				System.out.println("����ʱ���ǣ�" + (endTime - startTime));
				
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
		

			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}





}
