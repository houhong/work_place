package demo;

import java.io.File;

import javax.print.DocFlavor.STRING;
/*
 * File �����ϰ
 */
public class practice {

	public static void main(String[] args) {
		
		//1:Ĭ�Ϸָ���
		String separator =File.separator;
		
		System.out.println(separator);
		
		//2��·�����η�
		separator =File.pathSeparator;
		
		System.out.println(separator);
		
		
	}

}
