package myPackage;
public class MyClass {
	static {
		System.out.println("MyClass: static block");
	}
	
	{
		System.out.println("MyClass: instance block");
	}
	
	static int cnt;

	public String name;
	protected String status;
	String address;
	private int age;
	
	// constructor
	public MyClass() {}
	public MyClass(String name, String status, String address, int age) {
		this.name = name;
		this.status = status;
		this.address = address;
		this.age = age;
		cnt++;
	}
	
	// getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (ageCheck(age)) {
			this.age = age;
		}
		else {
			System.out.println("setAge() : input value out of bound");
		}
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// value checker
	private boolean ageCheck(int age) {
		boolean result = false;
		if (0 <= age && age <= 20) {
			result = true;
		}
		return result;
	}
	
	// static method
	public static void out() {
		System.out.println(cnt);
	}
	
}
