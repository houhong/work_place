package demo;

public class Demo5 {

	public Demo5() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {

		int count=1,sum=0;
		
		while(true){
			
			if(count%3==0){
				
				sum+=count;
			}
			
			if(count==200){
				break;
			}
			count++;
			
		}
		System.out.println(sum);
	}

}
