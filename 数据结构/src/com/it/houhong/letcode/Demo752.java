package com.it.houhong.letcode;





import xom.it.houhong.������.BST1;


/*
 * ���������ǿն����� s �� t������ s ���Ƿ������ t ������ͬ�ṹ�ͽڵ�ֵ��������s ��һ���������� s ��һ���ڵ������ڵ���������s Ҳ���Կ����������һ��������

ʾ�� 1:
�������� s:

     3
    / \
   4   5
  / \
 1   2


�������� t��

   4 
  / \
 1   2


���� true����Ϊ t �� s ��һ������ӵ����ͬ�Ľṹ�ͽڵ�ֵ��

ʾ�� 2:
�������� s��

     3
    / \
   4   5
  / \
 1   2
    /
   0


�������� t��

   4
  / \
 1   2


���� false��
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
		//subTree������
		int[] sonNum= new int[]{1,3,4};
		
		for (int i : sonNum) {
			subTree.add(i);
		}
		System.out.println(subTree);
		
		System.out.println(isSubTree(fatherTree.root, subTree.root));
		
		
	}
	
	//�鿴�ǲ�������--Ϊʲô���벻����
	public static boolean isSubTree(Node s,Node t){
		
			
			if (s==null) {
				return false;
			}
			//�鿴�ǲ����Լ��Ľڵ�//�ٲ鿴�ǲ����������Ľڵ�//�ٿ����ǲ����������Ľڵ�
			return isSame(s, t) || isSame(s.left, t) || isSame(s.right, t);
		
	}
	
	
	public static boolean isSame(Node s,Node t){
		
		//����������Ϊ�յ������,���ж�
		if (s!=null && t!=null) {
			return s.e== t.e && isSame(s.left, t.left) && isSame(s.right, t.right); 
		}else if (s==null && t==null) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	
	
	
	
	
	

}
