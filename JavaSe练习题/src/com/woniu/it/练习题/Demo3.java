package com.woniu.it.��ϰ��;
/*
 * ��ϰ��  1���õ����ķ������ж��ǲ���һ�������ַ������硱abdba��

 */

public class Demo3 {

	public Demo3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		System.out.println(function("abcdcba"));


	}

	public static boolean function(String str){

		int count =str.length()-1;

		char[] arr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {

			arr[count--] = str.charAt(i);
		}
		String  after = String.valueOf(arr);

		if (str.equals(after)) {

			return true;
		}
		return false;
	}

}


/**
 * �õ����ķ������ж��ǲ���һ�������ַ������硱abdba��
 * @author BZ70000910
 *
 */
class AbcbA {
	public static void main(String [] args){
		AbcbA instance = new AbcbA();
		System.out.println(instance.isAbcbA("abcba"));
	}

	public boolean isAbcbA(String str){

		while(str.length() > 1){
			int length = str.length();
			char first = str.charAt(0);
			char last = str.charAt(length - 1);
			if(first == last){
				String strcpy = str.substring(1, length - 1);
				System.out.println(strcpy);				
				isAbcbA(strcpy);
			}else{
				return false;				
			}
			//����break,�ͻ������ѭ��,��Ϊ�˳�ѭ��Ҳ��һ��һ��ġ����Ĵ���϶�����˼��
			break;
		}
		return true;
	}
}
class Demo7{
	public static void main(String[] args) {
			function("abcba");
	}

	public static boolean function(String  str){
		//��һ����
		char first = str.charAt(0);
		char last  = str.charAt(str.length()-1);

		while (str.length()>1){

			if (first == last) {
				//�õ��Ӵ�
				String subString = str.substring(1, str.length()-1);
				//��ȥ�Ƚ��Ӵ�
				function(subString);
			}else{
				return false;
			}
			//����ѭ��
			break;
		}
		return true;

	}


}
