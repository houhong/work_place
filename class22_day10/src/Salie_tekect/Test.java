package Salie_tekect;

public class Test {
	
	 Teciket teciket = new Teciket();

	public Test() {
		// TODO 自动生成的构造函数存根
	}
	Thread t0 = new Thread(new Runnable() {
		
		@Override
		public void run() {
		
			 teciket.Sale();
			
		}
	});

}
