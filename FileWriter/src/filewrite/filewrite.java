package filewrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter
 */

public class filewrite {

	public static void main(String[] args) {

		Write();
		Read();

	}
	public static void Write(){

		FileWriter fw =null;
		try {
			fw = new FileWriter("f:\\demo.txt");

			fw.write("��ã���");
			fw.flush();//����һ��Ҫд
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

	//��ȡ����
	public static void Read(){

		FileReader fr =null;
		try {
			fr = new FileReader("f:\\demo.txt");
			int read =-1;
			while((read =fr.read())!= -1){
				
			    Write();
				System.out.print((char)read);
			}

		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}
}
