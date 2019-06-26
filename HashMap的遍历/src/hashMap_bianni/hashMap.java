package hashMap_bianni;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;
/*
 * hashMap的遍历
 */

public class hashMap {


	@Test
	public void Test(){

		//创建HashMap
		HashMap<Integer, String> hashMap = new HashMap<>();
		//装数据
		hashMap.put(1, "一");
		hashMap.put(2, "二");
		hashMap.put(3, "三");
		hashMap.put(4, "四");
		hashMap.put(5, "五");
		hashMap.put(6, "六");
		hashMap.put(7, "七");
		hashMap.put(8, "八");
		

		//遍历hashMap 1:采用hashMap.EntrySet<Integer, String>();
		System.out.println("第一种方法：遍历hashMap 1:采用hashMap.EntrySet<Integer, String>()");

		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();

		// set的迭代器
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		//迭代器的三方法
		while(iterator.hasNext()){
			
			//将返回值
			Entry<Integer, String> next = iterator.next();
			
			//键值对
			String value =next.getValue();
			Integer key = next.getKey();
			System.out.println("value=:" +value + "key=:" +key);
		}

		System.out.println("=========================");
		System.out.println("第二种方法：遍历hashMap 2:采用hashMap.keySet()");
		
		Set<Integer> keySet = hashMap.keySet();
		
		Iterator<Integer> iterator2 = keySet.iterator();
		
		while(iterator2.hasNext()){
			
			Integer next = iterator2.next();
			int key =next;
			String value2= hashMap.get(key);
			
			System.out.println("value=:" +value2 + "\t"+"key=:" +key);
		}
		
		//第三种. 通过Map.entrySet遍历key和value
		System.out.println("s第三种. 通过Map.entrySet遍历key和value");
		System.out.println("===================================");
		
		//通过entrySet遍历
		
		
		
		
		
		
	}


	public hashMap() {
		// TODO 自动生成的构造函数存根
	}

}
