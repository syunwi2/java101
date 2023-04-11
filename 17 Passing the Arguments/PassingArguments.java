class myClass2 {
	String str;
	int num;
	
	public myClass2() { this("", 0); }
	public myClass2(String str) { this(str, 0); }
	public myClass2(int num) { this("", num); }
	public myClass2(String str, int num) {
		this.str = str;
		this.num = num;
	}
	
	public void CallByValue(int i) {
		i = 100;
	}
	
	public void CallByValueReference(Cat cat) {
		cat = new Cat("Star", 1, "f");
	}
}
public class PassingArguments {

	public static void main(String[] args) {
		myClass2 obj = new myClass2();
		
		int n = 10;
		System.out.println("Before Call By Value : " + n);
		obj.CallByValue(n);
		System.out.println(" After Call By Value : " + n);
		
		Cat momo = new Cat("momo", 3, "m");
		System.out.println("Before Call By Value Reference : " + momo.name);
		obj.CallByValueReference(momo);
		System.out.println(" After Call By Value Reference : " + momo.name);
	}

}
