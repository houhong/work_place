package HashMap练习题;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.BlockingDeque;

/*
 * 工具类，对list map ,set进行遍历
 */

public class Traverse{

	public Traverse() {
		// TODO 自动生成的构造函数存根
	}

	//成员内部类
	class  ListTraverse<E>{	

		public ListTraverse() {
			super();
			// TODO 自动生成的构造函数存根
		}

		public   void listTraverse(List<E> list){
				Iterator<E> iterator = list.iterator();
		}
	}
	class setTraverse<E>{

		public setTraverse() {
			super();
			// TODO 自动生成的构造函数存根
		}

		public void setTraverse(Set<E> set){
			Iterator<E> iterator = set.iterator();
			
			while (iterator.hasNext()) {
				E e = (E) iterator.next();
				
			}
		}
	}

	class mapTraverse<K,V>{

		public mapTraverse() {
			super();
			// TODO 自动生成的构造函数存根
		}

		public void mapTraverse(Map<K, V> map){
			Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
			
			while (iterator.hasNext()) {

				Map.Entry<K, V> entry = (Map.Entry<K, V>) iterator.next();
				
			}
		}
	}



}
