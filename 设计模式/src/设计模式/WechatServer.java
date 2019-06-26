package 设计模式;

import java.util.ArrayList;
import java.util.List;

/*
 * 抽象的被观察者
 */

public class WechatServer implements Obserable{
	
	private List<Observe> list;//面对接口编程
	private String message;

	public WechatServer() {
		
		list = new ArrayList<>();
	}
	
	
	@Override
	public void registerObserver(Observe o) {
		
		list.add(o);
		
	}
	@Override
	public void removeObserver(Observe o) {
		
		if (!list.isEmpty()) {
			
			list.remove(o);
		}
		
	}
	@Override
	public void notifyObserver() {
		
		for (Observe observe : list) {
			
			observe.update(message);
		}
		
	}
	
	
	//发布信息
	
	public void setInformation(String s){
		
		this.message = s;
		System.out.println("微信服务更新："+ s);
		notifyObserver();
	}
	
	

}
