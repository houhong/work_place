package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * �ֽ�������  -- ����
 */
public class demo {

	public demo() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) throws Exception{
		
		int count_zhangsan = 0;
		int count_lisi     = 0;
		
		BufferedReader br = new BufferedReader( new FileReader("f:\\demo.txt"));
		/*
		while(true){
			
			String line =br.readLine();
			   
			String name =line.substring(0, 2);
			
			if(name.equals("����")){
				count++;
			}
			System.out.println(count);
			
		
			
			if(line ==null){
				break;
			}
			*/
		/*int count= 0;*/
		String read =null;
		while((read=br.readLine())!=null){
			//System.out.println(read); -- ���в���
			
			String newString=read.substring(0, 2);
			if(newString.endsWith("����")){
				count_zhangsan++;
			}
			if(newString.endsWith("����")){
				count_lisi++;
			}
			
		}
		
		int Max=0;
		//System.out.println("�����Ĵ���="+count_zhangsan);
		//System.out.println("���ĵĴ���="+count_lisi);
		if(count_zhangsan>=count_lisi){
			System.out.println("�����Ĵ�����ࣺ"+ count_zhangsan);
			
		}else {
			System.out.println("���ĵĴ�����ࣺ"+count_lisi);
		}
		//System.out.println(Max);
		
		
	}





}