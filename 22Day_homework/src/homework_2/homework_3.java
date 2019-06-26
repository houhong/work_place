package homework_2;

import java.io.FileInputStream;
import java.nio.Buffer;

/*
 * 逆序文件
 */
public class homework_3 {

	public homework_3() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) throws Exception{

		FileInputStream fis = new FileInputStream("f:\\write.txt");

		int judge=-1;
		char data=(char)fis.read();
		// System.out.println(data);
		byte[] buffer = new byte[1024];
		
		while((judge=fis.read(buffer))!=-1){

			//System.out.println(data1);
			String data1=new String(buffer,0,judge);
			StringBuffer  stringBuffer=	new StringBuffer(data1);
			StringBuffer reverse = stringBuffer.reverse();
			System.out.println(reverse);

		}
		fis.close();

	}

}
