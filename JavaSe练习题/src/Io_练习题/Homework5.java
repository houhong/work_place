package Io_练习题;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
/*
 * 输入两个文件夹名称，将A文件夹内容全部拷贝到B文件夹，要求使用多线程来操作。
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import HashMap练习题.homework5;

public class Homework5 {

	//标志位：用以表明是读文件还是写文件
	public  static  boolean flag = true;//初始化为读文件

	public Homework5() {
		// TODO 自动生成的构造函数存根s
	}

	public static void main(String[] args) throws FileNotFoundException {



		Object obj = new Object();

		byte[] buffer = new byte[1024];

		//线程一：用于读文件 -- 同步
		Thread inputThread = new Thread("输入线程"){

			@Override
			public void run() {
				synchronized (homework5.class) {

					//表明t0qia
					if (flag ==true) {
						//执行读操作;
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
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}


					} else {

						this.notify();

						try {
							this.wait();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}
				}

			}

		};

		//线程二用于写文件
		Thread outputThread = new Thread("输出线程"){

			@Override

			public void run() {
				
				//先睡一会儿
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
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					} else {

						notify();

						try {
							this.wait();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
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
