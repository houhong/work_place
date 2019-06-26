package filewrite;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
/*
 * 复制文件 ---
 */
import java.io.IOException;

public class Copy_Fw {

	public static void main(String[] args) {
			Copy_2();
	}
	//复制文件
	public static void Copy_2(){

		//定义输入流和输出流
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter("f:\\write.txt");

			int read = -1;
			while((read=fr.read())!= -1){
				fw.write(read);
				fw.flush();
			}

			fr = new FileReader("d:\\write.txt");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}finally{
					if(fr!= null){
						try {
							fr.close();
						} catch (IOException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}
				}
			}
		}







	}
}
