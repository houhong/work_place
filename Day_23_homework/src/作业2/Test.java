package ��ҵ2;

public class Test {

	public Test() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {

		Pool pool = new Pool(100);

		Input in = new Input(pool);

		//��������߳�
		Output out = new Output(pool);
		Thread in_thread = new Thread(in);
		Thread out_thread = new Thread(out);

		in_thread.start();
		out_thread.start();

	}

}
