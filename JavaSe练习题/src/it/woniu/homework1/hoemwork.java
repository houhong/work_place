package it.woniu.homework1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.junit.Test;

/*
 *
3、一个文本文件记录了1000条数据数据内容需自己初始化产生。
数据内容为部分用户的银行卡消费记录，
消费记录信息包含姓名 消费金额，找出消费次数最多的用户，
并且该用户单笔消费最高的金额是多少？
例：文件内容格式
张三,666
李四,7893
张三,9999
获取结果则为：张三消费次数最多，最高消费金额为：9999
--------------------- 

 */
/*
 * 老师的做法：
 */
public class hoemwork {

	public hoemwork() {
		// TODO 自动生成的构造函数存根
	}



	public static void main(String[] args) throws Exception{

		File file = new File("f:storeMoney.txt");
		//boolean judge  = createFile("f:storeMoney.txt");
		//用于判断是否文件创建成功？
		boolean judge=file.createNewFile();
		if(judge){
			List<String> setName = new ArrayList<>();
			//Set<String>   setName  = new HashSet<>();
			
			//写法有歧义  --- 意思时将"张三"  放进setName数组里面
			setName("张三",setName);
			setName("李四", setName);
			setName("王五",setName);
			setName("赵强", setName);
			//初始化数据
			initData(file, setName);
		}else {
			return;
		}
	}
	//创建文本，
	public static boolean createFile(String pathname){

		File file = new File(pathname);

		boolean judge =true;
		try {
			judge = file.createNewFile();

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return judge;

	}

	//初始化数据
	public static void initData(File file,List<String> setName)throws Exception{

		int count = 1;
		int MAX_MONENY = 10000;
		int lopCont = 1000;
		int size= setName.size();
		BufferedWriter br  = new BufferedWriter(new FileWriter(file));
		StringBuffer sb  = new StringBuffer();
		Random random = new Random();
		while(count<lopCont){

			//产生随机数
			int money = random.nextInt(MAX_MONENY);
			String name =setName.get(random.nextInt(size));

			sb.append(name);
			sb.append(",");
			sb.append(money);
			br.write(sb.toString());
			count++;
			sb.delete(0, sb.length());

		}
	}

	public static void setName(String name,List<String> nameArr){

		nameArr= new ArrayList<>();	
		nameArr.add(name);


	}










}








