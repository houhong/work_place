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
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) throws FileNotFoundException {

		//��ȡͨ��
		FileInputStream fis = new FileInputStream("C:\\Program Files (x86)");
		FileChannel fc = fis.getChannel();
		
		//��ȡ������
		ByteBuffer buffer = ByteBuffer.allocate(1024*10);
		
		try {
			fc.read(buffer);
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			throw new RuntimeException("��֪�����������ô��");
		}
		



	}

}
