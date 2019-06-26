package HashMap练习题;
/*
 * 泛型类的使用
 * 
 * 定义：定义类时使用泛型。


			格式：<>

			class 类名<字母列表>{

			修饰符 字母 属性;

			修饰符 构造器(字母){   }

			修饰符 返回类型 方法(字母)

			}

			//不能使用在静态属性、静态方法上
			
		
			使用:指定具体类型

			1.编译时会进行类别检查；

			2.获取数据时不需要强制类型转换。

			//泛型使用时不能基本类型
			
		
			泛型常见字母

			T Type 表示类型
				K V 分别代表键值中的Key、Value
				E 代表Element
				？表示不确定的类型
--------------------- 
作者：Shay_Maria 
来源：CSDN 
原文：https://blog.csdn.net/jxqingge/article/details/81271285 
版权声明：本文为博主原创文章，转载请附上博文链接！
 */

public class Student<T1,T2>{

	private T1 javaScore;

	private T2 oracleScore;

	//泛型声明时不能使用静态属性|静态方法

	//private static T1 test;



	public T1 getJavaScore(){

		return javaScore;

	}



	public Student(T1 javaScore, T2 oracleScore) {
		super();
		this.javaScore = javaScore;
		this.oracleScore = oracleScore;
	}
	public Student() {
	
	}



	public void setJavaScore(T1 javaScore){

		this.javaScore = javaScore;

	}



	public T2 getOracleScore() {

		return oracleScore;

	}



	public void setOracleScore(T2 oracleScore) {

		this.oracleScore = oracleScore;

	}





	public static void main(String[] args){

		//使用时指定类型(引用类型)

		Student<String,Integer> stu = new Student<String,Integer> ();

		//1.安全：类型检查

		stu.setJavaScore("优秀");

		//2.省心：类型转换

		int it = stu.getOracleScore();  //自动拆箱

	} 



}
