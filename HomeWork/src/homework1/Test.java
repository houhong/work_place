package homework1;

public class Test {

	public Test() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {

		homework2 homework2 = new homework2();
		
		Thread thread = new Thread(homework2);
		thread.start();
		

	}

}
