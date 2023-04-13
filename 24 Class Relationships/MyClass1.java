package classRelationships;

public class MyClass1 {
	String str;
	int num;
	
	public MyClass1() {}
	public MyClass1(String str, int num) {
		this.str = str;
		this.num = num;
	}
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	protected void getInfo() {
		System.out.println(str + " " + num);
	}
	@Override
	public String toString() {
		return "MyClass1 [str=" + str + ", num=" + num + "]";
	}
	

}
