package buke_homework;
/*
 * 子类
 */

public class Car extends Veicles{
	
	private int seats;
	String brand1= this.getBrand();
	String color1=this.getColor();
	
	public Car() {
		// TODO 自动生成的构造函数存根
	}
	//空参构造
	public  Car(int seats,String brand,String color){
		
		this.seats=seats;
		brand1=brand;
		color1=color;
		
	}
	public void showCar(){
		
		String brand=this.getBrand();
		System.out.println(brand);
		String color=this.getColor();
		System.out.println(color);
		int seats =this.getSeats();
		System.out.println(seats);
				
	}
	
	//get和set方法
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	
	
} 
