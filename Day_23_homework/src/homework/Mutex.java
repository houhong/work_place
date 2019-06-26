package homework;

public class Mutex {
 
    public boolean flag;//true表示执行B  false 表示执行A
	public Mutex(boolean flag) {
		
		this.flag =flag;// TODO 自动生成的构造函数存根
	}
	
	public Mutex() {
		// TODO 自动生成的构造函数存根
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Mutex [flag=" + flag + ", isFlag()=" + isFlag()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
