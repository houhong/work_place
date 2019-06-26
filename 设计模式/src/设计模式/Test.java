package 设计模式;
/*
 * 测试类
 */

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		//定义服务器
		WechatServer server = new WechatServer();
		
		//实列观察者
		Observe userZhangsan = new User("Zhangsan");
		Observe userLisi = new User("Lisi");
		Observe userWangwu = new User("Wangwu");
		
		/* --------------------------------------*/
		server.registerObserver(userWangwu);
		server.registerObserver(userLisi);
		server.registerObserver(userZhangsan);
		
		/* --------------------------------------*/
		
		server.setInformation("php是世界上最好的语言！！！！");
		
		System.out.println("--------------------------");
		
		server.removeObserver(userZhangsan);
		server.setInformation("JAVA是世界上最好的语言");
			
		
	}
	
	
}
