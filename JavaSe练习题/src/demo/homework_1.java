package demo;

/*
 * 2、有两个有序的集合，集合的每个元素都是一段范围，求其交集，
 *    例如交集{[4,8],[9,13]}和{[6,12]}的交集是{[6,8],[9,12]}
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.print.attribute.standard.RequestingUserName;

public class homework_1 {

	public homework_1() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		//数据准备


		List<Integer> list01 = new ArrayList<>();

		list01.add(4);
		list01.add(8);

		List<Integer> list02 = new ArrayList<>();

		list02.add(9);
		list02.add(13);

		List<List<Integer>> list1 = new ArrayList<>();

		list1.add(list01);
		list1.add(list02);


		List<Integer> list03 = new ArrayList<>();

		list03.add(6);
		list03.add(12);

		List<List<Integer>> list2 = new ArrayList<>();

		list2.add(list03);


		//比较数据：
		comPare(list1, list2);

	}




	public static void comPare(List<List<Integer>>  list1 ,List<List<Integer>>  list2){

		Iterator<List<Integer>> iterator01 = list1.iterator();

		while(iterator01.hasNext()){
			
			List<Integer> current = iterator01.next();
			//左边界取大值，右边界取小值
			int leftMax =0;
			int rightmin=0;
		
			
			if (current.get(0)>list2.get(0).get(0)) {
				 leftMax=current.get(0);
			} else {
				 leftMax=list2.get(0).get(0);
			}
			
		
			if (current.get(1)>list2.get(0).get(1)) {
				
				rightmin=list2.get(0).get(1);
			} else {
				rightmin=current.get(1);
			}
			
			 System.out.println("["+leftMax+","+rightmin+"]");

		}


	}



}


