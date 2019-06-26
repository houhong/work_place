package 作业2;

public class Input implements Runnable {

	Pool pool ;

	public Input(Pool pool) {
	
		this.pool = pool;
	}

	public Input() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void run() {
		
		while(true){
			
			synchronized (pool) {
				if (pool.capacity == 0) {
					//System.out.println("出水完成，需要注水");
					int count = 1;
					while (count<10) {
						System.out.println("正在注入水！！！"+"第"+count+"次");
						count++;
					}
					pool.setCapacity(100);
					pool.notify();
					try {
						pool.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					
				}else {
					System.out.println("正在出水！！！--不能注入");
					
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
