package demo;
/*
 * 3.我国最高山峰是珠穆朗玛峰，8848米。现在我有一张足够大的纸，
 * 它的厚度是0.01米。请问，我折叠多少次，可以折成珠穆朗玛峰的高度。
 */

public class Demo4 {

	public Demo4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
			System.out.println(function(1,0));
	}
	
	public static int function(double height,int count){
		
		if(height>=884800){
			return count;
		}

		return function(height*2, ++count);
		
	}
}
