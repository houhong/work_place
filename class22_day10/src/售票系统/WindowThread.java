package ��Ʊϵͳ;
/*
 * ����
 */

public class WindowThread extends Thread{


	public WindowThread() {
		// TODO �Զ����ɵĹ��캯����

	}
	//��ʼ��Ʊ��
	public  int ticket = 100;

	//�����̹߳��ж��� --�������

	Object obj;

	//��������  �Ͷ�����
	public WindowThread(String name,Object obj) {

		super(name);
		this.obj =obj;
	}

	public WindowThread(int ticket) {
		super();
		this.ticket = ticket;
	}

	public int getTicket() {
		return ticket;
	}



	public  void setTicket(int ticket) {

		this.ticket = ticket;
	}



	@Override
	public void run() {

		//������  --ͬһ��
		synchronized (obj) {
			while(true){


				if(ticket>0){
					//��Ʊ
					System.out.println(Thread.currentThread().getName()+"���˵�"+(ticket--)+"Ʊ");
					ticket--;
				}
				if(ticket<=0){
					break;
				}
			}
		}

	}



}
