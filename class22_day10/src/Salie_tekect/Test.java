package Salie_tekect;

public class Test {
	
	 Teciket teciket = new Teciket();

	public Test() {
		// TODO �Զ����ɵĹ��캯�����
	}
	Thread t0 = new Thread(new Runnable() {
		
		@Override
		public void run() {
		
			 teciket.Sale();
			
		}
	});

}
