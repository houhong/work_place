package buke_homework;
/*
 * 定义一个基类
 */

public class Veicles {
	private String  brand;
	private String color;
	
	public Veicles(){
		
	}
	public Veicles(String  brand,String color){
		this.brand=brand;
		this.color=color;
	}
	public static void run(){
		System.out.println("我已经开动了！！！");
	}
	
	//私有方法 set 和get
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
