package practice_work;

import java.io.BufferedReader;
import java.io.FileReader;
/*
 * 1.��a.txt�ļ��еĵ�����b.txt�ļ��еĵ��ʽ���ϲ���c.txt�ļ��У�
 *   a.txt�ļ��еĵ����ûس����ָ���b.txt�ļ����ûس���ո���зָ�
 */

public class Number2 {

	public Number2() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("e:\\b.txt"));

		String line=null;
		while(true){

			line=br.readLine();
			
			if(line ==null){
				break;
			}
		}



		System.out.println(line);
	}
}
