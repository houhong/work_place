package com.iwoniu.sinletion;

/**
 * @author layker   :创建单列模式
 * 
 *
 */
public class Singletion {


	public static Singletion s = null;

	public Singletion() {
		// TODO 自动生成的构造函数存根
	}

	public static Singletion getInstance(){

		if(s==null){
			synchronized (s.getClass()) {
				if(s==null){
					
					Singletion s = new Singletion();
				}
			}
		}
		return s;
	}
	//生成get 和set方法
	public static Singletion getS() {
		return s;
	}

	public static void setS(Singletion s) {
		Singletion.s = s;
	}

}
