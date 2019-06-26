package ��ҵ2;

public class Input implements Runnable {

	Pool pool ;

	public Input(Pool pool) {
	
		this.pool = pool;
	}

	public Input() {
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void run() {
		
		while(true){
			
			synchronized (pool) {
				if (pool.capacity == 0) {
					//System.out.println("��ˮ��ɣ���Ҫעˮ");
					int count = 1;
					while (count<10) {
						System.out.println("����ע��ˮ������"+"��"+count+"��");
						count++;
					}
					pool.setCapacity(100);
					pool.notify();
					try {
						pool.wait();
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
					
				}else {
					System.out.println("���ڳ�ˮ������--����ע��");
					
					pool.notify();
					try {
						pool.wait();
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
			}
		}
		

	}

}
