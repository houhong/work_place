package HashMap��ϰ��;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.BlockingDeque;

/*
 * �����࣬��list map ,set���б���
 */

public class Traverse{

	public Traverse() {
		// TODO �Զ����ɵĹ��캯�����
	}

	//��Ա�ڲ���
	class  ListTraverse<E>{	

		public ListTraverse() {
			super();
			// TODO �Զ����ɵĹ��캯�����
		}

		public   void listTraverse(List<E> list){
				Iterator<E> iterator = list.iterator();
		}
	}
	class setTraverse<E>{

		public setTraverse() {
			super();
			// TODO �Զ����ɵĹ��캯�����
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
			// TODO �Զ����ɵĹ��캯�����
		}

		public void mapTraverse(Map<K, V> map){
			Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
			
			while (iterator.hasNext()) {

				Map.Entry<K, V> entry = (Map.Entry<K, V>) iterator.next();
				
			}
		}
	}



}
