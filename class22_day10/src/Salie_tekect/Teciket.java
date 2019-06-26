package Salie_tekect;


/*
 * 票数
 */

public class Teciket {

	public Teciket() {
		// TODO 自动生成的构造函数存根
	}

	static int total =100;
	public static void Sale(){
		Object obj = new Object();


		synchronized (obj) {
			while(total>0){

				System.out.println(Thread.currentThread().getName()+(total--));
			}
		}
	}

}
