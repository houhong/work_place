package demo;

/*
 * 2������������ļ��ϣ����ϵ�ÿ��Ԫ�ض���һ�η�Χ�����佻����
 *    ���罻��{[4,8],[9,13]}��{[6,12]}�Ľ�����{[6,8],[9,12]}
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.print.attribute.standard.RequestingUserName;

public class homework_1 {

	public homework_1() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {

		//����׼��


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


		//�Ƚ����ݣ�
		comPare(list1, list2);

	}




	public static void comPare(List<List<Integer>>  list1 ,List<List<Integer>>  list2){

		Iterator<List<Integer>> iterator01 = list1.iterator();

		while(iterator01.hasNext()){
			
			List<Integer> current = iterator01.next();
			//��߽�ȡ��ֵ���ұ߽�ȡСֵ
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


