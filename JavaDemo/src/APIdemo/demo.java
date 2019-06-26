package APIdemo;

import java.util.Date;

import org.junit.Test;
/*
 * 写这些demo是为了熟悉API和java编程的基础语法
 */

public class demo {

	public demo() {
		// TODO 自动生成的构造函数存根
	}

	@Test
	//时间和日期类
	public void Test(){
		//创建一个Date
		Date date = new Date();

		//查API文档 可以写出来的数据
		long time = date.getTime();
		System.out.println(time);
		System.out.println(date);

	}
}
