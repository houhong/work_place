package ���ģʽ;
/*
 * �������� ---���۲���
 */

public interface Obserable {

	public void registerObserver(Observe o);
	public void removeObserver(Observe o);
	public void notifyObserver();
	
	
}
