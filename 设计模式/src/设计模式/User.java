package 设计模式;
/*
 * 具体的观察者 
 * --------
 * 此处定义为User
 * 
 */

public class User implements Observe{
	
	private String name;
	private String message;

	public User() {
		// TODO Auto-generated constructor stub
	}

	
	public User(String name) {
		this.name = name;
	}


	@Override
	public void update(String message) {
		
			this.message = message;	
			this.read();
	}
	
	public void read(){
		
		System.out.println(name+ "收到消息"+ message);
	}

	
}
