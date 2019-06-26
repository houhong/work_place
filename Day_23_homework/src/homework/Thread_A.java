package homework;
/*
 *   输出2个字 
 */
public class Thread_A implements Runnable{

	Mutex obj ;
	//准备数组

	public Thread_A(Mutex obj) {
		this.obj =obj;// TODO 自动生成的构造函数存根
	}

	public Thread_A() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void run() {
		//输出两个数字
		while(true){
			synchronized (obj) {

				//如果标志位为true,线程B运行
				if(obj.flag==true){
					obj.notify();
					obj.flag=false;
				}	

				int[] numArray =new int[52];
				for (int i = 0; i < 52; i++) {

					numArray[i] = (i+1);
				}


				System.out.println("这是线程A");	

				try {
					wait();
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}

			}

		}
	}

}


