package buke_homework;
/*
 * 卡车
 */
public class Truck extends Veicles{


	
	//定义 一个私有属性：
	private static float load;
	//无参构造器
	public Truck(){

	}
/*	public Truck(float load,String color,String brand){
		this.load =load;
		brand1=brand;
		color1 =color;
	}*/
	//展示汽车
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

	//生成set和get方法
		
}
