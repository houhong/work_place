package demo2;

public class Input implements Runnable{

	int i=0;
	public Resource re;
	public Input(Resource re) {
		this.re = re;
	}

	@Override
	public   void run() {
		// TODO 自动生成的方法存根

		while(true){
			//使输出线程等待
			synchronized(re){
				
				if(re.flag ==true){
					re.notify();
					re.setFlag(false);
				}
				if(i%2==0){
					re.setHushand("key");
					re.setWife("value");

				}else{
					re.setHushand("老牛");
					re.setWife("骚杨");	
					//是输出线程唤醒
				}
				
				i++;
				
				try {
					re.wait();
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}


			}

		}



	}

}
