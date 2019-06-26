package HashMap练习题;

import java.util.HashMap;
/*
 * /*
 * 给出一个整型数组：返回taget 数据的元素下表：数据不能重复
 * 例如：
 * Given nums = [2, 7, 11, 15], target = 9,
   Because nums[0] + nums[1] = 2 + 7 = 9,
   return [0, 1].
   -------------------------------------------
   利用 HashMap 作为存储，键为目标值减去当前元素值，索引为值，  ---有问题，不能去确定是否目标数据是否为唯一
                                                ---假定唯一
   比如 i = 0 时，此时首先要判断 nums[0] = 2 是否在 map 中，
   如果不存在，那么插入键值对 key = 9 - 2 = 7, value = 0，
   之后当 i = 1 时，此时判断 nums[1] = 7 已存在于 map 中，
   那么取出该 value = 0 作为第一个返回值，当前 i 作为第二个返回值，


 */


public class answer {

	public answer() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {
			int[] arr ={2,7,9,13};
			soulution2(arr, 9);
	}

	public static void souluton(int[] arr,int target){

		HashMap<Integer, Integer> hashMap = new HashMap<>();

		/*for (int i = 0; i< arr.length; i++) {
			hashMap.put(arr[i],i);
		}


		for (int i=0;i< arr.length;i++) {
			
			if (hashMap.containsKey((target - arr[i]))) {
				System.out.println("["+i+","+hashMap.get((target - arr[i]))+"]");
			}
		}*/

		/*for (int i = 0; i < hashMap.size(); i++) {

		for (int i : arr) {

			if (!hashMap.containsKey((target-arr[i]))) {

				hashMap.put(arr[i], i);
			} else {
				System.out.println("["+i+","+hashMap.get(arr[i])+"]");
			}
		}*/




		/* //hashMap只能通过值找键  -- 因为唯一性
		      if ( hashMap.containsValue((target-hashMap.get(i)))) {
		    	 System.out.println("["+i+","+));
			} else {

			}*/
	}

	public static void soulution2(int[] arr, int target){

		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (!hashMap.containsKey(arr[i])) {
				hashMap.put(target-arr[i],i );
			} else {
				System.out.println("["+hashMap.get(arr[i])+","+i+"]");
			}
		}


	}


}




