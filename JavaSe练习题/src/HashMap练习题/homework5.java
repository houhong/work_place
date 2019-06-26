package HashMap练习题;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
/*
 * 给出一个整型数组：返回taget 数据的元素下表：数据不能重复
 * 例如：
 * Given nums = [2, 7, 11, 15], target = 9,
   Because nums[0] + nums[1] = 2 + 7 = 9,
   return [0, 1].
 */

public class homework5 {

	public homework5() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {

		int[] dataArr=dataLibrary();
		HashMap<Integer, String> result = new HashMap<>();
		result = solution(dataArr, 9);
		if (result.size()>0 ) {
			
			Iterator<Entry<Integer, String>> finallData = result.entrySet().iterator();
			while (finallData.hasNext()) {
				
				System.out.println(finallData.next().getValue());
			}
		} else {
			System.out.println("没有数据满足题意");
		}



	}

	public static int[] dataLibrary(){

		return new int[]{2,7,11,15,3,6};

	}

	public static HashMap<Integer, String> solution(int[] dataArr, int target){

		int count = 0;
		HashMap<Integer, String> hm = new HashMap<>();
		for (int i =0;i<dataArr.length;i++) {

			for (int j = (i+1); j < dataArr.length; j++) {

				if (dataArr[i]+dataArr[j] ==target ) {
					
					String result = "[".concat(String.valueOf(i)).concat(",").concat(String.valueOf(j)).concat("]");                
					hm.put(count, result);
					count++;
				} 


			}
		}
		return hm;
		

	}
}
