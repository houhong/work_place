package thread;
/*
 * 5��22��
 */

public class Test {

	public Test() {
		// TODO �Զ����ɵĹ��캯�����
	}
    public void test(){
    	for (int i = 0; i < 100; i++) {
    		//�õ���ǰ�߳�
			Thread thread =Thread.currentThread();
			//System.out.println(thread.getName());
			System.out.println(thread );
			
			try {
				thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println("����߳�  һ");
		}
    }
}
