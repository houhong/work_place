package HashMap��ϰ��;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/*
 * ��֪һ�� HashMap<Integer��User>���ϣ� User �� name��String���� age��int�����ԡ���дһ������ʵ��
�� HashMap �������ܣ��÷������� HashMap<Integer��User>Ϊ�βΣ���������Ϊ HashMap<Integer��User>��
Ҫ��� HashMap �е� User �� age ���������������ʱ key=value ��ֵ�Բ��ò�ɢ��
--------------------- 

 */
import java.util.List;
import java.util.Map;
import java.util.Set;

public class homewoek4 {

	public homewoek4() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {

		HashMap<Integer,User> hashMap = new HashMap<>();
		hashMap =  data();

	}

	public static HashMap<Integer,User> sort(HashMap<Integer,User> oldMap,HashMap<Integer,User> newMap){

		List<User> entryArr = new ArrayList<>();

		Iterator<Integer> keySet = oldMap.keySet().iterator();

		while (keySet.hasNext()) {

			Integer num = (Integer) keySet.next();
			entryArr.add(oldMap.get(num));
		}




		return newMap;

	}

	public static HashMap<Integer, User>  data(){

		HashMap<Integer, User> hashMap = new HashMap<>();

		hashMap.put(1,new User("����",60));
		hashMap.put(2,new User("����",30));
		hashMap.put(3,new User("����",50));
		hashMap.put(4,new User("����",20));

		return hashMap;




	}
}
