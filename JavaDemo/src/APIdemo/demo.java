package APIdemo;

import java.util.Date;

import org.junit.Test;
/*
 * д��Щdemo��Ϊ����ϤAPI��java��̵Ļ����﷨
 */

public class demo {

	public demo() {
		// TODO �Զ����ɵĹ��캯�����
	}

	@Test
	//ʱ���������
	public void Test(){
		//����һ��Date
		Date date = new Date();

		//��API�ĵ� ����д����������
		long time = date.getTime();
		System.out.println(time);
		System.out.println(date);

	}
}
