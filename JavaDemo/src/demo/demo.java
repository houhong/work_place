package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * 字节输入流  -- 复制
 */
public class demo {

	public demo() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) throws Exception{
		
		int count_zhangsan = 0;
		int count_lisi     = 0;
		
		BufferedReader br = new BufferedReader( new FileReader("f:\\demo.txt"));
		/*
		while(true){
			
			String line =br.readLine();
			   
			String name =line.substring(0, 2);
			
			if(name.equals("张三")){
				count++;
			}
			System.out.println(count);
			
		
			
			if(line ==null){
				break;
			}
			*/
		/*int count= 0;*/
		String read =null;
		while((read=br.readLine())!=null){
			//System.out.println(read); -- 进行操作
			
			String newString=read.substring(0, 2);
			if(newString.endsWith("张三")){
				count_zhangsan++;
			}
			if(newString.endsWith("李四")){
				count_lisi++;
			}
			
		}
		
		int Max=0;
		//System.out.println("张三的次数="+count_zhangsan);
		//System.out.println("李四的次数="+count_lisi);
		if(count_zhangsan>=count_lisi){
			System.out.println("张三的次数最多："+ count_zhangsan);
			
		}else {
			System.out.println("李四的次数最多："+count_lisi);
		}
		//System.out.println(Max);
		
		
	}





}
