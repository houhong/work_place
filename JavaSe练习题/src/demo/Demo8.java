package demo;
/*
 * 猴子吃桃问题。猴子第一天摘下若干个桃子，
 * 当时就吃了一半，还不过瘾，就又吃了一个。第二天又将剩下的桃子吃掉一半，
 * 又多吃了一个。以后每天都吃前一天剩下的一半零一个。
 * 到第 10 天在想吃的时候就剩一个桃子了,
 * 求第一天共摘下来多少个桃子？
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
	public static int function(int sum ,int day){//猴子第几天吃桃子个数的方法
			
			if(day==1){
				return sum;
			}
			
			return function((sum+1)*2, --day);
		
	}

}
