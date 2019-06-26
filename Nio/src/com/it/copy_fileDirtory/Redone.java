package com.it.copy_fileDirtory;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
/*
 * 拷贝一个文件夹：按照原来的目录进行
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Redone {

	public Redone() {
		// TODO 自动生成的构造函数存根
	}



	//主函数
	public static void main(String[] args) {

		  File originaFile = new File("f:\\mysql");
		  File destFile = new File("d:\\mysql");
		  destFile.mkdir();
		  
		 int count =   copy_dir(originaFile, destFile,0);
		 System.out.println("总文件夹是："+count);
		
		
	}

	//copy
	public static int  copy_dir(File originalFile,File destFile,int count){
		
		File[] listFiles = originalFile.listFiles();
		for (File subFile : listFiles) {
			count++;
			if (subFile.isDirectory()) {
				//递归调用
				//保证层次一致
				File subDestFile = new File(destFile.getAbsolutePath()+"\\" + subFile.getName());
				subDestFile.mkdir();
				//RAM overflow
				copy_dir(subFile, subDestFile,count);
			} else if(subFile.isFile()){
				//打印
				
				

				copyTool(subFile, destFile);
				
			}

			

		}
		return count;	

	}
	public static void copyTool(File originalFile,File destFile){
		
		long startTime = System.currentTimeMillis();
		try {

			FileInputStream fis  = new FileInputStream(originalFile);
			
			//保证层次一致-- 用当前的目标文件夹的绝对路径和源文件夹的名字做拼接
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
				System.out.println("花费时间是：" + (endTime - startTime));
				
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		

			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}





}
