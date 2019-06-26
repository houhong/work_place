package 作业3;


public class Text {

	public Text() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		Locked_key locked_key =new Locked_key();//创造一把钥匙

		//开启线程一
		Thread t0 =new Thread(){

			@Override
			public  void  run() {
				int count =0;
				while(count<7){
					count++;
					synchronized (locked_key) {

						if(locked_key.key == 1){
							//waiy
							System.out.print("a");

							locked_key.setKey(2);
						}

						locked_key.notifyAll();
						try {
							locked_key.wait();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}
				}

			}

		};
		//开启线程二
		Thread t1=	new Thread(){

			@Override
			public void run() {

				int count =0;
				while(count<2){
					
					synchronized (locked_key) {

						if(locked_key.key == 2){

							System.out.print("b");
							locked_key.setKey(3);
							count++;

						}
						locked_key.notifyAll();
						// TODO 自动生成的方法存根


						try {
							locked_key.wait();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}
				}
			}

		};

		//开启线程3
		Thread t2 =new Thread(){

			@Override
			public void run() {
				int count =0;
				while(count<7){
					
					synchronized (locked_key) {

						if(locked_key.key == 3){
							System.out.print("c" + " ");
							count++;
							locked_key.setKey(1);
						}
						// TODO 自动生成的方法存根

						locked_key.notifyAll();
						try {
							locked_key.wait();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}


					}
				}
			}


		};
		t0.start();
		t1.start();
		t2.start();

	}

}
