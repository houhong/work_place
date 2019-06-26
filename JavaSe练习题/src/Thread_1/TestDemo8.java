package Thread_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestDemo8 {
	
	/**
	 * �ṩһ���ļ������ķ���������Ҫʵ�ֹ��ܣ���һ���ļ�������λ�ÿ��Բ����κ�����
	 * @param filePath �ļ�·��
	 * @param postion  ׷���������λ��
	 * @param contens  ׷������
	 */
	public static void addContainsToFile(String filePath,int position,String contents){
        
		try {
			//����һ���ļ�
            File file = new File(filePath);
            System.out.println(file);
        
            if (!(file.exists() && file.isFile())) {
                System.out.println("�ļ�������  ~ ");
                return;
            }
            if ((position < 0) || (position > file.length())) {
                System.out.println("position���Ϸ� ~ ");
                return;
            }

            //������ʱ�ļ�
            File tempFile = File.createTempFile("temp", ".temp", new File("F:/"));
            FileOutputStream out = new FileOutputStream(tempFile);
            FileInputStream in = new FileInputStream(tempFile);
            //���˳�JVM�˳�ʱ�Զ�ɾ��
            tempFile.deleteOnExit();
            
            //�ļ��������
            RandomAccessFile rw = new RandomAccessFile(file, "rw");
            
            
            rw.seek(position);

            int tmp;
            //��positionλ�ú������д����ʱ�ļ�
            while ((tmp = rw.read()) != -1) {
                out.write(tmp);
            }
            rw.seek(position);
            rw.write(contents.getBytes());
            
            while ((tmp = in.read()) != -1) {
                rw.write(tmp);
            }
            rw.close();
            out.close();
            in.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
		


	
	public static void main(String[] args) {
		String filePath = "f:\\write.txt";
		int postion = 9;
		String contens = "hhh";
		addContainsToFile(filePath,postion,contens);
	}

}


