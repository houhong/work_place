package ��ҵ2;

import org.omg.CORBA.INTERNAL;
/*
 * ��ˮ
 */
public class Output implements Runnable{

	Pool  pool;
	public Output() {
		// TODO �Զ����ɵĹ��캯�����
	}


	public Output(Pool pool) {
		this.pool = pool;
	}

	
	@Override
	public void run() {
		
		while(true){

			synchronized (pool) {

				if (pool.capacity == 100) {
					int count = 1;
					while(count<6){
						System.out.println("���ڳ�ˮ--  ��ˮ����Ϊ��"+count);
						count++;
					}
					System.out.println("��ˮ��ɣ� ��ע��ˮ��");
					pool.setCapacity(0);
					pool.notify();
					try {
						pool.wait();
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
					
				} else {
					System.out.println("����ע��ˮ�����ܳ�ˮ---");
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
