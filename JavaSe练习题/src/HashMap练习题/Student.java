package HashMap��ϰ��;
/*
 * �������ʹ��
 * 
 * ���壺������ʱʹ�÷��͡�


			��ʽ��<>

			class ����<��ĸ�б�>{

			���η� ��ĸ ����;

			���η� ������(��ĸ){   }

			���η� �������� ����(��ĸ)

			}

			//����ʹ���ھ�̬���ԡ���̬������
			
		
			ʹ��:ָ����������

			1.����ʱ���������飻

			2.��ȡ����ʱ����Ҫǿ������ת����

			//����ʹ��ʱ���ܻ�������
			
		
			���ͳ�����ĸ

			T Type ��ʾ����
				K V �ֱ�����ֵ�е�Key��Value
				E ����Element
				����ʾ��ȷ��������
--------------------- 
���ߣ�Shay_Maria 
��Դ��CSDN 
ԭ�ģ�https://blog.csdn.net/jxqingge/article/details/81271285 
��Ȩ����������Ϊ����ԭ�����£�ת���븽�ϲ������ӣ�
 */

public class Student<T1,T2>{

	private T1 javaScore;

	private T2 oracleScore;

	//��������ʱ����ʹ�þ�̬����|��̬����

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

		//ʹ��ʱָ������(��������)

		Student<String,Integer> stu = new Student<String,Integer> ();

		//1.��ȫ�����ͼ��

		stu.setJavaScore("����");

		//2.ʡ�ģ�����ת��

		int it = stu.getOracleScore();  //�Զ�����

	} 



}
