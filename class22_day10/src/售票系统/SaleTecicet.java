package ��Ʊϵͳ;

import test_thinking.main_1;

/*
 * �ര����Ʊ
 */
public class SaleTecicet implements Runnable{


	public static int ticket =10;
	
	public SaleTecicet() {
		// TODO �Զ����ɵĹ��캯�����
	}
	@Override
	public void run() {
   
	  if(ticket>0){
		 System.out.println( Thread.currentThread().getName()+"��������"+ticket+"��");
		 ticket --;
	  }else{
		  System.out.println("Ʊ�Ѿ�����������");
	  }

	}
     
    
}
