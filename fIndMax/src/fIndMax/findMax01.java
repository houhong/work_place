package fIndMax;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 
 */

public class findMax01 {

	public findMax01() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) throws Exception{

		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream("f:\\demo.txt"));
		BufferedReader br = new BufferedReader(new FileReader("f:\\demo.txt"));
		String reader =null;

		//��������
		HashMap<String, Person> hm = new HashMap<String,Person>();
		// ����  :  -- ���һ����ʦ������
		while( (reader =br.readLine())!= null){
			//���ص��Ƕ��ַ����Ĳ�����--�����ַ��� �ֳɽ���ֵ
			String[] split = reader.split(",");
			String name = split[0];
			int money   = Integer.valueOf(split[1]);
			int count=1;
			//װ��map��
			if(!hm.containsKey(name)){
				//װ���ʼֵ
				Person person = new Person(name,money,count);
				hm.put(name, person);
			}else{

				if(money > hm.get(name).getMoney()){
					//����� --- �����ֵ����
					hm.get(name).setMoney(money);	
				}
				count++;
				hm.get(name).setCount(count);
			}



		}
		
		/*����Map
		Set<Entry<String, Person>> entrySet = hm.entrySet();
		Iterator<Entry<String, Person>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()){
			Entry<String, Person> next = iterator.next();
			System.out.println(next.getValue().toString());
			
		}*/
		
		//�Ƚ�map�е����ֵ
		//����map
		
		Set<String> keySet = hm.keySet();
		for (String name : keySet) {
			hm.get(name);
			
		}



	}
}







