package thread;
/*
 * 用于表示在run()里面运行
 */

public class test1 {

	public test1() {
		// TODO 自动生成的构造函数存根
	}
	 
	public void function(){
		for(int i=0;i<100;i++){
	
			Thread currentThread = Thread.currentThread();
			System.out.println(currentThread);
			System.out.println("你好-------");
		}
		
	}

}
