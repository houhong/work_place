
package homework1;

public class Try1 {
	public static int num = 1;
	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized(Try1.class) {
				int i = 1;
					while(i < 53) {
					 if(num == 3) {
						try {
							Try1.class.wait();
							System.out.println("==");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(i);
					i++;
					num++;
					System.out.println("线程一");
					Try1.class.notify();
					
						
						
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized(Try1.class) {
					int i = 97;
					while(i < 123) {
						if(num == 1) {
						try {
							Try1.class.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						}
						System.out.println((char)i);
						
						i++;
						num-=2;
						System.out.println("线程二");
						Try1.class.notify();
						
					}
						
					}
				}
		
		};
		t1.start();
		t2.start();
	}
}
