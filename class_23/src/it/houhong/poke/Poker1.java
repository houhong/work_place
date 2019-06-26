package it.houhong.poke;

public class Poker1 extends Poker{
	private String color;
	private String num;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return color + num + "";
	}
	public Poker1(String color, String num) {
		super();
		this.color = color;
		this.num = num;
	}
}
