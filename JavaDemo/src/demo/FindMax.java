package demo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;


/*     交了智商税   --刷letcode
 * 给出文本：如    张三，1400
 * 			    李四，1600
 * 			    张三，1500
 * 输出次数最多张三-- 金额1600 
 * 找到最大值！！！！  例如： 
 */
//老师的思路
public class FindMax {

	public FindMax() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) throws Exception {

		//用map存储数据   -- 定义一个对象：属性是：名字，次数，最大金额 --面向对象
		// 然后向map中存入最大的值即可 
		//值是name  键是人
		HashMap<String, Person> hm = new HashMap<>();
		
		//读数据
		BufferedReader br = new BufferedReader(new FileReader("f:\\demo.txt"));
		
		//遍历文件
		String read=null;
		while((read=(br.readLine()))!=null){
			
			//读到的文本文件
			String[] split = read.split(",");
			
			//对字符串的处理  --找到名字和金额
			String usename=split[0];
			//输出username
			//System.out.println(usename);
			//valueOf的意思是：将其转换一下
			int  money=Integer.valueOf(split[1]);
			//输出money
			//System.out.println(money);	
		}
		

	}






}
