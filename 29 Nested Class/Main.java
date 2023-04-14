package nestedClass;

public class Main {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		
		// Call InnerClass
		// OuterClass.InnerClass inner = new OuterClass.InnerClass();
		OuterClass.InnerClass inner;
		inner = outer.getInner();
		inner = outer.new InnerClass();
		inner.func();
		
		System.out.println();
		
		
		// Call StaticInnerClass
		OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
		staticInner.func();
		
		// Anonymous Class
		MyInterface anon1 = new MyInterface() {
			@Override
			public void a3() {
				// TODO Auto-generated method stub
			}
			@Override
			public void a2() {
				// TODO Auto-generated method stub
			}
			@Override
			public void a() {
				// TODO Auto-generated method stub
			}
		};
		MyAbstractClass anon2 = new MyAbstractClass() {
			@Override
			public void printInfo() {
				// TODO Auto-generated method stub
			}
		};
		
	}

}
