package String��ϰ��;

import org.junit.Test;

public class string {

	public string() {
		// TODO �Զ����ɵĹ��캯�����
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
			
			// ����ָ���ַ��ڴ��ַ����е�һ�γ��ִ�������
			i=name.indexOf(str_son,i);
			if(i == -1){
				break;
			}
			System.out.println(i);
			//���ص�ʱ������Ҫ�仯
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
	 * ����һ���ַ���,�жϸ��ַ������Ƿ����ĳ���Ӵ�.�������,����Ӵ������г���λ��.
                ��:"abcbcbabcb34bcbd"��,"bcb"�Ӵ��ĳ���λ��Ϊ: 1,7,12.
                 �ַ������Ӵ������û�����
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
			System.out.println("������----");
		}
	}
	

}
