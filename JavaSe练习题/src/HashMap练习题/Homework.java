package HashMap练习题;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
/*
 * 已知一个 HashMap<Integer，User>集合， User 有 name（String）和 age（int）属性。请写一个方法实现
对 HashMap 的排序功能，该方法接收 HashMap<Integer，User>为形参，返回类型为 HashMap<Integer，User>，
要求对 HashMap 中的 User 的 age 倒序进行排序。排序时 key=value 键值对不得拆散。

 */
import java.util.concurrent.BlockingDeque;



public class Homework {

	public Homework() {
		// TODO 自动生成的构造函数存根
	}


	public static void main(String[] args) {

		HashMap<Integer,User> users=new HashMap<>();
		
		
		users.put(1, new Homework().new User("张三",30));
		users.put(3, new Homework().new User("李四",28));
		users.put(2, new Homework().new User("王五",40));
		
		LinkedHashMap<Integer, User> newMap = sortHashMap(users);
		
		Iterator<Entry<Integer, User>> it = newMap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, User> entry = it.next();
			
			System.out.println(entry.getValue().getAge()+","+entry.getValue().getName());
		}
	}

	//重新排序
	public static LinkedHashMap<Integer, User> sortHashMap(HashMap<Integer,User> oldMap){
	    	
	
		//1:将hashMap转变成一个set  -- >再将set里面的值放进去list里面
		ArrayList<Entry<Integer, User>> arrayList = new ArrayList<>(oldMap.entrySet());
		
		//2:将list 重写排序方法
		Collections.sort(arrayList,new Comparator<Entry<Integer, User>>() {

			@Override
			public int compare(Entry<Integer, User> o1, Entry<Integer, User> o2) {
				// TODO 自动生成的方法存根
				return  o1.getValue().getAge() - o2.getValue().getAge();
			}
			
			
		});
		/*Iterator<Entry<Integer, User>> iterator = oldMap.entrySet().iterator();
		while (iterator.hasNext()) {
			
			arrayList.add(iterator.next());
			
		}*/
		
		//3:将list --> Map
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
			// TODO 自动生成的构造函数存根
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











