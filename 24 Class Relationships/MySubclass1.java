package classRelationships;

public class MySubclass1 extends MyClass1 {
	int num;
	
	public MySubclass1() {}
	public MySubclass1(String str, int num, int subnum) {
		super(str, num);
		this.num = subnum;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public void func() {
		System.out.printf("super num: %d\n", super.num);
		System.out.printf("sub num: %d\n", this.num);
	}
	
	@Override
	public void getInfo() {
		System.out.println(super.num + " " + this.num + " " + this.str);
	}
	
	@Override
	public String toString() {
		return "MySubclass1 [super.num=" + super.num + ", this.num=" + this.num + ", str=" + str + "]";
	}
	
	
	
}
