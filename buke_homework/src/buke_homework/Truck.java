package buke_homework;
/*
 * ����
 */
public class Truck extends Veicles{


	
	//���� һ��˽�����ԣ�
	private static float load;
	//�޲ι�����
	public Truck(){

	}
/*	public Truck(float load,String color,String brand){
		this.load =load;
		brand1=brand;
		color1 =color;
	}*/
	//չʾ����
	public void showCar(){
		String brand =this.getBrand();
		System.out.println(brand);
		String color =this.getColor();
		System.out.println(color);
		float load =this.getLoad(); 
		System.out.println(load);
		
	}
	public static float getLoad() {
		return load;
	}
	public static void setLoad(float load) {
		Truck.load = load;
	}

	//����set��get����
		
}
