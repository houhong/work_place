package Synchronized;

import org.omg.PortableServer.ServantActivator;
/*
 * ���̹߳������Դ
 */

public class Resource {

	public static Object obj  = new Object();
	public Resource() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static  void wc(){
		synchronized(obj){
			try{
				System.out.println(Thread.currentThread()+"ʹ�ò���----");
			}catch(Exception e){
				e.printStackTrace();;
			}
		}
	}

}

