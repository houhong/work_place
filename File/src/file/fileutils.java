package file;

import java.io.File;

/*
 * file������
 */
public class fileutils {

	public fileutils() {
		// TODO �Զ����ɵĹ��캯�����
	}
	/**
	 * �����ļ������ļ��в��������Զ������ļ��У����ļ�������ɾ�����ļ�
	 * @param path :�������ļ�·��
	 * */
	public static File createNewFile(String pathname){
		
		File file =new File(pathname);
		
		return file;
	}

}
