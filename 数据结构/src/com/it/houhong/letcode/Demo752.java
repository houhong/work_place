package com.it.houhong.letcode;





import xom.it.houhong.二叉树.BST1;


/*
 * 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。

示例 1:
给定的树 s:

     3
    / \
   4   5
  / \
 1   2


给定的树 t：

   4 
  / \
 1   2


返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。

示例 2:
给定的树 s：

     3
    / \
   4   5
  / \
 1   2
    /
   0


给定的树 t：

   4
  / \
 1   2


返回 false。
*/

public class Demo752 extends BST1{

	public Demo752() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) { 
		
		BST1<Integer> fatherTree =new BST1<>();
		
		int[] nums = new int[]{1,3,4,5};
		
		for (int i : nums) {
			
			fatherTree.add(i);
		}
		System.out.println(fatherTree);
		
		BST1<Integer> subTree =new BST1<>();
		//subTree的数字
		int[] sonNum= new int[]{1,3,4};
		
		for (int i : sonNum) {
			subTree.add(i);
		}
		System.out.println(subTree);
		
		System.out.println(isSubTree(fatherTree.root, subTree.root));
		
		
	}
	
	//查看是不是子树--为什么我想不到呢
	public static boolean isSubTree(Node s,Node t){
		
			
			if (s==null) {
				return false;
			}
			//查看是不是自己的节点//再查看是不是左子树的节点//再看看是不是右子树的节点
			return isSame(s, t) || isSame(s.left, t) || isSame(s.right, t);
		
	}
	
	
	public static boolean isSame(Node s,Node t){
		
		//在两方都不为空的情况下,再判断
		if (s!=null && t!=null) {
			return s.e== t.e && isSame(s.left, t.left) && isSame(s.right, t.right); 
		}else if (s==null && t==null) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	
	
	
	
	
	

}
