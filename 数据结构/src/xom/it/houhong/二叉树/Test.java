package xom.it.houhong.������;
/*
 * ������
 */

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		BST1<Integer> bst = new BST1<>();
		//BST<Integer>  bst= new BST<>();
		int[] nums = {5, 3, 6, 8, 4, 2};
		for(int num: nums)
			bst.add(num);

		/////////////////
		//      5      //
		//    /   \    //
		//   3    6    //
		//  / \    \   //
		// 2  4     8  //
		/////////////////
		
		
	      //bst1.postOrder();
	
		
	
		//bst.postOrder();
		//bst.postOrderNR();
		//bst.inOrderNR();//�������Ϊ�����㷨
		//bst.inOrderNR();
		//System.out.println(bst.maximum());
		
		System.out.println(bst.minmun());
		//System.out.println());
		System.out.println();
		
		
		System.out.println(bst);
		
		
	   /* bst.inOrder();
		System.out.println();

		System.out.println(bst);*/
	}
	
	//����ǵݹ�

	
	
	
	
	
	

}
