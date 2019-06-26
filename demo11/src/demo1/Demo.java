package demo1;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		System.out.println("nihao");
		
		Thread t0 =new Thread(new Runnable() {
			public void run() {
				
			}
		});
		t0.start();
		
		
		new Thread(new Runnable() {
			public void run() {
				
			}
		});
		
		
		
	}

}
