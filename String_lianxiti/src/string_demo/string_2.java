package string_demo;
/*
 *  ��дһ��������ʵ�ֽ�һ�������ַ���ת���ɶ��ŷָ����ַ�����
	�����ұ߿�ʼÿ���������ö��ŷָ������������£�
    1234567890��������>>>  1,234,567,890
 */
public class string_2 {

	public string_2() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {


		insert_1("1234567890125888");

	}
	public static void insert_1(String str1){

		//String str = str1;
		StringBuffer  sb = new StringBuffer(str1);
		//����
		sb.reverse();
		//System.out.println(sb.toString());

		//��Ҫ���ŵĸ���
		int count = sb.length()/3;  

		//�嶺��
		while(true){	

			sb.insert((count*3), ",");
			count --;

			if(count<= 0)
				break;
		}

		sb.reverse();
		/*//�ж���ĩ�Ƿ�Ϊ����   �Ǿ�ɾ������  ---�±�
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
