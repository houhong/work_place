package Salie_tekect;


/*
 * Ʊ��
 */

public class Teciket {

	public Teciket() {
		// TODO �Զ����ɵĹ��캯�����
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
