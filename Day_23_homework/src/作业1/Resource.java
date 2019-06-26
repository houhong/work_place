package 作业1;

import javax.swing.plaf.basic.BasicOptionPaneUI;


/*
 * 资源:新娘和新郎
 */

public class Resource {

	public String wife ="key";
	public String hushand="value";
	public boolean flag = true;//用于判断是否需要输入和输出   flag ==true不需要输入
	
	public boolean  getFlag() {
		return flag;
	}


	public void setFlag(Boolean flag) {
		this.flag = flag;
	}


	

	public Resource() {
		// TODO 自动生成的构造函数存根
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
