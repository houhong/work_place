package demo2;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class Output implements Runnable{

	public Resource re;
	public Output(Resource re) {
		this.re = re;
	}

	@Override
	public void run() {

		while(true){
			synchronized(re){

				if(re.flag == false){
					re.notify();
					re.setFlag(true);
				}

				System.out.println("������"+re.getWife()+"������"+re.getHushand()); 

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