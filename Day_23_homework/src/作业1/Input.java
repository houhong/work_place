package ��ҵ1;



public class Input implements Runnable{

	//׼������
	int count = 0;

	int[] arr= new int[]{12,34,56,78,910,1112,1314,1516,1718,1920,2122,2324,2526,2728,2930,3132,3334,3536,3738,3940,4142,4344,4546,4748,4950,5152};

	public Resource re;
	public Input(Resource re) {
		this.re = re;
	}

	@Override
	public   void run() {
		// TODO �Զ����ɵķ������

		while(true){
			//ʹ����̵߳ȴ�
			synchronized(re){

				if(re.flag ==true){
					re.notify();
					re.setFlag(false);
				}

				System.out.print(arr[count]);
				count++;
				
				if(count>=26){
					break;
				}
				/*	if(count>52)
				{
					break;
				}
				int[] array= Data();

				System.out.print(array[count]);
				System.out.println(array[++count]);*/

				try {
					re.wait();
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}


			}

		}



	}

}
