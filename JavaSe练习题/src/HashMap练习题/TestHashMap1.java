package HashMap练习题;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
/*
 * 1，做统计表：
 *     随机产生10万个数据，数据范围在1 - 1000,统计每个数据出现的次数
 */


public class TestHashMap1 {

	public TestHashMap1() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		ArrayList<Integer> data = new ArrayList<>();

		data= Data(10, 1000);
		
		hashMap=DataNumber(data);
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while (iterator.hasNext()) {
			
			Integer integer = (Integer) iterator.next();
			System.out.println("数据："+integer+"的次数是： "+hashMap.get(integer));
			
		}
		


		/*Iterator<Integer> iterator = data.iterator();
		while (iterator.hasNext()) {
			Integer integer =  iterator.next();
			System.out.println(integer);

		}*/
	}

	public static ArrayList<Integer> Data(int range,int number){

		ArrayList<Integer> dataLibrary = new ArrayList<>();

		int count = 0;

		while(count<number){
			int  MAX_VALUE = range;
			Random random = new Random();

			int data =random.nextInt(MAX_VALUE);
			dataLibrary.add(data);
			count++;
		}
		return dataLibrary;

	}


	public static HashMap<Integer, Integer> DataNumber(ArrayList<Integer> dataLibrary){

		//利用HashMap做统计表  - key :数据  value:次数
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (Iterator iterator = dataLibrary.iterator(); iterator.hasNext();) {

			Integer data = (Integer) iterator.next();
			/*if (hashMap.containsKey(data)) {
				 V get(Object key) 
		                     返回指定键所映射的值；如果对于该键来说，此映射不包含任何映射关系，则返回 null。 

				//将此key对对应的value+1;
				int  count = hashMap.get(data);
				count++;
				hashMap.put(data, count);
			} else {

			      hashMap.put(data,1);
			}*/
			if (!hashMap.containsKey(data)) {
				//初始化hashMap
				hashMap.put(data,1);
			} else {
				//次数加一
				int  count = hashMap.get(data);
				count++;
				hashMap.put(data, count);
			}


		}

		return hashMap;


	}









}
