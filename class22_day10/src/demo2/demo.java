package demo2;



public class demo {

	public demo() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) throws InterruptedException {

		Resource re = new Resource();
		Input input = new Input(re);
		Output  output =new  Output(re);

		Thread t0 = new Thread(input);
		Thread t1 = new Thread(output);
		t0.start();
		t1.start();





	}
}
