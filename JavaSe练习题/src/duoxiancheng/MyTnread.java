package duoxiancheng;

import java.io.IOException;
import java.nio.CharBuffer;

public class MyTnread implements Runnable{

	public MyTnread() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {

			System.out.println("线程！！！！！");
		}


	}



}
