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
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) throws Exception{

		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream("f:\\demo.txt"));
		BufferedReader br = new BufferedReader(new FileReader("f:\\demo.txt"));
		String reader =null;

		//定义容器
		HashMap<String, Person> hm = new HashMap<String,Person>();
		// 遍历  :  -- 体会一下老师的做法
		while( (reader =br.readLine())!= null){
			//返回的是对字符串的操作：--分离字符串 分成建和值
			String[] split = reader.split(",");
			String name = split[0];
			int money   = Integer.valueOf(split[1]);
			int count=1;
			//装入map中
			if(!hm.containsKey(name)){
				//装入初始值
				Person person = new Person(name,money,count);
				hm.put(name, person);
			}else{

				if(money > hm.get(name).getMoney()){
					//如果是 --- 把这个值给人
					hm.get(name).setMoney(money);	
				}
				count++;
				hm.get(name).setCount(count);
			}



		}
		
		/*遍历Map
		Set<Entry<String, Person>> entrySet = hm.entrySet();
		Iterator<Entry<String, Person>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()){
			Entry<String, Person> next = iterator.next();
			System.out.println(next.getValue().toString());
			
		}*/
		
		//比较map中的最大值
		//遍历map
		
		Set<String> keySet = hm.keySet();
		for (String name : keySet) {
			hm.get(name);
			
		}



	}
}







