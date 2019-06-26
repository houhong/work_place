package HashMap练习题;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
/*
 *   int[] arr ={2,7,9,13}; target = 9;
 *   because 2+7 =9
 *   return [0,1];
 */


import duoxiancheng.test;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
--------------------- 

 */


public class answer2 {

	public answer2() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
	    int[] arr= new  int[]{1,2,7,8,9,1,3,3,4,5,6,8,6,8,12,13};
	    int target = 9;
		souluttion(arr, target);
	}
	
	public static void souluttion(int[] arr, int target){
		
		HashMap<Integer, Integer> answer = new HashMap<>();
		
		for (int currentValueIndex = 0; currentValueIndex < arr.length; currentValueIndex++) {
			int cunrrentArrValue =arr[currentValueIndex];
			int currentAnswer = target -cunrrentArrValue;
			if (!answer.containsKey(cunrrentArrValue)) {
				    
				    answer.put(currentAnswer,currentValueIndex);//arr[i]+(target- arr[i]) == 9
			} else {
					System.out.println("["+answer.get(cunrrentArrValue)+","+currentValueIndex+"]");
			}
		}
		
	}
	
	
	
}
