package homework1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class homework3 {

	public homework3() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {

		//t1Ϊ�ػ��߳�
		Thread t1 =new Thread("�ػ��߳�"){

			@Override
			public void run() {
				// TODO �Զ����ɵķ������

				while(true){

					System.out.println("�����ػ��߳�");
				}
			}

		};

		Thread t2 = new Thread( new Runnable() {

			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				long startTime = System.currentTimeMillis();

				for (int i = 0; i < 100; i++) {
					Scanner scanner = new Scanner(System.in);
					//String  sc      =s
					Thread currentThread = Thread.currentThread();

					System.out.println(currentThread.getName()+"����������"+tieme());
				}
				long  endTime  =System.currentTimeMillis();

				System.out.println((endTime-startTime));

			}
		});
		t2.start();
		t1.setDaemon(true);
		t1.start();
	
	}

	public static String tieme(){
		SimpleDateFormat sdf  = new SimpleDateFormat("YYYY��MM��dd��  HHʱMM��ss��");	
		Date date = new Date();
		/*System.out.println(date);*/
		String date1=sdf.format(date);
		return date1;

	}

}
