package LinkTable;

import javax.sound.midi.MidiChannel;
/*
 *   ���ֲ���  -- ���������ö��ֲ���  --- 
 *   
 *   
 */

public class Test1 {

	public Test1() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {





	}


	public static int binarySerach(int key,int[] arr){
		//��������������	
		int lo = 0;
		int hi = arr.length -1;

		while(lo<= hi){

			int mid = (hi - lo)/2;
			//�����ǰ����<������ �����鵥λ���
			if (key <=arr[mid]) {
				hi = arr[mid];
			} else if(key>arr[mid]) {
				lo= arr[mid];
			}else{
				return mid;
			}

		}
		return -1;

	}

	/*
	 * ŷ������㷨 ��������������p ��q�����Լ����
	 * 
	 * 1����q = 0,���Լ����p,������p/q   --- �õ�����r.
	 * p��q �����Լ������q ��r �����Լ��
	 */
	public static int  fucntion(int p,int q){

		if(q == 0){//q = 0������p 
			return p;
		}else{
			
			int r = p % q;
			return fucntion(p, q);	
		}

	}






}