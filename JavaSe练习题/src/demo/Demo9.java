package demo;

public class Demo9 {

	public Demo9() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		function();
	}
	public static void function(){
		
		for (int x= 0; x<9; x++) {
			for (int y = 0; y < 9; y++) {
				for (int z = 0; z < 9; z++) {
					
					  if((x*100+y*10+z+ y*100+z*10+z)==532){
						  System.out.print(x+" ");
						  System.out.print(y+" ");
						  System.out.print(z+" ");
					  }
				}
			}
			
		}
	}

}
