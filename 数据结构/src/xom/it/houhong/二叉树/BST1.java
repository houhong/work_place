package xom.it.houhong.二叉树;

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




	// 向二分搜索树中添加新的元素e
	public void add(E e){
		root = add(root, e);
	}

	// 向以node为根的二分搜索树中插入元素e，递归算法
	// 返回插入新节点后二分搜索树的根
	private Node add(Node node, E e){


		if(node == null){
			size ++;
			return new Node(e);//创建以e为值得节点
		}

		if(e.compareTo(node.e) < 0)
			node.left = add(node.left, e);
		else if(e.compareTo(node.e) > 0)
			node.right = add(node.right, e);

		return node;
	}

	// 看二分搜索树中是否包含元素e
	public boolean contains(E e){
		return contains(root, e);
	}

	// 看以node为根的二分搜索树中是否包含元素e, 递归算法
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

	//前序遍历
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

	//中序遍历
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

	//后序遍历
	public void postOrder(){
		postOrder(root);
	}

	//后序遍历
	public void postOrder(Node node){

		//当前方法结束
		if(node == null){
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.e);

	}


	//-- 递归很简单啊： 就用不用去想什么就行了。只要想到该函数是用来干啥的就行了
	// 返回以node为根的二分搜索树的最小值所在的节点
	private Node mimum(Node node){
		if(node.left ==null){
			return node;
		}
		return mimum(node.left);
	}

	//返回以node 为根的最小元素
	public E  minmun(){

		if(root ==null){
			return null;
		}
		return mimum(root).e;

	}
	// 寻找二分搜索树的最大元素所在的节点
	private Node maximum(Node node){

		if(node.right== null){
			return node;
		}
		return maximum(node.right);
	}

	//返回二叉树的最大元素
	public E maximum(){

		if (root== null) {
			return null;
		}
		return maximum(root).e;
	}

	// 从二分搜索树中删除最小值所在节点, 返回最小值
	public E removeMin(){
		E ret = minmun();
		root = removeMin(root);
		return ret;
	}

	// 删除掉以node为根的二分搜索树中的最小节点
	// 返回删除节点后新的二分搜索树的根

	private Node removeMin(Node node){//功能：删除当前节点的最小值

		if(node.left ==null){
			Node nodeRight= node.right;
			node.right=null;
			return nodeRight;
		}

		node.left /*将删除最孩子的最小值重新赋予给当前节点*/ = /*删除左孩子的最小值*/ removeMin(node.left);

		return node;
	}

	// 删除掉以node为根的二分搜索树中的最大节点node
	// 返回删除节点后新的二分搜索树的根

	private Node removeMax(Node node){//方法的用处：删除当前节点的最大值

		if(node.right==null){//问题的最小规模
			Node nodeLeft = node.left;
			node.left = null;
			return nodeLeft;
		}
		node.right = removeMax(node.right);

		return node;

	}
	// 从二分搜索树中删除最大值所在节点, 返回最大值
	public E removeMax(){
		E ret =maximum();
		root = removeMax(root);
		return ret;
	}

	// 删除掉以node为根的二分搜索树中值为e的节点, 递归算法
	// 返回删除节点后新的二分搜索树的根
	private Node remove(Node node,E e){//删除当前节点的元素e
		
		if(node == null){
			return null;
		}
		//小于左子树的值
		if(e.compareTo(node.e)<0){
			node.left =remove(node.left, e);
		}
		//小于右子树的值
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
				
			}else{//左右都不为空
				Node successor =mimum(node.right);
				successor.right=removeMin(node.right);
				successor.left= node.left;
				
				return successor;
			}
		}	
		
		return node;
		
		
		
	}



	/*//非递归前序遍历
	public void preOrderNR(){
		preOrder(root);
	}
	//非递归算法前序 --- 模拟系统栈 -- 这种写法太棒了
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
	//一路向左的写法
	public void preOrderNR(){
		preOrder(root);
	}

	public void preOrderNR(Node node ){

		//用栈
		Stack<Node> stack = new Stack<>();
		//一路向左
		//记录下根节点  --用于找到右节点
		while(node!=null  || !stack.isEmpty()){


			while (node!=null) {

				System.out.println(node.e);
				stack.push(node);
				node= node.left;
			}


			//找到右节点
			if (!stack.isEmpty()) {

				node= stack.pop();
				node= node.right;

			}



		}

	}

	//非递归中序
	public void inOrderNR(){
		inOrder(root);
	}

	//永远先考虑左子树，直到左子树为空才访问根节点
	public void inOrderNR(Node node){

		Stack<Node> stack = new Stack<>();

		while(node!=null || !stack.isEmpty()){
			//1:存入根节点
			while(node!=null) {
				stack.push(node);
				node=node.left;
			}

			//找到右边
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

		//后序遍历
		while(node!=null){
			stack.push(node);
			node= node.left;
		}

		if(!stack.isEmpty()){

			node=stack.peek();

			//如果右边为空 或者右子树已经被访问
			if(node.right==null  || node.right == lastVisit  ){
				System.out.println(node.e );
				stack.pop();
				lastVisit=node;
				node=null;

			}else {
				//继续遍历右子树
				node= node.right;
			}

		}



	}
	
	//生成二叉树 --递归
	public void generateDepthString(Node node,int depth,StringBuilder res){


		if (node == null) {

			res.append(generateDepthString(depth)+"null\n");
			return;
		}
		//输出根节点
		res.append(generateDepthString(depth)+node.e+"\n");
		//左节点
		generateDepthString(node.left, depth+1, res);
		//右节点
		generateDepthString(node.right,depth+1,res);


	}




	//输出层次
	public String  generateDepthString(int depth){

		StringBuilder res = new StringBuilder();

		for (int i = 0; i < depth; i++) {
			res.append("--");
		}
		//返回当前的值
		return res.toString();
	}


	//toString方法
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		generateDepthString(root, 0, res);

		return res.toString();
	}
	  
	
	//找到当前arr的最大值，返回mid
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
	        //1：定义数组的start end 和mid == 数组的最大值 数组下标
	        //2 ： 该节点的左节点== start - mid-1; 
	        //3:该节点的右节点==mid+1, end
	        
	    }
	    
	
	
	
	
	
}
