package com.woniu.it.练习题;

import java.io.File;
import java.io.FileNotFoundException;
/*
 * 将a.txt文件中的单词与b.txt文件中的单词交替合并到c.txt
 */
import java.io.FileReader;

public class Demo12 {

	public Demo12() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws Exception {
		
	    FileMannager fileA = new FileMannager("e:\\a.txt",new char[]{'\n'});
	    FileMannager fileAB= new FileMannager("e:\\a.txt",new char[]{'\n',' '});
	}
	

}
class FileMannager{
	
    String[] words;//存储处理后的文件
    int pos=0;//words的数组索引
	
	public FileMannager(String filename,char[] seprators) throws Exception {
		
		//创建一个文件
		File file = new File(filename);
		
		//读入文件
		FileReader fr = new FileReader(file);
		//数组
		char[] buffer = new char[(int)file.length()];
		//将流中的数据读入到buffer中
		int len= fr.read(buffer);
		//将读取到的数据转换成string
		String result = new String(buffer, 0, len);
		//处理正则表达式
		String regex = null;
		
		if (seprators.length>1) {
			regex=""+seprators[0]+"|"+seprators[1];
		} else {
			regex=""+seprators[0];
		}
		
		//字符数组
		words=result.split(regex);
		
		
	}
	/*
	 * 读取words
	 */
	public String nexrWord(){
		
		if (pos==words.length) {
			return null;
		}
		
		//返回当前数组元素
		return words[pos++];
		
	}
	
}



