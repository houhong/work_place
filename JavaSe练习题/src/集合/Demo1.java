package 集合;

import java.util.ArrayList;
import java.util.List;



/*
 * 2、有两个有序的集合，集合的每个元素都是一段范围,
 *   求其交集，例如交集{[4,8],[9,13]}和{[6,12]}的交集是{[6,8],[9,12]}
 */
public class Demo1 {

	public Demo1() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {

		List<List<Integer>> list1 = new ArrayList<>();

		List<Integer>  list01 = new ArrayList<>();
		List<Integer>  list02 = new ArrayList<>();
		List<Integer>  list03 = new ArrayList<>();
		List<Integer>  list04 = new ArrayList<>();

		list1.add(list01);
		list1.add(list02);
		list1.add(list03);
		list1.add(list04);

		//一
		list01.add(4);
		list01.add(8);
		for (Integer integer : list01) {
			System.out.println(integer);
		}

		//二
		list02.add(9);
		list02.add(13);

		List<List<Integer>>  list2 = new ArrayList<>();
		List<List<Integer>>  result = new ArrayList<>();

		list03.add(6);
		list03.add(12);

		list2.add(list03);

		for (List<Integer> list : list2) {

		}

		for (List<Integer> list : list1) {
			if (list.get(1) < list2.get(0).get(0)) {
				;
			} else {
				if (list.get(1)<list2.get(0).get(1)) {

					list04.add(list.get(1));
					list04.add(list2.get(0).get(0));
					//结果
					result.add(list04);
					list04.remove(0);
					list04.remove(1);
				} else {
					;
				}

			}
		}




	}
}
