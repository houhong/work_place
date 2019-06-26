package com.woniu.it.练习题;
/*
 * 如何用java读取大文件  -- nio
 */



/**
 *如何用java读取大文件
 */
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

class ReadBigFile {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		//定义缓冲区的大小为1KB
		int bufSize = 1024;
		byte [] bs = new byte[bufSize];
		
		ByteBuffer byteBuffer = ByteBuffer.allocate(bufSize);
		FileChannel channel = new RandomAccessFile("c://dmmsi.log","r").getChannel();
		int size;
		//读取到输入流的最后
		while((size = channel.read(byteBuffer))!=-1){
			byteBuffer.rewind();
			byteBuffer.get(bs);
			System.out.println(new String(bs, 0, size));
			byteBuffer.clear();			
		}
		channel.close();
		
	}

}

