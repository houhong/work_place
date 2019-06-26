package HashMap��ϰ��;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
/*
 * ��֪һ�� HashMap<Integer��User>���ϣ� User �� name��String���� age��int�����ԡ���дһ������ʵ��
�� HashMap �������ܣ��÷������� HashMap<Integer��User>Ϊ�βΣ���������Ϊ HashMap<Integer��User>��
Ҫ��� HashMap �е� User �� age ���������������ʱ key=value ��ֵ�Բ��ò�ɢ��

 */
import java.util.concurrent.BlockingDeque;



public class Homework {

	public Homework() {
		// TODO �Զ����ɵĹ��캯�����
	}


	public static void main(String[] args) {

		HashMap<Integer,User> users=new HashMap<>();
		
		
		users.put(1, new Homework().new User("����",30));
		users.put(3, new Homework().new User("����",28));
		users.put(2, new Homework().new User("����",40));
		
		LinkedHashMap<Integer, User> newMap = sortHashMap(users);
		
		Iterator<Entry<Integer, User>> it = newMap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, User> entry = it.next();
			
			System.out.println(entry.getValue().getAge()+","+entry.getValue().getName());
		}
	}

	//��������
	public static LinkedHashMap<Integer, User> sortHashMap(HashMap<Integer,User> oldMap){
	    	
	
		//1:��hashMapת���һ��set  -- >�ٽ�set�����ֵ�Ž�ȥlist����
		ArrayList<Entry<Integer, User>> arrayList = new ArrayList<>(oldMap.entrySet());
		
		//2:��list ��д���򷽷�
		Collections.sort(arrayList,new Comparator<Entry<Integer, User>>() {

			@Override
			public int compare(Entry<Integer, User> o1, Entry<Integer, User> o2) {
				// TODO �Զ����ɵķ������
				return  o1.getValue().getAge() - o2.getValue().getAge();
			}
			
			
		});
		/*Iterator<Entry<Integer, User>> iterator = oldMap.entrySet().iterator();
		while (iterator.hasNext()) {
			
			arrayList.add(iterator.next());
			
		}*/
		
		//3:��list --> Map
		LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<>();

		for (Entry<Integer, User> entry : arrayList) {
			
			linkedHashMap.put(entry.getKey(), entry.getValue());
		}
		return linkedHashMap;
		
	}

	/** User*/
	class User {



		public String name;
		public int     age;

		public User() {
			// TODO �Զ����ɵĹ��캯�����
		}


		public User(String name, int age) {
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

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}



	}




}











