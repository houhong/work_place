package xom.it.houhong.��;



/*
 * ����
 */

public class MaxHeap <E extends Comparable<E>> {

    private Array<E> data;//������洢��ȫ������

    public MaxHeap() {
		data= new Array<>();//��֪��������� 	
	}
	
	public MaxHeap(int capacity) {
		//�洢���������
		data = new Array<>(capacity);
	}
	
	//���ض���Ԫ�ظ���
	public int getSize(){
		
		return data.getSize();
	}
	
	//���ض��Ƿ�Ϊ��
	public boolean isEmpty(){
		
		return data.isEmpty();
	}
	//������ȫ�������е������ʾ��,һ���������±��ʾ��,һ����������ʾ�ĸ��׽ڵ������
	public static  int parent(int index){
		
		if (index == 0) {
			throw new IllegalArgumentException();
		}
		return (index - 1)/2 ; 
	}
	
	
	//������ȫ�������е������ʾ��,һ���������±��ʾ��,һ����������ʾ�����ӽڵ������
	public static int leftChild(int index){
		return index*2+1;
	}
	
	//������ȫ�������е������ʾ��,һ���������±��ʾ��,һ����������ʾ���Һ��ӽڵ������
	public static int rightChild(int index){
		return index*2+2;
	}
	
	
	//��������Ԫ��
	public void add(E e){
		
		//β��
		data.addLast(e);
		siftUp(data.getSize()-1);
	}

	//Ԫ���ϸ�
	private void siftUp(int k) {
	     
		//�����ǰԪ����������0(��δ�Ǹ��ڵ�) �����丸�׽ڵ�С�ڵ�ǰ�ڵ�
		while (k>0 && data.get(parent(k)).compareTo(data.get(k))<0) {
			
			//������ǰԪ�غ͸��׽ڵ�Ԫ��
			data.swap(k, parent(k));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
