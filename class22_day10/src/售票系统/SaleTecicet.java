package 售票系统;

import test_thinking.main_1;

/*
 * 多窗口卖票
 */
public class SaleTecicet implements Runnable{


	public static int ticket =10;
	
	public SaleTecicet() {
		// TODO 自动生成的构造函数存根
	}
	@Override
	public void run() {
   
	  if(ticket>0){
		 System.out.println( Thread.currentThread().getName()+"正在卖第"+ticket+"张");
		 ticket --;
	  }else{
		  System.out.println("票已经售罄！！！");
	  }

	}
     
    
}
