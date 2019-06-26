package 作业2;

public class Test {

	public Test() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		Pool pool = new Pool(100);

		Input in = new Input(pool);

		//输出输入线程
		Output out = new Output(pool);
		Thread in_thread = new Thread(in);
		Thread out_thread = new Thread(out);

		in_thread.start();
		out_thread.start();

	}

}
