package 设计模式;
/*
 * 抽象主题 ---被观察者
 */

public interface Obserable {

	public void registerObserver(Observe o);
	public void removeObserver(Observe o);
	public void notifyObserver();
	
	
}
