package Io_练习题;
/*
 * 匿名内部类
 */

public class ThreadDemo5 {

	public ThreadDemo5() {
		// TODO 自动生成的构造函数存根
	}


	Thread t0 = new Thread("myThread"){


		@Override
		public void run() {
			// TODO 自动生成的方法存根
			super.run();
		}
	};

	//成员内部类
	class Person{

		public String name;
		public Integer age;

		public Person() {
			super();
			// TODO 自动生成的构造函数存根
		}


		public Person(String name, Integer age) {
			super();
			this.name = name;
			this.age = age;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Integer getAge() {
			return age;
		}


		public void setAge(Integer age) {
			this.age = age;
		}



		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}








	}
}
