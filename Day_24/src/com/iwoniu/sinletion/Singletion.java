package com.iwoniu.sinletion;

/**
 * @author layker   :��������ģʽ
 * 
 *
 */
public class Singletion {


	public static Singletion s = null;

	public Singletion() {
		// TODO �Զ����ɵĹ��캯�����
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
	//����get ��set����
	public static Singletion getS() {
		return s;
	}

	public static void setS(Singletion s) {
		Singletion.s = s;
	}

}
