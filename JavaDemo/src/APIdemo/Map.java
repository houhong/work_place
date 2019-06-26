package APIdemo;
/*
 * 定义HashMap需要实现的方法
 */
public interface Map<K,V>{
	
	//hash表的方法
	public K put(K k,V v);
	
	public V get(K k);
	
	public int size();
	
	//表示一个节点--用于链表的数据结构
	public interface Entry<K,V>{
		
		public K getKey();
		
		public V getValue();
		
	}
	
	
	
	
	
	
	
	
}
