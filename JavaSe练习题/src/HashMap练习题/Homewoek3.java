package HashMap��ϰ��;

import java.util.ArrayList;
/*
 * /*

��ϰ����asdkljflasdjfl����ȡ�ַ����ֵĸ���
      --�Ѿ����գ�hashMap��Ϊͳ�Ʊ�
          ϣ����ӡ�����a(1)c(2)
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;

import javax.xml.crypto.Data;

import Thread_1.demo1;

public class Homewoek3 {

	public Homewoek3() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {


		ArrayList<Character> arrayList = new ArrayList<>();
		arrayList=Data();
        serach(arrayList);

		

	}

	public static  ArrayList<Character> Data(){

		ArrayList<Character> arrayList = new ArrayList<>();
		int MAX_VALUE =26;
		int count =0;
		char[] arr = new char[]{'a','b','c','d','e','f','g','h','i','j'};
		Random random = new Random();

	
		while(count<MAX_VALUE){
			
			int ch =random.nextInt(arr.length);
			arrayList.add(arr[ch]);
			count++;
		}

		return arrayList;
	}

	public static void serach(ArrayList<Character> arrayList){

		HashMap<Character, Integer> hashMap = new HashMap<>();

		Iterator<Character> iterator2 = arrayList.iterator();

		while (iterator2.hasNext()) {
			Character ch = (Character) iterator2.next();

			if (!hashMap.containsKey(ch)) {
				hashMap.put(ch, 1);
			} else {
				hashMap.put(ch,(hashMap.get(ch)+1));

			}

		}
		Iterator<Entry<Character, Integer>> iterator = hashMap.entrySet().iterator();
	 
		while (iterator.hasNext()) {
			
			Entry<Character, Integer> entry= iterator.next();
			System.out.println("�ַ�"+entry.getKey()+"("+entry.getValue()+")");
			
		}
	
	}








}
