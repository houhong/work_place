package homework2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;
/*
 * 	�齱��
 */

public class ChooseReward {

	public ChooseReward() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {


		Thread t0 =new Thread(){

			@Override
			public void run() {
				int i=0;
				while(true){
					//����
					Thread thread =Thread.currentThread();
					thread.setName("�齱��1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
					int[] arr =new int[]{10,5,20,100,200,500,800,2,80,300};	
					Random random = new Random();
					int j =random.nextInt(10);
					int money=arr[j];

					System.out.println(thread.getName()+ "\t" + "�ֲ�����һ��"+money+"Ԫ��");
					i++;
					if(i>10){
						break;
					}
				}


			}	
		};
		Thread t1 =new Thread(new Runnable() {

			@Override

			public void run() {
				int i=0;
				while(true){
					int[] arr =new int[]{10,5,20,100,200,500,800,2,80,300};	

					Thread thread =Thread.currentThread();
					thread.setName("�齱��2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}

					String  newthread =thread.getName();
					Random random = new Random();
					int j =random.nextInt(10);
					int money=arr[j];

					System.out.println(newthread + "\t" + "�ֲ�����һ��"+money+"Ԫ��");

					// random.
					// TODO �Զ����ɵķ������}
					i++;
					if(i>10){
						break;
					}
				}

			}
		});

		t0.start();
		t1.start();
	}


}
