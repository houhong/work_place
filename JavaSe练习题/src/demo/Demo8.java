package demo;
/*
 * ���ӳ������⡣���ӵ�һ��ժ�����ɸ����ӣ�
 * ��ʱ�ͳ���һ�룬������񫣬���ֳ���һ�����ڶ����ֽ�ʣ�µ����ӳԵ�һ�룬
 * �ֶ����һ�����Ժ�ÿ�춼��ǰһ��ʣ�µ�һ����һ����
 * ���� 10 ������Ե�ʱ���ʣһ��������,
 * ���һ�칲ժ�������ٸ����ӣ�
 */

public class Demo8 {

	public Demo8() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		//System.out.println(function(1));
		System.out.println(function(1, 10));
		
	}
	
	//
	public static int function(int sum ,int day){//���ӵڼ�������Ӹ����ķ���
			
			if(day==1){
				return sum;
			}
			
			return function((sum+1)*2, --day);
		
	}

}
