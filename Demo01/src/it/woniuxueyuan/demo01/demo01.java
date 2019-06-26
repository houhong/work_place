package it.woniuxueyuan.demo01;
/*
 * 在web项目下也一样
 */

import java.io.FileInputStream;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class demo01 {

	public demo01() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) throws Exception{
		Properties pro = new Properties();
		pro.load(new FileInputStream("new.properties"));
		
	}

}
