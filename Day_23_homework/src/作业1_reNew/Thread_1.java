package 作业1_reNew;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
/*
 * 线程一 :输出两个数字
 */

public class Thread_1 extends Thread{


	Mutex mutex;
	int index = 0;
	int[] numArr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};

	public Thread_1(Mutex mutex) {

		this.mutex = mutex;
	}


	public Thread_1() {
		// TODO 自动生成的构造函数存根
	}


	@Override
	public void run() {


		while(index<52){
			synchronized (mutex) {

				if(mutex.flag == false){

					//debug
					System.out.print(numArr[index++]);
					System.out.print(numArr[index++]);
					mutex.setSynchrnized(true);
					mutex.notify();
					try {
						mutex.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}else {
					mutex.notify();
					try {
						mutex.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
			}		

		}


	}

}
