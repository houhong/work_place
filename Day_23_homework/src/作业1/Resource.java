package ��ҵ1;

import javax.swing.plaf.basic.BasicOptionPaneUI;


/*
 * ��Դ:���������
 */

public class Resource {

	public String wife ="key";
	public String hushand="value";
	public boolean flag = true;//�����ж��Ƿ���Ҫ��������   flag ==true����Ҫ����
	
	public boolean  getFlag() {
		return flag;
	}


	public void setFlag(Boolean flag) {
		this.flag = flag;
	}


	

	public Resource() {
		// TODO �Զ����ɵĹ��캯�����
	}


	public Resource(String wife, String hushand) {
		super();
		this.wife = wife;
		this.hushand = hushand;
	}



	public String getWife() {
		return wife;
	}


	public void setWife(String wife) {
		this.wife = wife;
	}


	public String getHushand() {
		return hushand;
	}


	public void setHushand(String hushand) {
		this.hushand = hushand;
	}


	@Override
	public String toString() {
		return "Resource [wife=" + wife + ", hushand=" + hushand + "]";
	}

	
}
