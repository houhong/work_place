
package HashMap��ϰ��;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapTest {

	//

	public static void main(String[] args) {

		HashMap<Integer,User> users=new HashMap<>();



		users.put(1, new User("����",25));

		users.put(3, new User("����",22));

		users.put(2, new User("����",28));



		System.out.println(users);



		HashMap<Integer,User> sortHashMap=sortHashMap(users);

		System.err.println(sortHashMap);



	}

	// ����һ����������ķ���

	// Ҫ��ʵ�� �� HashMap ������ valueֵ ��User ����� age ���ԣ����� ����



	public static HashMap<Integer,User> sortHashMap(HashMap<Integer,User> map){

		// �õ� map���ϼ�ֵ��

		Set<Entry<Integer,User>> entrySet=map.entrySet();

		// �� set ���� ת��Ϊ List ����

		List<Entry<Integer,User>> list= new ArrayList<Entry<Integer,User>> (entrySet);

		// ʹ�� Collections ���� ������ ��List ���� ����,�������ʹ�� �����ڲ�����ʵ��

		Collections.sort(list,new Comparator<Entry<Integer,User>>(){



			// ����Ҫ�� ���� User ��age �ĵ����������



			public int compare(Entry<Integer,User> o1,Entry<Integer,User> o2){
				
				// ����ֵΪint���ͣ�����0��ʾ����С��0��ʾ����
				//���ݵ�һ������С�ڡ����ڻ���ڵڶ��������ֱ𷵻ظ����������������
				return o2.getValue().getAge()-o1.getValue().getAge();

			}



		});



		// ���� �µ� ����� hahMap ����ļ���

		LinkedHashMap<Integer,User> linkedHashMap=new LinkedHashMap<Integer,User>();



		// �� List �е����� �洢 �� LinkedHashMap��

		for(Entry<Integer,User> entry:list){

			linkedHashMap.put(entry.getKey(),entry.getValue());

		}



		return linkedHashMap;



	}





}

