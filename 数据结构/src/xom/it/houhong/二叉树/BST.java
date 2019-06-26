package xom.it.houhong.二叉树;

import java.util.Stack;

import org.ietf.jgss.Oid;
/*
 * 二叉排序树
 */

public class BST<E extends Comparable<E>>{


	public Node root;
	public int size;
	public BST() {

		this.size=0;
		this.root=null;

	}

	//节点
	private class Node{

		public E e;
		public Node left,right;

		public Node() {
			this.e = e;
			this.left=null;
			this.right=null;
		}

		public Node(E e){
			this.e=e;
		}

	}



	//生成set和get方法
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	//写深度
	public String generateDepthString(int depth){

		StringBuilder res = new StringBuilder();

		for (int i = 0; i < depth; i++) {
			res.append("--");
		}
		return res.toString();
	}

	//生成一颗二叉树 --递归
	public void generateBST(Node node,int depth,StringBuilder res){

		if (node==null) {
			res.append(generateDepthString(depth)+"null\n");
			return;
		}
		//输出根节点
		res.append(generateDepthString(depth)+node.e+"\n");

		//左孩子
		generateBST(node.left, depth+1, res);
		//右孩子
		generateBST(node.right, depth+1, res);

	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		generateBST(root, 0,res );
		return res.toString();

	}

	public void inOrderNR(){

		inOrderNR(root);

	}
	public void inOrderNR(Node node){

		Stack<Node> stack = new Stack<>();

		while(node!=null || !stack.isEmpty()){


			while (node!=null) {
				stack.push(node);
				node=node.left;
			}

			//拿到右节点
			if (!stack.isEmpty()) {
				node=stack.pop();
				System.out.println(node.e);
				node=node.right;	
			}
		}
	}
	
	

	//从二叉树中删除元素为e的节点
	public void remove(E e){
		root = remove(root,e);
	}
	
	

	//删除以root为根的二叉树
	private  Node remove(Node node,E e){

		//如果节点为空：表明为空树
		if(node ==null){
			return null;
		}
		//小于当前的节点，到左子树去删除
		if (e.compareTo(node.e)<0 ) {
			
			//到左边去删除,将结果返回给左子树
			node.left = remove(node.left,e);
			return node.left;
			
		}
		if (e.compareTo(node.e) >0 ) {
			node.right= remove(node.right, e);
		}
		else{//node.e == e 删除node  
			
			//左孩子为空
			if (node.left ==null) {
				//保存右孩子
			    Node nodeRight = node.right;
			    node.right=null; 
			    size--;
			    return nodeRight;
			}
			
			//右孩子为空
			if (node.right == null) {
				//保存左孩子
				Node nodeleft = node.left;
				node.left=null;
				size--;
				return node.right;
			}
			
			//左右子树均不为空 -- 找到比该节点大的最小节点
			Node successor = minmum(node.right);
			//successor.right = remove(node, e)
			
			
			
		}
		return node;
	}
	
	
	// 返回删除节点后新的二分搜索树的根
    private Node removeMin(Node node){

        if(node.left == null){
            Node rightNode = node.right;
            node.right = null;
            size --;
            return rightNode;
        }

        node.left = removeMin(node.left);
        return node;
    }

    // 从二分搜索树中删除最大值所在节点
    public E removeMax(){
        E ret = maximum();
        root = removeMax(root);
        return ret;
    }

    // 删除掉以node为根的二分搜索树中的最大节点
    // 返回删除节点后新的二分搜索树的根
    private Node removeMax(Node node){

        if(node.right == null){
            Node leftNode = node.left;
            node.left = null;
            size --;
            return leftNode;
        }

        node.right = removeMax(node.right);
        return node;
    }
	
	//找到最小的节点元素
	public E minmum(){
		
		if (size == 0) {
			throw new IllegalArgumentException("BST is empty");
		}
		return minmum(root).e;
	}
	//找到最小节点 --排序树的最左边
	public Node minmum(Node node){
		
		if(node.left==null){
			return node;
		}
		return minmum(node.left);
	}
	
	//找到最大的元素
	public E maximum(){
		if(size == 0){
			throw new IllegalArgumentException();
		}
		return maximum(root).e;
			
	}
	//找到最大节点
    public Node maximum(Node node){
    	
    	if (node.right==null) {
			return node;
		}
    	
    	
    	return maximum(node.right);
    }
    
    
	
	public void postOrderNR(){

		postOrderNR(root);
	}


	//后序遍历
	public void postOrderNR(Node node){

		Stack<Node> stack = new Stack<>();

		while(node!=null || !stack.isEmpty())
		{	
			if (node!=null) {
				stack.push(node);
				node=node.left;
			}

			if (!stack.isEmpty()) {
				node=stack.pop();
				node=node.right;
				if (node!=null) {
					System.out.println(node.e);
				}

			}
		}


	}

	public boolean isEmpty(){

		return size==0;
	}

	//先序遍历  --非递归
	public void preOrderNR(){

		preOrderNR(root);

	}
	public void preOrderNR(Node node){

		//一路向左--利用栈
		Stack<Node> stack = new Stack<>();
		while (node!=null || !stack.isEmpty()) {

			//1：存入根节点，用于查找右节点

			while(node!=null){
				System.out.println(node.e);
				stack.push(node);
				node=node.left;
			}

			//找出右节点
			if(!stack.isEmpty()) {
				node=stack.pop();
				node=node.right;
			}
		}




	}


	//添加元素的办法
	public void add(E e){

		root = add(root, e);

	}
	//返回插入后的根节点
	public Node add(Node node,E e){


		if(node == null){
			size++;
			return new Node(e);
		}

		if (e.compareTo(node.e)<0 && node !=null) {
			node.left=add(node.left, e);
		}
		if(e.compareTo(node.e) >0 && node !=null){
			node.right=add(node.right, e);
		}
		return node;
	}


	/*if (node==null || e.compareTo(node.e)==0) {
			return;
		}else {
			if (e.compareTo(node.e)<0 && node !=null) {
				add(node.left,e);
				return;
			}
			if(e.compareTo(node.e)>0 && node !=null){
				add(node.right, e);
				return;
			}
		}


		if (e.compareTo(node.e)<0 && node !=null) {
			node.left = new Node(e);
		}
		if (e.compareTo(node.e)>0 && node !=null) {
			node.right = new Node(e);
		}
	 */
}





