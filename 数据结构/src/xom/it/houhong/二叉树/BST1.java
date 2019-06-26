package xom.it.houhong.������;

import java.util.Stack;

public class BST1<E extends Comparable<E>> {

	public  class Node {
		public E e;
		public Node left, right;

		public Node(E e) {
			this.e = e;
			left = null;
			right = null;
		}
	}

	public  Node root;
	public  int size;

	public BST1(){
		root = null;
		size = 0;
	}

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		return size == 0;
	}




	// �����������������µ�Ԫ��e
	public void add(E e){
		root = add(root, e);
	}

	// ����nodeΪ���Ķ����������в���Ԫ��e���ݹ��㷨
	// ���ز����½ڵ������������ĸ�
	private Node add(Node node, E e){


		if(node == null){
			size ++;
			return new Node(e);//������eΪֵ�ýڵ�
		}

		if(e.compareTo(node.e) < 0)
			node.left = add(node.left, e);
		else if(e.compareTo(node.e) > 0)
			node.right = add(node.right, e);

		return node;
	}

	// ���������������Ƿ����Ԫ��e
	public boolean contains(E e){
		return contains(root, e);
	}

	// ����nodeΪ���Ķ������������Ƿ����Ԫ��e, �ݹ��㷨
	private boolean contains(Node node, E e){

		if(node == null)
			return false;

		if(e.compareTo(node.e) == 0)
			return true;
		else if(e.compareTo(node.e) < 0)
			return contains(node.left, e);
		else // e.compareTo(node.e) > 0
			return contains(node.right, e);
	}

	//ǰ�����
	public void preOrder(){

		preOrder(root);
	}


	public void preOrder(Node node){

		if (node == null) {
			return;
		}

		System.out.println(node.e);
		preOrder(node.left);
		preOrder(node.right);

	}

	//�������
	public void inOrder(){

		inOrder(root);
	}


	public void inOrder(Node node){

		if (node == null) {
			return;
		}

		inOrder(node.left);

		System.out.println(node.e);

		inOrder(node.right);
	}

	//�������
	public void postOrder(){
		postOrder(root);
	}

	//�������
	public void postOrder(Node node){

		//��ǰ��������
		if(node == null){
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.e);

	}


	//-- �ݹ�ܼ򵥰��� ���ò���ȥ��ʲô�����ˡ�ֻҪ�뵽�ú�����������ɶ�ľ�����
	// ������nodeΪ���Ķ�������������Сֵ���ڵĽڵ�
	private Node mimum(Node node){
		if(node.left ==null){
			return node;
		}
		return mimum(node.left);
	}

	//������node Ϊ������СԪ��
	public E  minmun(){

		if(root ==null){
			return null;
		}
		return mimum(root).e;

	}
	// Ѱ�Ҷ��������������Ԫ�����ڵĽڵ�
	private Node maximum(Node node){

		if(node.right== null){
			return node;
		}
		return maximum(node.right);
	}

	//���ض����������Ԫ��
	public E maximum(){

		if (root== null) {
			return null;
		}
		return maximum(root).e;
	}

	// �Ӷ�����������ɾ����Сֵ���ڽڵ�, ������Сֵ
	public E removeMin(){
		E ret = minmun();
		root = removeMin(root);
		return ret;
	}

	// ɾ������nodeΪ���Ķ����������е���С�ڵ�
	// ����ɾ���ڵ���µĶ����������ĸ�

	private Node removeMin(Node node){//���ܣ�ɾ����ǰ�ڵ����Сֵ

		if(node.left ==null){
			Node nodeRight= node.right;
			node.right=null;
			return nodeRight;
		}

		node.left /*��ɾ����ӵ���Сֵ���¸������ǰ�ڵ�*/ = /*ɾ�����ӵ���Сֵ*/ removeMin(node.left);

		return node;
	}

	// ɾ������nodeΪ���Ķ����������е����ڵ�node
	// ����ɾ���ڵ���µĶ����������ĸ�

	private Node removeMax(Node node){//�������ô���ɾ����ǰ�ڵ�����ֵ

		if(node.right==null){//�������С��ģ
			Node nodeLeft = node.left;
			node.left = null;
			return nodeLeft;
		}
		node.right = removeMax(node.right);

		return node;

	}
	// �Ӷ�����������ɾ�����ֵ���ڽڵ�, �������ֵ
	public E removeMax(){
		E ret =maximum();
		root = removeMax(root);
		return ret;
	}

	// ɾ������nodeΪ���Ķ�����������ֵΪe�Ľڵ�, �ݹ��㷨
	// ����ɾ���ڵ���µĶ����������ĸ�
	private Node remove(Node node,E e){//ɾ����ǰ�ڵ��Ԫ��e
		
		if(node == null){
			return null;
		}
		//С����������ֵ
		if(e.compareTo(node.e)<0){
			node.left =remove(node.left, e);
		}
		//С����������ֵ
		if (e.compareTo(node.e)>0 ) {
			node.right= remove(node.right, e);
		}
		else {//node.e ==e
			
			if(node.left==null){
				Node nodeRight=node.right;
				node.right=null;
				return nodeRight;
			}
			if (node.right==null) {
				
				Node nodeLeft=node.left;
				node.left=null;
				return nodeLeft;
				
			}else{//���Ҷ���Ϊ��
				Node successor =mimum(node.right);
				successor.right=removeMin(node.right);
				successor.left= node.left;
				
				return successor;
			}
		}	
		
		return node;
		
		
		
	}



	/*//�ǵݹ�ǰ�����
	public void preOrderNR(){
		preOrder(root);
	}
	//�ǵݹ��㷨ǰ�� --- ģ��ϵͳջ -- ����д��̫����
	public void preOrderNR(Node node){

		Stack<Node >  stack = new Stack<>();

		stack.push(node);

		while(!stack.isEmpty()){
			Node cur = stack.pop();
			System.out.println(cur.e);

			if (cur.right !=null) {
				stack.push(cur.right);
			}

			if (cur.left !=null) {
				stack.push(cur.left);
			}
		}
	}*/
	//һ·�����д��
	public void preOrderNR(){
		preOrder(root);
	}

	public void preOrderNR(Node node ){

		//��ջ
		Stack<Node> stack = new Stack<>();
		//һ·����
		//��¼�¸��ڵ�  --�����ҵ��ҽڵ�
		while(node!=null  || !stack.isEmpty()){


			while (node!=null) {

				System.out.println(node.e);
				stack.push(node);
				node= node.left;
			}


			//�ҵ��ҽڵ�
			if (!stack.isEmpty()) {

				node= stack.pop();
				node= node.right;

			}



		}

	}

	//�ǵݹ�����
	public void inOrderNR(){
		inOrder(root);
	}

	//��Զ�ȿ�����������ֱ��������Ϊ�ղŷ��ʸ��ڵ�
	public void inOrderNR(Node node){

		Stack<Node> stack = new Stack<>();

		while(node!=null || !stack.isEmpty()){
			//1:������ڵ�
			while(node!=null) {
				stack.push(node);
				node=node.left;
			}

			//�ҵ��ұ�
			if(!stack.isEmpty()){
				node=stack.pop();
				System.out.println(node.e);
				node =node.right;
			}

		}
	}

	public void postOrderNR(){
		preOrderNR(root);
	}

	public void postOrderNR(Node node){

		Stack<Node> stack = new Stack<>();
		Node lastVisit = node;

		//�������
		while(node!=null){
			stack.push(node);
			node= node.left;
		}

		if(!stack.isEmpty()){

			node=stack.peek();

			//����ұ�Ϊ�� �����������Ѿ�������
			if(node.right==null  || node.right == lastVisit  ){
				System.out.println(node.e );
				stack.pop();
				lastVisit=node;
				node=null;

			}else {
				//��������������
				node= node.right;
			}

		}



	}
	
	//���ɶ����� --�ݹ�
	public void generateDepthString(Node node,int depth,StringBuilder res){


		if (node == null) {

			res.append(generateDepthString(depth)+"null\n");
			return;
		}
		//������ڵ�
		res.append(generateDepthString(depth)+node.e+"\n");
		//��ڵ�
		generateDepthString(node.left, depth+1, res);
		//�ҽڵ�
		generateDepthString(node.right,depth+1,res);


	}




	//������
	public String  generateDepthString(int depth){

		StringBuilder res = new StringBuilder();

		for (int i = 0; i < depth; i++) {
			res.append("--");
		}
		//���ص�ǰ��ֵ
		return res.toString();
	}


	//toString����
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		generateDepthString(root, 0, res);

		return res.toString();
	}
	  
	
	//�ҵ���ǰarr�����ֵ������mid
    public static int findMax(int[] arr){
		
		int max=0;
		int index=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>max){
				
				max=arr[i];
				index=i;
			}
		}
		return index;
	}
	
    public Node constructMaximumBinaryTree(int[] nums) {
	        
	        int mid = findMax(nums);
	        //1�����������start end ��mid == ��������ֵ �����±�
	        //2 �� �ýڵ����ڵ�== start - mid-1; 
	        //3:�ýڵ���ҽڵ�==mid+1, end
	        
	    }
	    
	
	
	
	
	
}
