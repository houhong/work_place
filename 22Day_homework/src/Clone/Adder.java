package Clone;
/*
 * 地址完了
 */

public class Adder implements Cloneable{

	public String province;
	public String city;
	public String region;



	public Adder() {
		// TODO 自动生成的构造函数存根
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
		// TODO 自动生成的方法存根
		Object clone = super.clone();
		Adder adder =(Adder)clone;
		return adder;
	}


}
