package demo1;

import it.woniuxueyuan.utils.InfoByString;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/*
 * try-catch-finlly
 */
import java.io.IOException;
import java.io.WriteAbortedException;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;
import javax.sound.sampled.LineListener;

public class io {

	public static void main(String[] args) {

		Copy_1();
	}

	//copy������
	public static void Copy_1(){

		//�ֲ��������븳��ֵ��
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("d:\\newdemo2.txt");
			fos = new FileOutputStream("f:\\newdemo2.txt");
			byte[] bytes = new byte[1024];
			int read = -1;
			while((read = fis.read(bytes) )!=-1){
				fos.write(bytes,0,read);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}finally{

			//һ��Ҫ�ر�������������������
			if(fis !=null){
				try {
					fis.close();
					System.out.println("һ��Ҫ�ر���!!!!!!!");
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}finally{

					if(fos !=null){
						try {
							fos.close();
							System.out.println("һ��Ҫ�ر���!!!!!!!!");
						} catch (IOException e) {
							// TODO �Զ����ɵ� catch ��
							e.printStackTrace();
						}
					}

				}
			}

		}
	}

	//��󶨵��ļ�д�붫��
	public static void write() {

		FileOutputStream fos = null;

		try {
			//���������
			fos= new FileOutputStream("f:\\newdemo2.txt");

			//��������
			ArrayList<Byte> list = new ArrayList<>();

			//��������
			System.out.println("��������Ҫд������ݣ�");
			String str =  InfoByString.inToByString();


			char[] charArray = str.toCharArray();

			for(char c: charArray){

				list.add((byte)c);
			}
			//fos.write(list);

		} catch ( IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();

			//��������ʱ�쳣
			throw new RuntimeException(e);
		}finally{
			//һ��Ҫ������������
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}
}
