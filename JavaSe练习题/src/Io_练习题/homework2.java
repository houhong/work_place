package Io_��ϰ��;

import java.io.File;

/*
 * ������ �ݹ�ʵ����������Ŀ¼���г��ļ��Լ��ļ��У�Ч����ͼ
 */
public class homework2 {

	public homework2() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {

		allFile("f:\\tomacat");

	}

	public static void allFile(String pathname){
		
		//·��
		File file = new File(pathname);
		
		File[] listFiles = file.listFiles();

		for (File subFile : listFiles) {
			if (!subFile.isDirectory()) {
				//System.out.println(subFile.getAbsolutePath());
				System.out.println(subFile.toString());
			} else if(subFile.isDirectory()) {

				allFile(subFile.toString());
			}
		}
	}

}


