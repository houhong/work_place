package hashMap_bianni;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.xml.sax.HandlerBase;
/*
 * 从此映射中移除所有映射关系（可选操作）。           --clear();
 * 如果此映射包含指定键的映射关系，则返回 true。 --contrainsKey(Object key);
 *  返回此映射中包含的映射关系的 Set 视图             -- EntrySet()
 */

/*
 * hashMap的遍历：
 * 
 */

public class bianni_hashmap {

	public static void main(String[] args) {
		Data();
	}
	//准备数据
	public static void Data(){

		//准备数据
		HashMap<Integer, String> hashMap = new HashMap<>();

		hashMap.put(1, "gogo");
		hashMap.put(2, "wade");
		hashMap.put(3, "james");
		hashMap.put(4, "curry");

		// 1. 通过Map.keySet遍历key和value：
		for(int key :hashMap.keySet()){

			//1:HashMap的get和put方法
			System.out.println("key:"+key +"\t"+"value:"+hashMap.get(key));
			//2:通过map.EntrySet<Integer,String> 进行遍历
		}
		
		System.out.println("\t"+"============================="+"\t");
		
		//2:第二种方法：entrySet（）
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		//entry的迭代器
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		
		
		
	}
	//1. 通过keyset
	public static void method_1(){

	}
}
