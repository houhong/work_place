package string_demo;


import java.util.Random;
/*
 * ��Ŀ��
1. ����һ���ַ���,�жϸ��ַ������Ƿ����ĳ���Ӵ�.�������,����Ӵ������г���λ��.
��:"abcbcbabcb34bcbd"��,"bcb"�Ӵ��ĳ���λ��Ϊ: 1,7,12.�ַ������Ӵ������û�����
2.����һ������,�������һ���ó��ȵ��ַ���,�ɴ�д,Сд��ĸ�Լ��������
Java�������������:
java.util.Random r = new java.util.Random();
int a = r.nextInt(100): a 0-99�������
3.����һ����������ɵ��ַ���,��:"1239586838923173478943890234092",ͳ��
��ÿ�����ֳ��ֵĴ���
 */
import java.util.Scanner;

public class string_1 {

	public string_1() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {
		//Test_1("abcbcbabcb34bcbd", "bcb");
		functon2(10);
	}
	public static void Test_1(String str,String son){


		int index =0;
		while(true){
			if(index  == -1){
				break;
			}
			index=str.indexOf(son,index);
			System.out.println(index);
			index +=son.length();
			//str =str.substring(index);
		}


	}
	/*
	2.����һ������,�������һ���ó��ȵ��ַ���,�ɴ�д,Сд��ĸ�Լ��������
	Java�������������:
	java.util.Random r = new java.util.Random();
	int a = r.nextInt(100): a 0-99�������
	 */
	public static void functon2(int len){

		String str = "abcdefghijklmnopqrstuvwxyz";
		//�ַ�����
		char[] char_1 = new char[str.length()];
		char[] char_2 = new char[str.length()];
		int[]  int_3  =  new int[10];
		byte[] bytes = str.getBytes();

		int len_1 =  0;
		int len_2 = 0;
		for (byte b : bytes) {

			char i=(char)b;

			char_1[len_1++] =i;
			//len_1++;
		}


		for (byte b : bytes) {

			b -=32;
			//  System.out.println(b);

			char i=(char)b;

			char_2[len_2++] =i;

			//System.out.println(i);

		}

		for(int i=0;i<10;i++){

			int_3[i]=i;

		}
		//StringBuffer str1=null;  --��������
		StringBuffer str1= new StringBuffer();
		int i =0;
		while(true){


			Random  random  = new Random();
			int index =random.nextInt(char_1.length);

			char small = char_1[index];
			char large = char_2[index];
			
			Random  random1  = new Random();
			int index1 =random1.nextInt(9);
			
			int  number = int_3[index1];


			/*Integer.valueOf(small);
		Integer.valueOf(large);
		Integer.valueOf(number);*/
			/*  ����*/
			//��δ���
			i++;
			str1.append(i);
		
			
			System.out.println(str1.length());
			if(str1.length()==len){
				System.out.println(str1);
				break;
			}

		} 


	}
}
