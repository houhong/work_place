package 作业2;

import org.omg.CORBA.INTERNAL;
/*
 * 出水
 */
public class Output implements Runnable{

	Pool  pool;
	public Output() {
		// TODO 自动生成的构造函数存根
	}


	public Output(Pool pool) {
		this.pool = pool;
	}

	
	@Override
	public void run() {
		
		while(true){

			synchronized (pool) {

				if (pool.capacity == 100) {
					int count = 1;
					while(count<6){
						System.out.println("正在出水--  出水次数为："+count);
						count++;
					}
					System.out.println("出水完成！ 请注入水！");
					pool.setCapacity(0);
					pool.notify();
					try {
						pool.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					
				} else {
					System.out.println("正在注入水，不能出水---");
					pool.notify();
					try {
						pool.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}


				}

			}
		}


	}

}
