package HashMap��ϰ��;

import java.util.HashMap;
/*
 * /*
 * ����һ���������飺����taget ���ݵ�Ԫ���±����ݲ����ظ�
 * ���磺
 * Given nums = [2, 7, 11, 15], target = 9,
   Because nums[0] + nums[1] = 2 + 7 = 9,
   return [0, 1].
   -------------------------------------------
   ���� HashMap ��Ϊ�洢����ΪĿ��ֵ��ȥ��ǰԪ��ֵ������Ϊֵ��  ---�����⣬����ȥȷ���Ƿ�Ŀ�������Ƿ�ΪΨһ
                                                ---�ٶ�Ψһ
   ���� i = 0 ʱ����ʱ����Ҫ�ж� nums[0] = 2 �Ƿ��� map �У�
   ��������ڣ���ô�����ֵ�� key = 9 - 2 = 7, value = 0��
   ֮�� i = 1 ʱ����ʱ�ж� nums[1] = 7 �Ѵ����� map �У�
   ��ôȡ���� value = 0 ��Ϊ��һ������ֵ����ǰ i ��Ϊ�ڶ�������ֵ��


 */


public class answer {

	public answer() {
		// TODO �Զ����ɵĹ��캯�����
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




		/* //hashMapֻ��ͨ��ֵ�Ҽ�  -- ��ΪΨһ��
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




