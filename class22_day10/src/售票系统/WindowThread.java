package 售票系统;
/*
 * 窗口
 */

public class WindowThread extends Thread{


	public WindowThread() {
		// TODO 自动生成的构造函数存

	}
	//初始化票数
	public  int ticket = 100;

	//设置线程共有对象 --方便加锁

	Object obj;

	//设置名字  和对象锁
	public WindowThread(String name,Object obj) {

		super(name);
		this.obj =obj;
	}

	public WindowThread(int ticket) {
		super();
		this.ticket = ticket;
	}

	public int getTicket() {
		return ticket;
	}



	public  void setTicket(int ticket) {

		this.ticket = ticket;
	}



	@Override
	public void run() {

		//对象锁  --同一个
		synchronized (obj) {
			while(true){


				if(ticket>0){
					//卖票
					System.out.println(Thread.currentThread().getName()+"卖了第"+(ticket--)+"票");
					ticket--;
				}
				if(ticket<=0){
					break;
				}
			}
		}

	}



}
