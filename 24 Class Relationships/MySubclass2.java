package classRelationships;

public class MySubclass2 extends MyClass1 {
	String substr;
	
	public MySubclass2() {}
	public MySubclass2(String str, int num, String substr) {
		super(str, num);
		this.substr = substr;
	}
	
	public String getSubstr() {
		return substr;
	}
	public void setSubstr(String substr) {
		this.substr = substr;
	}
	
	public void func() {
		System.out.printf("str: %s\n", str);
		System.out.printf("substr: %s\n", substr);
	}
	
	@Override
	public void getInfo() {
		System.out.println(this.str + " " + this.num + " " + this.substr);
	}
	
	@Override
	public String toString() {
		return "MySubclass2 [substr=" + substr + ", str=" + str + ", num=" + num + "]";
	}
	
	
}
