package it.houhong.poke;

public class Poker2 extends Poker{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name + "";
	}
	public Poker2(String name) {
		super();
		this.name = name;
	}
}
