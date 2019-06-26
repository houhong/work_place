package 作业2;
/*
 * 池塘
 * 
 */

public class Pool {

	public int capacity = 100;//key ：用于观察池塘是否需要注入水 --初始化为出水

	public Pool() {
		// TODO 自动生成的构造函数存根
	}


	public Pool(int capacity) {
		this.capacity = capacity;
	}


	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}



}
