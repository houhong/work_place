package homework;

public class Thread_B implements Runnable{


	Mutex obj ;
	public Thread_B(Mutex obj) {

		this.obj=obj;
	}
	/*public static void main(String[] args) {
		String str="abcdefghijklmnopqrstuvwxyz";
		System.out.println(str.length());
	}*/


	@Override
	public void run() {
		// 输出一个字母
		synchronized (obj) {

			//flag == false  表示A线程运行
			if(obj.flag == false){
				obj.notify();
				obj.flag=true;
			}else{
				//准备字母 
				String str="abcdefghijklmnopqrstuvwxyz";
				byte[] byteArray = str.getBytes();
					System.out.println("这是线程B");
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
