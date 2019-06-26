package 作业3;
/*
 *   abc abc
 */

public class Renew {

	public Renew() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {

		Locked_key locked_key = new Locked_key();
		//t0
		Thread t0 = new Thread("线程一"){


			int count =0;
			@Override
			public void run() {

				while(count<6){

					synchronized (locked_key) {
						if(locked_key.key == 1){
							System.out.print("a");
							locked_key.setKey(2);
							count++;
							/*locked_key.notifyAll();
							try {
								locked_key.wait();
							} catch (InterruptedException e) {
								// TODO 自动生成的 catch 块
								e.printStackTrace();
							}*/
						}else{
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



			}

		};

		Thread t1 = new Thread("线程二"){

			int count =0;
			@Override
			public void run() {

				while(count<6){

					synchronized (locked_key) {
						if(locked_key.key == 2){

							System.out.print("b");
							locked_key.setKey(3);
							count++;
							locked_key.notifyAll();
							/*try {
								locked_key.wait();
							} catch (InterruptedException e) {
								// TODO 自动生成的 catch 块
								e.printStackTrace();
							}*/
						}else{
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


			}

		};


		Thread t2 = new Thread("线程三"){

			int count =0;
			@Override
			public void run() {


				while(count<6){

					synchronized (locked_key) {

						if(locked_key.key == 3){

							System.out.print("c ");
							locked_key.setKey(1);
							count++;
							locked_key.notifyAll();

							/*try {
								locked_key.wait();
							} catch (InterruptedException e) {
								// TODO 自动生成的 catch 块
								e.printStackTrace();
							}*/
						}else{

							try {
								locked_key.notify();
								locked_key.wait();
							} catch (InterruptedException e) {
								// TODO 自动生成的 catch 块
								e.printStackTrace();
							}

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
