class myClass {
	int i;
	
	public myClass() {
		this(0);
	}
	
	public myClass(int n) {
		this.i = n;
	}
	
	public void method() {
		this.method(0);
	}
	public void method(int i) {
		this.i = i;
		System.out.println(this.i);
	}
	public void method(int i, int j) {
		this.i = i * j;
		System.out.println(this.i);
	}
	
}

public class MethodOverLoading {

	public static void main(String[] args) {
		myClass obj = new myClass();
		obj.method();
		obj.method(1);
		obj.method(1, 2);

	}

}
