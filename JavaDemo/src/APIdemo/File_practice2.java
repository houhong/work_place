package APIdemo;

import java.io.File;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

/*
 * 
 *  File类的删除功能
 *  boolean delete()
 *  删除的文件或者是文件夹,在File构造方法中给出
 *  删除成功返回true,删除失败返回false
 *  删除方法,不走回收站,直接从硬盘中删除
 *  删除有风险,运行需谨慎
 *
 */

public class File_practice2 {

	//delete 删除此文件夹
	public static void main(String[] args) {

		//创建一个文件夹
		File file = new File("F:\\练习所用的文件夹");
		//创建第二个文件夹
		File file2 = new File("f:");
		//创建第三个文件夹
		File file3 = new File(file2,"练习所用的文件夹");

		boolean isDelete = file3.delete();
		System.out.println(isDelete);

	}

	/*
	 *  File创建文件的功能
	 *  
	 *  
	 *  
	 */
	@Test
	public void Test(){
		File file = new File("f:\\abce.txt");
		boolean isCreate = file.mkdirs();
		System.out.println(isCreate);
	}

	/*
	 * createNewFile(); --- 表示当且仅当不存在此文件夹时，不可分的创建一个文件夹
	 */
	@Test
	public void function() throws Exception{

		File file = new File("f:\\abcdef");
		boolean isCreate = file.createNewFile();
		System.out.println(isCreate);

		File file2 = new File("f:\\abcdef");
		boolean createNewFile = file.createNewFile();
		System.out.println(createNewFile);
	}

	/*
	 *  File类的获取功能
	 */

	/*
	 * File类的获取功能
	 * 
	 * 
	 * 获取父路径
	 */
	@Test
	public void function2(){

		//创建一个file 类
		File file = new File("F:\\abce.txt");

		String parent = file.getParent();
		System.out.println(parent);

		File parentFile = file.getParentFile();
		System.out.println(parentFile);
	}
	/*
	 * File类获取功能
	 * String getAbsolutePath() 返回String对象
	 * File   getAbsoluteFile() 返回File对象
	 * 获取绝对路径
	 * eclipse环境中,写的是一个相对路径,绝对位置工程根目录
	 */

	@Test
	public void function4(){

		File file = new File("src");

		String absolutePath = file.getAbsolutePath();	
		System.out.println("绝对路径名是："+absolutePath);

		File absoluteFile = file.getAbsoluteFile();
		System.out.println(absoluteFile);


	}
	/*
	 *  File判断功能
	 *  boolean isDirectory()
	 *  判断File构造方法中封装的路径是不是文件夹
	 *  如果是文件夹,返回true,不是文件返回false
	 *  
	 *  boolean isFile()
	 *  判断File构造方法中封装的路径是不是文件
	 */

	@Test
	public void functon(){


		File file = new File("f:\\abcdef");
		boolean isdirectory =file.isDirectory();

		System.out.println(isdirectory);

		File file1 = new File("f:\\abce.txt");
		isdirectory= file1.isDirectory();
		System.out.println(isdirectory);



	}

	/*
	 * listFiles(FilenameFilter filter) 
	 * 
		          返回抽象路径名数组，
		          这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
	 */
	










}
