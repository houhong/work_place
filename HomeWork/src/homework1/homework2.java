package homework1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class homework2 implements Runnable{

	public homework2() {
		// TODO �Զ����ɵĹ��캯�����
	}

    
	 

	public String tieme(){
		SimpleDateFormat sdf  = new SimpleDateFormat("YYYY��MM��dd��  HHʱMM��ss��");	
		Date date = new Date();
		/*System.out.println(date);*/
		String date1=sdf.format(date);
		return date1;

	}
	@Override
	public void run() {

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

}
