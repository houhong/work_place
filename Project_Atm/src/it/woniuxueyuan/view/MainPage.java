package it.woniuxueyuan.view;

import it.woniuxueyuan.utils.InfoByString;

/*
 * ��ʾ��ҳ
 */

public class MainPage {

	public static void main(String[] args) {

		MainPage();
	}

	//1:��ʾ
	public static void MainPage(){
		System.out.println("=====��ӭʹ����ţatm=======\n");
		System.out.println("��ѡ���������ѡ� 1����½��2��ע�᣺ 3���˳���");
		System.out.println("========================\n");

		//����String ������
		int choose = InfoByString.inToByInteger();
		// System.out.println(input);
		switch (choose) {
		case 1:
			 
			System.out.println("��������������\n");
			String username = InfoByString.inToByString();
			//System.out.println(username);
			
			System.out.println("�����������룺\n");
			String password= InfoByString.inToByString();
			System.out.println(password);
			break;
		
		case 2:
			/*System.out.println("�����������룺\n");
			String password= InfoByString.inToByString();
			System.out.println(password);*/
		case 3:
			
		default:
			break;
		}
		



	}
}
