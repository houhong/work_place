package filewrite;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter
 */

public class CopyOffilewrite {

	public static void main(String[] args) {
		FileWriter fw =null;
		try {
			fw = new FileWriter("f:\\demo.txt");

			fw.write("你好！！");
			fw.flush();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			if(fw!= null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
					throw new RuntimeException("运行时异常！！！！");
				}
			}
		}

	}
}
