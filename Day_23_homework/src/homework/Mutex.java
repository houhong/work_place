package homework;

public class Mutex {
 
    public boolean flag;//true��ʾִ��B  false ��ʾִ��A
	public Mutex(boolean flag) {
		
		this.flag =flag;// TODO �Զ����ɵĹ��캯�����
	}
	
	public Mutex() {
		// TODO �Զ����ɵĹ��캯�����
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
