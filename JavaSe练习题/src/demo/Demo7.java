package demo;
/*
 * 
7.验证“鬼谷猜想”：对任意自然数，若是奇数，
 就对它乘以 3 再加 1；若是偶数，就对它除以 2，这样得到一个新数，再按上述计算规则进行计算，
一直进行下去，最终必然得到 1。
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
