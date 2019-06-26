package com.nio;

import java.io.FileInputStream;
/*
 * Nio
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.w3c.dom.ranges.RangeException;

public class demo1 {

	public demo1() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) throws FileNotFoundException {

		//获取通道
		FileInputStream fis = new FileInputStream("C:\\Program Files (x86)");
		FileChannel fc = fis.getChannel();
		
		//获取缓冲区
		ByteBuffer buffer = ByteBuffer.allocate(1024*10);
		
		try {
			fc.read(buffer);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			throw new RuntimeException("能知道哪里出错了么？");
		}
		



	}

}
