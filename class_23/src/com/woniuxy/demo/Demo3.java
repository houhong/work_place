package com.woniuxy.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/*
 * //װ����ģʽ
 * (3)��������Ĵ�ӡ��ʽ������д�뵽D:\\count.txt�ļ���(Ҫ���ø�Ч��)
3.�ô���ʵ����������
	(1)��֪�����ļ�config.properties����������ֵ��
   		name=zhangsan
   		score=80
   		address=beijing
	(2)ʹ��IO�ֽ��������Properties����ʹ��,�������ļ��е�score����ֵ�޸�Ϊ100
 */
public class Demo3 {

	public Demo3() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws Exception{
		function("score", "10");
		
	}
	public static void function(String key,String value) throws Exception{

		Properties pro = new Properties();
		//ע��һ�㣺��ַ�Ļ�ȡ
		File file = new File("config.properties");
		
		//������
		FileInputStream fis = new FileInputStream(file);
		
		pro.load(fis);
		
		pro.setProperty(key, value);
		FileOutputStream fos = new FileOutputStream(file);
		pro.store(fos, "");
		
		fos.close();
		fis.close();
	}

}