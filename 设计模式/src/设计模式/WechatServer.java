package ���ģʽ;

import java.util.ArrayList;
import java.util.List;

/*
 * ����ı��۲���
 */

public class WechatServer implements Obserable{
	
	private List<Observe> list;//��Խӿڱ��
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
	
	
	//������Ϣ
	
	public void setInformation(String s){
		
		this.message = s;
		System.out.println("΢�ŷ�����£�"+ s);
		notifyObserver();
	}
	
	

}
