package demo;

public class demo {

	public demo() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {
		
		

		Thread t1=new Thread(){

			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				
				System.out.println("��ϲ���㣡��");
	
			}

		};
		Thread t2 =	new Thread(new Runnable() {

			@Override
			public void run() {
				
				try {
					t1.join();//û�п��̵߳Ļ����Ͳ���ִ��
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				System.out.println("��Ҳϲ��ni");
				

			}
		});
		t2.start();
		t1.start();
		
	}

}
