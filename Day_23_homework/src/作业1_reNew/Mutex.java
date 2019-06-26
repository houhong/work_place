package 作业1_reNew;
/*
 * 对象锁
 */

public class Mutex {
	
	public boolean flag = false;//Key ：用于决定哪个线程运行 -- 让第一个线程先运行
	public Mutex() {
		// TODO 自动生成的构造函数存根
	}
	
	
	
	public Mutex(boolean synchrnized) {
		super();
		flag = synchrnized;
	}


	public boolean getSynchrnized() {
		return flag;
	}
	public void setSynchrnized(boolean synchrnized) {
		flag = synchrnized;
	}
	
	

}
