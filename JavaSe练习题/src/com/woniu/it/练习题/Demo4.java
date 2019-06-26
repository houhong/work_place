package com.woniu.it.��ϰ��;
/*
 * �����java��ȡ���ļ�  -- nio
 */



/**
 *�����java��ȡ���ļ�
 */
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

class ReadBigFile {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		//���建�����Ĵ�СΪ1KB
		int bufSize = 1024;
		byte [] bs = new byte[bufSize];
		
		ByteBuffer byteBuffer = ByteBuffer.allocate(bufSize);
		FileChannel channel = new RandomAccessFile("c://dmmsi.log","r").getChannel();
		int size;
		//��ȡ�������������
		while((size = channel.read(byteBuffer))!=-1){
			byteBuffer.rewind();
			byteBuffer.get(bs);
			System.out.println(new String(bs, 0, size));
			byteBuffer.clear();			
		}
		channel.close();
		
	}

}

