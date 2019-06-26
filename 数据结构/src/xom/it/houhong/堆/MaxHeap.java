package xom.it.houhong.堆;



/*
 * 最大堆
 */

public class MaxHeap <E extends Comparable<E>> {

    private Array<E> data;//用数组存储完全二叉树

    public MaxHeap() {
		data= new Array<>();//不知道最大容量 	
	}
	
	public MaxHeap(int capacity) {
		//存储的最大容量
		data = new Array<>(capacity);
	}
	
	//返回堆中元素个数
	public int getSize(){
		
		return data.getSize();
	}
	
	//返回堆是否为空
	public boolean isEmpty(){
		
		return data.isEmpty();
	}
	//返回完全二叉树中的数组表示中,一个索引的下表表示中,一个索引所表示的父亲节点的索引
	public static  int parent(int index){
		
		if (index == 0) {
			throw new IllegalArgumentException();
		}
		return (index - 1)/2 ; 
	}
	
	
	//返回完全二叉树中的数组表示中,一个索引的下表表示中,一个索引所表示的左孩子节点的索引
	public static int leftChild(int index){
		return index*2+1;
	}
	
	//返回完全二叉树中的数组表示中,一个索引的下表表示中,一个索引所表示的右孩子节点的索引
	public static int rightChild(int index){
		return index*2+2;
	}
	
	
	//向堆中添加元素
	public void add(E e){
		
		//尾插
		data.addLast(e);
		siftUp(data.getSize()-1);
	}

	//元素上浮
	private void siftUp(int k) {
	     
		//如果当前元素索引大于0(并未是根节点) 并且其父亲节点小于当前节点
		while (k>0 && data.get(parent(k)).compareTo(data.get(k))<0) {
			
			//交换当前元素和父亲节点元素
			data.swap(k, parent(k));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
