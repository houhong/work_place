package 作业1;

/*
 * 被猥琐算法坑死了！！！！以后再也不为萎缩了
 */

public class demo {

	public demo() {
		// TODO 自动生成的构造函数存根
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
