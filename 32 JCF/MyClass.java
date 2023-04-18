package jcf;

public class MyClass {
	String str;
	int num;
	
	public MyClass() {}
	public MyClass(String str, int num) {
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
		return "MyClass [str=" + str + ", num=" + num + "]";
	}

}
