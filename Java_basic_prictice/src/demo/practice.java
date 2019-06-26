package demo;

import java.io.File;

import javax.print.DocFlavor.STRING;
/*
 * File 类的练习
 */
public class practice {

	public static void main(String[] args) {
		
		//1:默认分隔符
		String separator =File.separator;
		
		System.out.println(separator);
		
		//2：路径修饰符
		separator =File.pathSeparator;
		
		System.out.println(separator);
		
		
	}

}
