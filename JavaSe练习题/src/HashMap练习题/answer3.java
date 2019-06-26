package HashMap练习题;

import java.util.HashMap;
/*
 * int[]  arr= [1,2,4,5,3,6,7,8,9,1,2];
 *        because           1+8=9;
 *        so that return    [0,9]
 */

public class answer3 {

	public answer3() {
		// TODO 自动生成的构造函数存根
	}

	public void solution(int[] arr,int target){
		
		//hashMap中存储  <当前的值的答案,当前的值的下标>
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		 
		for (int i = 0; i < arr.length; i++) {
             	
			if(!hashMap.containsKey(arr[i])){
				hashMap.put(target -arr[i],i);
			}else {
				System.out.println("["+hashMap.get(arr[i])+","+i);
			}
			


		}







	}

}
