package home01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * ����
 */

public class solution {

	public solution() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) throws Exception{
		
		BufferedOutputStream bos = null;
		BufferedInputStream  bis = null;
		
		//���建�壺
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
