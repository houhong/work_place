package buke_homework;
/*
 * 展示小车信息
 */

public class text {

	public static void main(String[] args) {

		Car car = new Car();
		car.setBrand("劳斯莱斯");
		car.setColor("红色");
		car.showCar();
		car.run();

		Truck truck = new Truck();
		truck.setBrand("东风");
		truck.setColor("绿色");
		truck.setLoad(10);
		truck.showCar();
	}
}
