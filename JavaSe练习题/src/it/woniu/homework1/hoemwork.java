package it.woniu.homework1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.junit.Test;

/*
 *
3��һ���ı��ļ���¼��1000�����������������Լ���ʼ��������
��������Ϊ�����û������п����Ѽ�¼��
���Ѽ�¼��Ϣ�������� ���ѽ��ҳ����Ѵ��������û���
���Ҹ��û�����������ߵĽ���Ƕ��٣�
�����ļ����ݸ�ʽ
����,666
����,7893
����,9999
��ȡ�����Ϊ���������Ѵ�����࣬������ѽ��Ϊ��9999
--------------------- 

 */
/*
 * ��ʦ��������
 */
public class hoemwork {

	public hoemwork() {
		// TODO �Զ����ɵĹ��캯�����
	}



	public static void main(String[] args) throws Exception{

		File file = new File("f:storeMoney.txt");
		//boolean judge  = createFile("f:storeMoney.txt");
		//�����ж��Ƿ��ļ������ɹ���
		boolean judge=file.createNewFile();
		if(judge){
			List<String> setName = new ArrayList<>();
			//Set<String>   setName  = new HashSet<>();
			
			//д��������  --- ��˼ʱ��"����"  �Ž�setName��������
			setName("����",setName);
			setName("����", setName);
			setName("����",setName);
			setName("��ǿ", setName);
			//��ʼ������
			initData(file, setName);
		}else {
			return;
		}
	}
	//�����ı���
	public static boolean createFile(String pathname){

		File file = new File(pathname);

		boolean judge =true;
		try {
			judge = file.createNewFile();

		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return judge;

	}

	//��ʼ������
	public static void initData(File file,List<String> setName)throws Exception{

		int count = 1;
		int MAX_MONENY = 10000;
		int lopCont = 1000;
		int size= setName.size();
		BufferedWriter br  = new BufferedWriter(new FileWriter(file));
		StringBuffer sb  = new StringBuffer();
		Random random = new Random();
		while(count<lopCont){

			//���������
			int money = random.nextInt(MAX_MONENY);
			String name =setName.get(random.nextInt(size));

			sb.append(name);
			sb.append(",");
			sb.append(money);
			br.write(sb.toString());
			count++;
			sb.delete(0, sb.length());

		}
	}

	public static void setName(String name,List<String> nameArr){

		nameArr= new ArrayList<>();	
		nameArr.add(name);


	}










}








