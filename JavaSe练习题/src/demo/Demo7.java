package demo;
/*
 * 
7.��֤����Ȳ��롱����������Ȼ��������������
 �Ͷ������� 3 �ټ� 1������ż�����Ͷ������� 2�������õ�һ���������ٰ��������������м��㣬
һֱ������ȥ�����ձ�Ȼ�õ� 1��
 */

public class Demo7 {

	public Demo7() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		System.out.println(function(4));
	}

	
	public static boolean function(int num){
		
		if(num==1){
			return true;
		}
		if(num%2==0){
			num=(num/2);
		}else{
			num=num*3+1;
		}
		
		return function(num);
	}
	
}
