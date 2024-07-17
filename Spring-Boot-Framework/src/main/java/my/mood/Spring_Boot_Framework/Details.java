package my.mood.Spring_Boot_Framework;

public class Details {

	protected int age;
	protected String name;
	protected String address;
	
	public Details(String name, int age, String address) {
		this.address = address;
		this.age = age;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Hii This is " + name + age + " year old " + " from " + address;
	}
	
}
