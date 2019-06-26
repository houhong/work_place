package 作业1_reNew;
/*
 * 输出一个字母
 */

public class Thread_2 extends Thread{


	Mutex mutex;
	int index = 0;
	char[] charArr = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	public Thread_2(Mutex mutex) {
		this.mutex = mutex;
	}

	public Thread_2() {
		// TODO 自动生成的构造函数存根
	}


	@Override
	public void run() {
		// TODO 自动生成的方法存根


		while(index<26){
			synchronized (mutex) {

				if (mutex.flag == true) {


					char ch = charArr[index];
					System.out.println(ch+ " ");
					index++;
					mutex.setSynchrnized(false);
					mutex.notify();
					try {
						mutex.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				} else {
					//若先拿到钥匙  -- 还是要等待让此线程回到等待列表
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
