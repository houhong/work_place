package buke_homework;
/*
 * ����һ������
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
		System.out.println("���Ѿ������ˣ�����");
	}
	
	//˽�з��� set ��get
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
