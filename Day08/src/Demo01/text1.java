package Demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.ProgressMonitor;

/*
 * properties找不到文件夹  --- 注意事项：必须在
 * properties  -- 配置文件：是hashTable下面的一个类文件
 * 
 * ---以键值对实现的  --void load(InputStream inStream) 
          		        从输入流中读取属性列表（键和元素对）。 
 */

public class text1 {

	public text1() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) throws Exception {
		
		//创建properties
		Properties pro = new Properties();
		//加载文件  --注意事项：放在目录下
		pro.load(new FileInputStream("test.properties"));
		String name=pro.getProperty("name");
		System.out.println(name);
		//store方法  -- 用于写进去
		pro.store(new FileOutputStream("test.properties"), "hahhaha");
		
		
		
		
		
	}

}
