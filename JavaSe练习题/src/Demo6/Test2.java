package Demo6;

import java.util.Timer;
/*
 * 2������������ļ��ϣ����ϵ�ÿ��Ԫ�ض���һ�η�Χ
             ���佻�������罻��{[4,8],[9,13]}��{[6,12]}�Ľ���
             ��{[6,8],[9,12]}
 */
import java.util.TimerTask;

public class Test2 {

	public Test2() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {

		Timer t = new Timer();



		t.schedule(new TimerTask() {

			@Override
			public void run() {
				System.out.println("��ʱ");

			}
		},1000);
		//System.out.println("���main");
	}


}
