package homework.homework_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * ���������ļ������֣���A�е��ļ�����.avi��β��ȫ��������b�ļ���
 */

public class homework_1 {

	public static void main(String[] args){

		FileInputStream fis =null;
		FileOutputStream fos =null;


		try {
			fis = new FileInputStream("f:\\a.avi");
			fos = new FileOutputStream("d:\\a.avi");
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

}
