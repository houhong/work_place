package hashMap_bianni;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.xml.sax.HandlerBase;
/*
 * �Ӵ�ӳ�����Ƴ�����ӳ���ϵ����ѡ��������           --clear();
 * �����ӳ�����ָ������ӳ���ϵ���򷵻� true�� --contrainsKey(Object key);
 *  ���ش�ӳ���а�����ӳ���ϵ�� Set ��ͼ             -- EntrySet()
 */

/*
 * hashMap�ı�����
 * 
 */

public class bianni_hashmap {

	public static void main(String[] args) {
		Data();
	}
	//׼������
	public static void Data(){

		//׼������
		HashMap<Integer, String> hashMap = new HashMap<>();

		hashMap.put(1, "gogo");
		hashMap.put(2, "wade");
		hashMap.put(3, "james");
		hashMap.put(4, "curry");

		// 1. ͨ��Map.keySet����key��value��
		for(int key :hashMap.keySet()){

			//1:HashMap��get��put����
			System.out.println("key:"+key +"\t"+"value:"+hashMap.get(key));
			//2:ͨ��map.EntrySet<Integer,String> ���б���
		}
		
		System.out.println("\t"+"============================="+"\t");
		
		//2:�ڶ��ַ�����entrySet����
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		//entry�ĵ�����
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		
		
		
	}
	//1. ͨ��keyset
	public static void method_1(){

	}
}
