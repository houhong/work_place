package it.woniuxueyuan.demo01;
/*
 * ��web��Ŀ��Ҳһ��
 */

import java.io.FileInputStream;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class demo01 {

	public demo01() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) throws Exception{
		Properties pro = new Properties();
		pro.load(new FileInputStream("new.properties"));
		
	}

}
