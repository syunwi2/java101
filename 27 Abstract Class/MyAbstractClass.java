package abstractClass;

public abstract class MyAbstractClass {
	String str;
	int num;
	
	// constructor
	public MyAbstractClass() {}
	public MyAbstractClass(String str, int num) {
		this.str = str;
		this.num = num;
	}
	
	// getter, setter
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

	// general method
	public String getInfo() {
		return str + "." + num;
	}
	
	// abstract method
	public abstract void printInfo();
	
}
