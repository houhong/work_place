package File��ϰ��;

import java.io.File;
/*
 * ��ȡ�ļ��еĳ���
 */

public class homework1 {

	public homework1() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {


		//getFile(file);
		File file = new File("f:\\abc");
		//deleteAll(file);
		//getFile(file);

	}

	public static void getFile(File file){

		File[] listFiles = file.listFiles();
		for (File f : listFiles) {

			if (!f.isDirectory()) {
				System.out.println(f.toString());
			} else {
				getFile(f);
			}

			/*
			if (f.isFile()) {
				System.out.println(f);
				System.out.println(f.toString());
			} else {
				getFile(f);
			}*/

		}

	}

	//ɾ���ļ����µ�����Ŀ¼
	public static void deleteAll(File file){

		File[] listFiles = file.listFiles();
		for (File f : listFiles) {
			if (!f.isDirectory()) {
				f.delete();
			} else {
				deleteAll(f);
			}
		}


	}





}
