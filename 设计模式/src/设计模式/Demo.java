package 设计模式;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
	}
	public static void function(){
		  Singletion s = new Singletion();
	}
	
}

class Singletion{
	private static  Singletion s = null;

	public Singletion() {
		
	}

	public Singletion getS() {
		return s;
	}

	
	
}