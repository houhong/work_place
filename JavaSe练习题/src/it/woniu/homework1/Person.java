package it.woniu.homework1;

import String练习题.string;

public class Person {
	
    public string  name;
    public int     count;
    public int 	   money;
	public Person() {
		// TODO 自动生成的构造函数存根
	}
	
	public Person(string name, int count, int money) {
		super();
		this.name = name;
		this.count = count;
		this.money = money;
	}

	 
	public string getName() {
		return name;
	}

	public void setName(string name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Person [name=" + name  +"消费次数最多"+", 次数=" + count + ", 最高金额=" + money	
				+ "]";
	}
	
	
	
}
