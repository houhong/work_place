package Utils;

public class DoubleBall {

	public DoubleBall() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		

		for (int i = 0; i < 10; i++) {
			System.out.print("'"+"红0"+i+","+"'");

		}
		//System.out.println("红0"+i);
		System.out.println("\n");
		for (int i = 10; i < 33; i++) {
			System.out.print("'"+"红"+i+"'"+",");
		}

		System.out.println("\n");
		for (int j = 0; j < 8; j++) {
			System.out.print("蓝"+j+",");
		}
		for (int i = 0; i < 8; i++) {
			System.out.print("'"+"红0"+i+","+"'");

		}


	}

}
