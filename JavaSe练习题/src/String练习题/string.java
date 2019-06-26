package String练习题;

import org.junit.Test;

public class string {

	public string() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {
		String  name="abcbcbabcb34bcbd";
		String  str_son="bcb";
				
		function5(name,str_son);
		
		/*String str = "to be or not to be";
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(str);
		System.out.println(stringBuffer);
		stringBuffer.reverse();
		System.out.println(stringBuffer);*/
	}
    
	public static void function5(String  name,String  str_son){
	/*	String  name="abcbcbabcb34bcbd";
		String  str_son="bcb";*/
		int i=0;
		while(true){
			
			// 返回指定字符在此字符串中第一次出现处的索引
			i=name.indexOf(str_son,i);
			if(i == -1){
				break;
			}
			System.out.println(i);
			//返回的时候数字要变化
			i+=str_son.length();
			//String newString =name.substring(i);
			
			
		}
	}

	@Test
	public void function(){
		String str = "to be or not to be";
		StringBuffer stringBuffer = new StringBuffer();
		String[] split = str.split(" ");
		for (String string : split) {
			stringBuffer.append(string);
		}
		System.out.println(stringBuffer);

	}
	/*
	 * 给定一个字符串,判断该字符串中是否包含某个子串.如果包含,求出子串的所有出现位置.
                如:"abcbcbabcb34bcbd"中,"bcb"子串的出现位置为: 1,7,12.
                 字符串和子串均由用户输入
	 */
	public static void function2(String father){
		String string ="abcbcbabcb34bcbd";
		
		if(string.contains("bcb")){
			int i=  string.indexOf("bcb");
			int j= "bcb".length();
			System.out.println(i);
			i+=j;
			System.out.println(i);
			String newString = string.substring(i);
			System.out.println(newString);
			function2(newString);  
		}else{
			System.out.println("结束了----");
		}
	}
	

}
