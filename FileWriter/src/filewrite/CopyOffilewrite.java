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

			fw.write("��ã���");
			fw.flush();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally{
			if(fw!= null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
					throw new RuntimeException("����ʱ�쳣��������");
				}
			}
		}

	}
}
