package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/*
 * ���л�   ObjectOutputStream  -----д����
 * �����л� ObjectInputStream  ----- ������
 */

public class Serlizable {

	public Serlizable() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) throws Exception{

		ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("d:\\serilizble.txt"));
		//���� һ������
		Person person = new Person();

		oos.writeObject(person);
		System.out.println(person);
		//ÿ�ζ�������
		oos.close();
		test();

	}
	/*
	 *  �����л�
	 */
	public static void test()throws Exception{

		ObjectInputStream ois =null;
		ois = new ObjectInputStream(  new FileInputStream("d:\\serilizble.txt"));
		Person person =(Person)ois.readObject();
		System.out.println(person);
		System.out.println("����������Ҫ�Ķ�������������");
		ois.close();
	}

}