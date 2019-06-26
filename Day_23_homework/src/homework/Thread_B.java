package homework;

public class Thread_B implements Runnable{


	Mutex obj ;
	public Thread_B(Mutex obj) {

		this.obj=obj;
	}
	/*public static void main(String[] args) {
		String str="abcdefghijklmnopqrstuvwxyz";
		System.out.println(str.length());
	}*/


	@Override
	public void run() {
		// ���һ����ĸ
		synchronized (obj) {

			//flag == false  ��ʾA�߳�����
			if(obj.flag == false){
				obj.notify();
				obj.flag=true;
			}else{
				//׼����ĸ 
				String str="abcdefghijklmnopqrstuvwxyz";
				byte[] byteArray = str.getBytes();
					System.out.println("�����߳�B");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}


		}

	}

}
