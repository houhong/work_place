package com.it.copy_fileDirtory;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
/*
 * 拷贝文件夹的所有文件到目标文件
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.sound.midi.spi.MidiFileWriter;
import javax.swing.plaf.metal.OceanTheme;

public class demo1 {

	public demo1() {
		// TODO 自动生成的构造函数存根
	}



	public static void main(String[] args) {
		int count = 0;	
		File originalFile = new File("F:\\mysql");
		//search(originalFile);
		File dir = new File("d:\\mysql");
		dir.mkdir();
		count = copy_dir(originalFile, dir,count);
		System.out.println("文件总数是："+count);
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
	//拷贝文件夹
	public static int copy_dir(File originlDir,File  destDir,int count){
		
		
		
		File[] listFiles = originlDir.listFiles();
		
		for (File subFile : listFiles) {
			if(!subFile.isDirectory()){
				count+=listFiles.length;
			}
			
			//1：如果是文件夹，就递归调用
			if (subFile.isDirectory()) {

				//这两句特别重要
				File subDestFile = new File(destDir.getAbsolutePath()+"\\"+subFile.getName());   
				//子目录创建一个文件夹
				subDestFile.mkdir();
			
				copy_dir(subFile, subDestFile,count);
				//	copy_dir(subFile, );
			} else if(subFile.isFile()){
				
				count = copyTool(subFile, destDir,count);
				
			}
		} 
		
		return count;

	}

	//拷贝工具
	public static int  copyTool(File orignalFile, File destFile,int count){

		try {
			long starttime = System.currentTimeMillis();

			FileInputStream fis = new FileInputStream(orignalFile);
			//目标的文件夹名字的绝对路径+源文件的名字
			FileOutputStream fos = new FileOutputStream(destFile.getAbsolutePath()+"\\"+orignalFile.getName());

			//缓冲流
			BufferedInputStream br = new BufferedInputStream(fis);
			BufferedOutputStream bw = new BufferedOutputStream(fos);

			//缓冲流的写法
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
			System.out.println("当前文件所用时间："+(endTime-starttime));
			count ++;
			

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return count;

	}


}



