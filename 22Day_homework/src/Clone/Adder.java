package Clone;
/*
 * ��ַ����
 */

public class Adder implements Cloneable{

	public String province;
	public String city;
	public String region;



	public Adder() {
		// TODO �Զ����ɵĹ��캯�����
	}



	public Adder(String province, String city, String region) {
		super();
		this.province = province;
		this.city = city;
		this.region = region;
	}



	public String getProvince() {
		return province;
	}



	public void setProvince(String province) {
		this.province = province;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getRegion() {
		return region;
	}



	public void setRegion(String region) {
		this.region = region;
	}



	@Override
	public String toString() {
		return "Adder [province=" + province + ", city=" + city + ", region="
				+ region + ", getProvince()=" + getProvince() + ", getCity()="
				+ getCity() + ", getRegion()=" + getRegion() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO �Զ����ɵķ������
		Object clone = super.clone();
		Adder adder =(Adder)clone;
		return adder;
	}


}
