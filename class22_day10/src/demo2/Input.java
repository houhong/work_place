package demo2;

public class Input implements Runnable{

	int i=0;
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
				if(i%2==0){
					re.setHushand("key");
					re.setWife("value");

				}else{
					re.setHushand("��ţ");
					re.setWife("ɧ��");	
					//������̻߳���
				}
				
				i++;
				
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
