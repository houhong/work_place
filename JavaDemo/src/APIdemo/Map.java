package APIdemo;
/*
 * ����HashMap��Ҫʵ�ֵķ���
 */
public interface Map<K,V>{
	
	//hash��ķ���
	public K put(K k,V v);
	
	public V get(K k);
	
	public int size();
	
	//��ʾһ���ڵ�--������������ݽṹ
	public interface Entry<K,V>{
		
		public K getKey();
		
		public V getValue();
		
	}
	
	
	
	
	
	
	
	
}
