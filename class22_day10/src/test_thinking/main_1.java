package test_thinking;
/*
 * 开线程
 */

public class main_1 {

	public main_1() {
		// TODO 自动生成的构造函数存根
	}
	
     public static void main(String[] args) {
		
    	 //一把钥匙  --开什么的钥匙？
    	 Test key1  =  new Test();
    	 Test key2 = new Test();
    	 
    	 
    	 //线程一：
    	Thread t0 = new Thread("张三"){

    		 
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				//test1()是锁的对象
				key1.test5();
			}
    		 
    	 };
    	 
    	 //线程二：
     	Thread t1 = new Thread("李四"){

     		 
 			@Override
 			public void run() {
 				// TODO 自动生成的方法存根
 				key2.test5();
 			}
     		 
     	 };
     	 
     	 //开启线程
    	t0.start();
    	t1.start();
    	 
	}
     
	
	

}
