package HashMap��ϰ��;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
/*
 * 1����ͳ�Ʊ�
 *     �������10������ݣ����ݷ�Χ��1 - 1000,ͳ��ÿ�����ݳ��ֵĴ���
 */


public class TestHashMap1 {

	public TestHashMap1() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		ArrayList<Integer> data = new ArrayList<>();

		data= Data(10, 1000);
		
		hashMap=DataNumber(data);
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while (iterator.hasNext()) {
			
			Integer integer = (Integer) iterator.next();
			System.out.println("���ݣ�"+integer+"�Ĵ����ǣ� "+hashMap.get(integer));
			
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

		//����HashMap��ͳ�Ʊ�  - key :����  value:����
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (Iterator iterator = dataLibrary.iterator(); iterator.hasNext();) {

			Integer data = (Integer) iterator.next();
			/*if (hashMap.containsKey(data)) {
				 V get(Object key) 
		                     ����ָ������ӳ���ֵ��������ڸü���˵����ӳ�䲻�����κ�ӳ���ϵ���򷵻� null�� 

				//����key�Զ�Ӧ��value+1;
				int  count = hashMap.get(data);
				count++;
				hashMap.put(data, count);
			} else {

			      hashMap.put(data,1);
			}*/
			if (!hashMap.containsKey(data)) {
				//��ʼ��hashMap
				hashMap.put(data,1);
			} else {
				//������һ
				int  count = hashMap.get(data);
				count++;
				hashMap.put(data, count);
			}


		}

		return hashMap;


	}









}
