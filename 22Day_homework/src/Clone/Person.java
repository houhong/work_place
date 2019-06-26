package Clone;

import java.security.PublicKey;
/*
 * Ǩ��¡
 * 
 */

public class Person implements Cloneable{

	public String name;
	public String age;
	public String sex;
	public Adder  adder;


	public Person() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public Person(String name, String age, String sex, Adder adder) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.adder = adder;
	}


	public static void main(String[] args) {

	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public Adder getAdder() {
		return adder;
	}


	public void setAdder(Adder adder) {
		this.adder = adder;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", adder=" + adder + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getSex()=" + getSex()
				+ ", getAdder()=" + getAdder() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO �Զ����ɵķ������
		Object clone = super.clone();
		Person person=(Person)clone;
		person.adder=(Adder) adder.clone();
		return person;

	}




}
