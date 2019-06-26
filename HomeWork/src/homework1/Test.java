package homework1;

public class Test {

	public Test() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		homework2 homework2 = new homework2();
		
		Thread thread = new Thread(homework2);
		thread.start();
		

	}

}
