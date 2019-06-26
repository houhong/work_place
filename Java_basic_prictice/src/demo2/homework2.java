package demo2;




public class homework2 {
	public static int num = 1;
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				synchronized(homework2.class) {
				int i = 1;
					while(i < 53) {
					if(num == 3) {
						try {
							
							homework2.class.wait();
							
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(i);
					i++;
					num++;
					homework2.class.notify();
					
						
						
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized(homework2.class) {
					int i = 97;
					while(i < 123) {
						if(num == 1) {
						try {
							homework2.class.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						}
						System.out.println((char)i);
						i++;
						num-=2;
						homework2.class.notify();
						
					}
						
					}
				}
		
		};
		t1.start();
		t2.start();
	}
}
