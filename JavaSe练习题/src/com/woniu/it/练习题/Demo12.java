package com.woniu.it.��ϰ��;

import java.io.File;
import java.io.FileNotFoundException;
/*
 * ��a.txt�ļ��еĵ�����b.txt�ļ��еĵ��ʽ���ϲ���c.txt
 */
import java.io.FileReader;

public class Demo12 {

	public Demo12() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws Exception {
		
	    FileMannager fileA = new FileMannager("e:\\a.txt",new char[]{'\n'});
	    FileMannager fileAB= new FileMannager("e:\\a.txt",new char[]{'\n',' '});
	}
	

}
class FileMannager{
	
    String[] words;//�洢�������ļ�
    int pos=0;//words����������
	
	public FileMannager(String filename,char[] seprators) throws Exception {
		
		//����һ���ļ�
		File file = new File(filename);
		
		//�����ļ�
		FileReader fr = new FileReader(file);
		//����
		char[] buffer = new char[(int)file.length()];
		//�����е����ݶ��뵽buffer��
		int len= fr.read(buffer);
		//����ȡ��������ת����string
		String result = new String(buffer, 0, len);
		//����������ʽ
		String regex = null;
		
		if (seprators.length>1) {
			regex=""+seprators[0]+"|"+seprators[1];
		} else {
			regex=""+seprators[0];
		}
		
		//�ַ�����
		words=result.split(regex);
		
		
	}
	/*
	 * ��ȡwords
	 */
	public String nexrWord(){
		
		if (pos==words.length) {
			return null;
		}
		
		//���ص�ǰ����Ԫ��
		return words[pos++];
		
	}
	
}



