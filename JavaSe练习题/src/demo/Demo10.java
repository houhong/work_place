package demo;
/*
 * 打印各种三角形
 */

public class Demo10 {

	public Demo10() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		
		int row =4;
		
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < row-i; j++) {
				System.out.print(" ");
			}
			
			//打印等腰三角形
			for (int j = 0; j <2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
			String a = new String("abc");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
