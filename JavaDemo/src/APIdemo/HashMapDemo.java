package APIdemo;
/*
 * hashMap��ʵ��
 */

public class HashMapDemo<K,V> implements Map<K, V>{

	private static  int defaultLength =16;//Ĭ��hashTable ����
	private	static  double defaultLoader = 0.75;
	private Entry<K, V>[]  table = null;//��ʼ��

	//������
	public HashMapDemo(){

		this(defaultLength, defaultLoader);
		//�ղι�����
	}

	//hash��
	public HashMapDemo(int length,double loader){

		this.defaultLength=length;
		this.defaultLoader=loader;
	}


	//

	@Override
	public K put(K k, V v) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public V get(K k) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public int size() {
		// TODO �Զ����ɵķ������
		return 0;
	}

	//�ڵ�
	class Entry<K,V> implements Map.Entry<K, V>{


		private K k;
		private V v;
		private Entry<K,V> next;

		//������
		public Entry(){
			//�ղι�����
		}

		//����������
		public Entry(K k,V v,Entry<K,V> next){

			this.k= k;
			this.v= v;
			this.next=next;		
		}


		@Override

		public K getKey() {
			// TODO �Զ����ɵķ������
			return null;
		}

		@Override
		public V getValue() {
			// TODO �Զ����ɵķ������
			return null;
		}

	}

}
