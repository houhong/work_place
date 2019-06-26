package practice_work;

import java.io.BufferedReader;
import java.io.FileReader;
/*
 * 1.将a.txt文件中的单词与b.txt文件中的单词交替合并到c.txt文件中，
 *   a.txt文件中的单词用回车符分隔，b.txt文件中用回车或空格进行分隔
 */

public class Number2 {

	public Number2() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("e:\\b.txt"));

		String line=null;
		while(true){

			line=br.readLine();
			
			if(line ==null){
				break;
			}
		}



		System.out.println(line);
	}
}
