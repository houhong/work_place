package Io_��ϰ��;
/*
 * �����ڲ���
 */

public class ThreadDemo5 {

	public ThreadDemo5() {
		// TODO �Զ����ɵĹ��캯�����
	}


	Thread t0 = new Thread("myThread"){


		@Override
		public void run() {
			// TODO �Զ����ɵķ������
			super.run();
		}
	};

	//��Ա�ڲ���
	class Person{

		public String name;
		public Integer age;

		public Person() {
			super();
			// TODO �Զ����ɵĹ��캯�����
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
