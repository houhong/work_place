package 作业1_reNew;

public class Demo6 {

	public Demo6() {
		// TODO 自动生成的构造函数存根
	}
	
	public static void main(String[] args) {
		
	 Printer p = new Printer();
	 
	 Thread  t1 = new NumberPriter(p);
	 Thread  t2 = new LetterPrinter(p);
	 
		
		
		
	}



}

class Printer{

	private int index = 1;

	public synchronized void print(int i ){

		while(index %3 == 0){

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}		
		}
		System.out.print(" " +i);
		index ++;
		notifyAll();

	}
}

class NumberPriter extends Thread{
	
	private Printer p;

	public NumberPriter(Printer p) {
		super();
		this.p = p;
	}

	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for (int i = 0; i <52; i++) {
			System.err.println(i);
			
		}
	}	
}

class LetterPrinter extends Thread{
	
	private Printer p;

	public LetterPrinter(Printer p) {
		super();
		this.p = p;
	}

	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(char ch ='a';ch<'z';ch++){
			p.print(ch);
		}
	}
	
	
	
	
}
