package File��ϰ��;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
 * copyĿ¼�ļ���
 */

public class Copy {

	public Copy() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {

	}
	//destination
	public static void copy_dictory(File originFile,File destFile ){

		File[] listFiles = originFile.listFiles();
		for (File subFile : listFiles) {

			if (subFile.isDirectory()) {
				copy_dictory(subFile, new File(destFile.getAbsolutePath()+"\\"+subFile.getName()));              
			} else if(subFile.isFile()){

				try {

					//1������NIO -- �õ�ͨ��
					FileInputStream fis = new FileInputStream(subFile);
					FileOutputStream fos = new FileOutputStream(destFile);
					
					FileChannel finc = fis.getChannel();
					FileChannel foutc = fos.getChannel();	

					//2������������
					ByteBuffer buffer = ByteBuffer.allocate(1024);

					//����������
					try {
						finc.read(buffer);
					} catch (IOException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				} catch (FileNotFoundException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}




			}
		}

		// 3���������飬������ļ�����IO����д
		// 4��������ļ��о͵ݹ����





	}

}
