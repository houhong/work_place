package Demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.ProgressMonitor;

/*
 * properties�Ҳ����ļ���  --- ע�����������
 * properties  -- �����ļ�����hashTable�����һ�����ļ�
 * 
 * ---�Լ�ֵ��ʵ�ֵ�  --void load(InputStream inStream) 
          		        ���������ж�ȡ�����б�����Ԫ�ضԣ��� 
 */

public class text1 {

	public text1() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) throws Exception {
		
		//����properties
		Properties pro = new Properties();
		//�����ļ�  --ע���������Ŀ¼��
		pro.load(new FileInputStream("test.properties"));
		String name=pro.getProperty("name");
		System.out.println(name);
		//store����  -- ����д��ȥ
		pro.store(new FileOutputStream("test.properties"), "hahhaha");
		
		
		
		
		
	}

}
