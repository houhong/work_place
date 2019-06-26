package Thread_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestDemo8 {
	
	/**
	 * 提供一个文件操作的方法，其需要实现功能：对一个文件的任意位置可以插入任何内容
	 * @param filePath 文件路径
	 * @param postion  追加内容添加位置
	 * @param contens  追加内容
	 */
	public static void addContainsToFile(String filePath,int position,String contents){
        
		try {
			//定义一个文件
            File file = new File(filePath);
            System.out.println(file);
        
            if (!(file.exists() && file.isFile())) {
                System.out.println("文件不存在  ~ ");
                return;
            }
            if ((position < 0) || (position > file.length())) {
                System.out.println("position不合法 ~ ");
                return;
            }

            //创建临时文件
            File tempFile = File.createTempFile("temp", ".temp", new File("F:/"));
            FileOutputStream out = new FileOutputStream(tempFile);
            FileInputStream in = new FileInputStream(tempFile);
            //在退出JVM退出时自动删除
            tempFile.deleteOnExit();
            
            //文件随机访问
            RandomAccessFile rw = new RandomAccessFile(file, "rw");
            
            
            rw.seek(position);

            int tmp;
            //将position位置后的内容写入临时文件
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


