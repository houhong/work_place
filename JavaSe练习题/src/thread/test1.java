package thread;
/*
 * ���ڱ�ʾ��run()��������
 */

public class test1 {

	public test1() {
		// TODO �Զ����ɵĹ��캯�����
	}
	 
	public void function(){
		for(int i=0;i<100;i++){
	
			Thread currentThread = Thread.currentThread();
			System.out.println(currentThread);
			System.out.println("���-------");
		}
		
	}

}
