package hashMap_bianni;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;
/*
 * hashMap�ı���
 */

public class hashMap {


	@Test
	public void Test(){

		//����HashMap
		HashMap<Integer, String> hashMap = new HashMap<>();
		//װ����
		hashMap.put(1, "һ");
		hashMap.put(2, "��");
		hashMap.put(3, "��");
		hashMap.put(4, "��");
		hashMap.put(5, "��");
		hashMap.put(6, "��");
		hashMap.put(7, "��");
		hashMap.put(8, "��");
		

		//����hashMap 1:����hashMap.EntrySet<Integer, String>();
		System.out.println("��һ�ַ���������hashMap 1:����hashMap.EntrySet<Integer, String>()");

		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();

		// set�ĵ�����
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		//��������������
		while(iterator.hasNext()){
			
			//������ֵ
			Entry<Integer, String> next = iterator.next();
			
			//��ֵ��
			String value =next.getValue();
			Integer key = next.getKey();
			System.out.println("value=:" +value + "key=:" +key);
		}

		System.out.println("=========================");
		System.out.println("�ڶ��ַ���������hashMap 2:����hashMap.keySet()");
		
		Set<Integer> keySet = hashMap.keySet();
		
		Iterator<Integer> iterator2 = keySet.iterator();
		
		while(iterator2.hasNext()){
			
			Integer next = iterator2.next();
			int key =next;
			String value2= hashMap.get(key);
			
			System.out.println("value=:" +value2 + "\t"+"key=:" +key);
		}
		
		//������. ͨ��Map.entrySet����key��value
		System.out.println("s������. ͨ��Map.entrySet����key��value");
		System.out.println("===================================");
		
		//ͨ��entrySet����
		
		
		
		
		
		
	}


	public hashMap() {
		// TODO �Զ����ɵĹ��캯�����
	}

}
