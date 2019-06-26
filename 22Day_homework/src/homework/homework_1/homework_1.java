package homework.homework_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 输入两个文件夹名字：以A中的文件夹以.avi结尾的全部拷贝到b文件夹
 */

public class homework_1 {

	public static void main(String[] args){

		FileInputStream fis =null;
		FileOutputStream fos =null;


		try {
			fis = new FileInputStream("f:\\a.avi");
			fos = new FileOutputStream("d:\\a.avi");
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
