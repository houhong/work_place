package demo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;


/*     ��������˰   --ˢletcode
 * �����ı�����    ������1400
 * 			    ���ģ�1600
 * 			    ������1500
 * ��������������-- ���1600 
 * �ҵ����ֵ��������  ���磺 
 */
//��ʦ��˼·
public class FindMax {

	public FindMax() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) throws Exception {

		//��map�洢����   -- ����һ�����������ǣ����֣������������ --�������
		// Ȼ����map�д�������ֵ���� 
		//ֵ��name  ������
		HashMap<String, Person> hm = new HashMap<>();
		
		//������
		BufferedReader br = new BufferedReader(new FileReader("f:\\demo.txt"));
		
		//�����ļ�
		String read=null;
		while((read=(br.readLine()))!=null){
			
			//�������ı��ļ�
			String[] split = read.split(",");
			
			//���ַ����Ĵ���  --�ҵ����ֺͽ��
			String usename=split[0];
			//���username
			//System.out.println(usename);
			//valueOf����˼�ǣ�����ת��һ��
			int  money=Integer.valueOf(split[1]);
			//���money
			//System.out.println(money);	
		}
		

	}






}