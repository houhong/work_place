package Io_��ϰ��;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
/*
 * ���������ļ������ƣ���A�ļ�������ȫ��������B�ļ��У�Ҫ��ʹ�ö��߳���������
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import HashMap��ϰ��.homework5;

public class Homework5 {

	//��־λ�����Ա����Ƕ��ļ�����д�ļ�
	public  static  boolean flag = true;//��ʼ��Ϊ���ļ�

	public Homework5() {
		// TODO �Զ����ɵĹ��캯�����s
	}

	public static void main(String[] args) throws FileNotFoundException {



		Object obj = new Object();

		byte[] buffer = new byte[1024];

		//�߳�һ�����ڶ��ļ� -- ͬ��
		Thread inputThread = new Thread("�����߳�"){

			@Override
			public void run() {
				synchronized (homework5.class) {

					//����t0qia
					if (flag ==true) {
						//ִ�ж�����;
						try {
							File intputFIle = new File("d:\\A.txt");
							BufferedInputStream bis = new BufferedInputStream(new FileInputStream(intputFIle));

							int len = 0;

							len =bis.read(buffer);

							if(len == -1){

								bis.close();
								flag = false;
								this.notify();
								this.wait();
							}
						} catch (IOException | InterruptedException e) {
							// TODO �Զ����ɵ� catch ��
							e.printStackTrace();
						}


					} else {

						this.notify();

						try {
							this.wait();
						} catch (InterruptedException e) {
							// TODO �Զ����ɵ� catch ��
							e.printStackTrace();
						}
					}
				}

			}

		};

		//�̶߳�����д�ļ�
		Thread outputThread = new Thread("����߳�"){

			@Override

			public void run() {
				
				//��˯һ���
				try {
					sleep(500);
				} catch (InterruptedException e1) {
					
					e1.printStackTrace();
				}
				synchronized (homework5.class) {

					if (flag  == false) {
					
						try {
							File destFile= new File("e:\\B.txt");
							BufferedOutputStream bos;
							bos = new BufferedOutputStream(new FileOutputStream(destFile));
							bos.write(buffer);
							bos.close();
						
							this.notify();
							this.wait();

						} catch ( IOException e) {
							// TODO �Զ����ɵ� catch ��
							e.printStackTrace();
						} catch (InterruptedException e) {
							// TODO �Զ����ɵ� catch ��
							e.printStackTrace();
						}
					} else {

						notify();

						try {
							this.wait();
						} catch (InterruptedException e) {
							// TODO �Զ����ɵ� catch ��
							e.printStackTrace();
						}
					}

				}

			}



		};
		outputThread.start();
		inputThread.start();




	}


}
