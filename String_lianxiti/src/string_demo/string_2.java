package string_demo;
/*
 *  编写一个方法，实现将一个数字字符串转换成逗号分隔的字符串，
	即从右边开始每三个数字用逗号分隔，输出结果如下：
    1234567890————>>>  1,234,567,890
 */
public class string_2 {

	public string_2() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {


		insert_1("1234567890125888");

	}
	public static void insert_1(String str1){

		//String str = str1;
		StringBuffer  sb = new StringBuffer(str1);
		//逆序
		sb.reverse();
		//System.out.println(sb.toString());

		//需要逗号的个数
		int count = sb.length()/3;  

		//插逗号
		while(true){	

			sb.insert((count*3), ",");
			count --;

			if(count<= 0)
				break;
		}

		sb.reverse();
		/*//判断文末是否为逗号   是就删除逗号  ---下表
		if(sb.charAt((sb.length() -1 )) ==','){
			System.out.println(sb.substring(0,sb.length()-1));
		}else {
			System.out.println(sb.toString());
		}*/
		if(sb.charAt(0)==','){
			System.out.println(sb.substring(1,sb.length()));
		}else {
			System.out.println(sb.toString());

		}
	}

}
