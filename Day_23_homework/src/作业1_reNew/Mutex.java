package ��ҵ1_reNew;
/*
 * ������
 */

public class Mutex {
	
	public boolean flag = false;//Key �����ھ����ĸ��߳����� -- �õ�һ���߳�������
	public Mutex() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	
	
	public Mutex(boolean synchrnized) {
		super();
		flag = synchrnized;
	}


	public boolean getSynchrnized() {
		return flag;
	}
	public void setSynchrnized(boolean synchrnized) {
		flag = synchrnized;
	}
	
	

}
