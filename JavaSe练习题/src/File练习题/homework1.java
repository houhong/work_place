package File练习题;

import java.io.File;
/*
 * 获取文件夹的长度
 */

public class homework1 {

	public homework1() {
		// TODO 自动生成的构造函数存根
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

	//删除文件夹下的所有目录
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
