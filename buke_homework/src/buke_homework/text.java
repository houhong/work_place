package buke_homework;
/*
 * չʾС����Ϣ
 */

public class text {

	public static void main(String[] args) {

		Car car = new Car();
		car.setBrand("��˹��˹");
		car.setColor("��ɫ");
		car.showCar();
		car.run();

		Truck truck = new Truck();
		truck.setBrand("����");
		truck.setColor("��ɫ");
		truck.setLoad(10);
		truck.showCar();
	}
}
