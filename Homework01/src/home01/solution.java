package home01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 复制
 */

public class solution {

	public solution() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) throws Exception{
		
		BufferedOutputStream bos = null;
		BufferedInputStream  bis = null;
		
		//定义缓冲：
		bos = new BufferedOutputStream(new FileOutputStream("e:\\a.text"));
		bis =new BufferedInputStream(new FileInputStream("f:\\a.text"));
		
		byte[] bytes =new byte[1024];
		int ch = -1;
		while((ch=bis.read(bytes)) != -1){
			
			bos.write(bytes,0,ch);
		}
		
		bos.close();
		bis.close();
	}

}
