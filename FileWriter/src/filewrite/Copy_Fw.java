package filewrite;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
/*
 * �����ļ� ---
 */
import java.io.IOException;

public class Copy_Fw {

	public static void main(String[] args) {
			Copy_2();
	}
	//�����ļ�
	public static void Copy_2(){

		//�����������������
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally{
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}finally{
					if(fr!= null){
						try {
							fr.close();
						} catch (IOException e) {
							// TODO �Զ����ɵ� catch ��
							e.printStackTrace();
						}
					}
				}
			}
		}







	}
}
