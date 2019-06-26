package Synchronized;

import org.omg.PortableServer.ServantActivator;
/*
 * 多线程共享的资源
 */

public class Resource {

	public static Object obj  = new Object();
	public Resource() {
		// TODO 自动生成的构造函数存根
	}
	public static  void wc(){
		synchronized(obj){
			try{
				System.out.println(Thread.currentThread()+"使用厕所----");
			}catch(Exception e){
				e.printStackTrace();;
			}
		}
	}

}

