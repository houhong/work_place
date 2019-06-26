package APIdemo;
/*
 * hashMap的实现
 */

public class HashMapDemo<K,V> implements Map<K, V>{

	private static  int defaultLength =16;//默认hashTable 长度
	private	static  double defaultLoader = 0.75;
	private Entry<K, V>[]  table = null;//初始表

	//构造器
	public HashMapDemo(){

		this(defaultLength, defaultLoader);
		//空参构造器
	}

	//hash表
	public HashMapDemo(int length,double loader){

		this.defaultLength=length;
		this.defaultLoader=loader;
	}


	//

	@Override
	public K put(K k, V v) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public V get(K k) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public int size() {
		// TODO 自动生成的方法存根
		return 0;
	}

	//节点
	class Entry<K,V> implements Map.Entry<K, V>{


		private K k;
		private V v;
		private Entry<K,V> next;

		//构造器
		public Entry(){
			//空参构造器
		}

		//参数构造器
		public Entry(K k,V v,Entry<K,V> next){

			this.k= k;
			this.v= v;
			this.next=next;		
		}


		@Override

		public K getKey() {
			// TODO 自动生成的方法存根
			return null;
		}

		@Override
		public V getValue() {
			// TODO 自动生成的方法存根
			return null;
		}

	}

}
