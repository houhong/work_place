package it.woniuxueyuan.view;

import it.woniuxueyuan.utils.InfoByString;

/*
 * 显示主页
 */

public class MainPage {

	public static void main(String[] args) {

		MainPage();
	}

	//1:显示
	public static void MainPage(){
		System.out.println("=====欢迎使用蜗牛atm=======\n");
		System.out.println("请选择你的输入选项： 1：登陆，2：注册： 3：退出：");
		System.out.println("========================\n");

		//调用String 方法：
		int choose = InfoByString.inToByInteger();
		// System.out.println(input);
		switch (choose) {
		case 1:
			 
			System.out.println("请输入你姓名：\n");
			String username = InfoByString.inToByString();
			//System.out.println(username);
			
			System.out.println("请输入你密码：\n");
			String password= InfoByString.inToByString();
			System.out.println(password);
			break;
		
		case 2:
			/*System.out.println("请输入你密码：\n");
			String password= InfoByString.inToByString();
			System.out.println(password);*/
		case 3:
			
		default:
			break;
		}
		



	}
}
