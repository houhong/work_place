
package HashMap练习题;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapTest {

	//

	public static void main(String[] args) {

		HashMap<Integer,User> users=new HashMap<>();



		users.put(1, new User("张三",25));

		users.put(3, new User("李四",22));

		users.put(2, new User("王五",28));



		System.out.println(users);



		HashMap<Integer,User> sortHashMap=sortHashMap(users);

		System.err.println(sortHashMap);



	}

	// 定义一个进行排序的方法

	// 要求实现 对 HashMap 集合中 value值 即User 对象的 age 属性，进行 排序



	public static HashMap<Integer,User> sortHashMap(HashMap<Integer,User> map){

		// 拿到 map集合键值对

		Set<Entry<Integer,User>> entrySet=map.entrySet();

		// 将 set 集合 转化为 List 集合

		List<Entry<Integer,User>> list= new ArrayList<Entry<Integer,User>> (entrySet);

		// 使用 Collections 集合 工具类 对List 进行 排序,排序规则使用 匿名内部类来实现

		Collections.sort(list,new Comparator<Entry<Integer,User>>(){



			// 安照要求 根据 User 的age 的倒序进行排序



			public int compare(Entry<Integer,User> o1,Entry<Integer,User> o2){
				
				// 返回值为int类型，大于0表示正序，小于0表示逆序
				//根据第一个参数小于、等于或大于第二个参数分别返回负整数、零或正整数
				return o2.getValue().getAge()-o1.getValue().getAge();

			}



		});



		// 创建 新的 有序的 hahMap 子类的集合

		LinkedHashMap<Integer,User> linkedHashMap=new LinkedHashMap<Integer,User>();



		// 将 List 中的数据 存储 在 LinkedHashMap中

		for(Entry<Integer,User> entry:list){

			linkedHashMap.put(entry.getKey(),entry.getValue());

		}



		return linkedHashMap;



	}





}

