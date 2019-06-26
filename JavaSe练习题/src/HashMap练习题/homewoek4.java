package HashMap练习题;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/*
 * 已知一个 HashMap<Integer，User>集合， User 有 name（String）和 age（int）属性。请写一个方法实现
对 HashMap 的排序功能，该方法接收 HashMap<Integer，User>为形参，返回类型为 HashMap<Integer，User>，
要求对 HashMap 中的 User 的 age 倒序进行排序。排序时 key=value 键值对不得拆散。
--------------------- 

 */
import java.util.List;
import java.util.Map;
import java.util.Set;

public class homewoek4 {

	public homewoek4() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {

		HashMap<Integer,User> hashMap = new HashMap<>();
		hashMap =  data();

	}

	public static HashMap<Integer,User> sort(HashMap<Integer,User> oldMap,HashMap<Integer,User> newMap){

		List<User> entryArr = new ArrayList<>();

		Iterator<Integer> keySet = oldMap.keySet().iterator();

		while (keySet.hasNext()) {

			Integer num = (Integer) keySet.next();
			entryArr.add(oldMap.get(num));
		}




		return newMap;

	}

	public static HashMap<Integer, User>  data(){

		HashMap<Integer, User> hashMap = new HashMap<>();

		hashMap.put(1,new User("张三",60));
		hashMap.put(2,new User("李四",30));
		hashMap.put(3,new User("王五",50));
		hashMap.put(4,new User("赵六",20));

		return hashMap;




	}
}
