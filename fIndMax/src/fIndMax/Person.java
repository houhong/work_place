package fIndMax;
/*
 * ����һ����
 */

public class Person {
	
	public String name;
	public int money;
	public int count;

	public Person() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public Person(String name, int money, int count) {
		super();
		this.name = name;
		this.money = money;
		this.count = count;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", money=" + money + ", count=" + count
				+ ", getName()=" + getName() + ", getMoney()=" + getMoney()
				+ ", getCount()=" + getCount() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

}