package interfaceAndClass;

public class Main {

	public static void main(String[] args) {
		// call static method of interface
		MyInterface.getInfo();
		System.out.println(MyInterface.NUM);
		
		// MyInterface i1 = new MyInterface(); <- Error
		MyInterfaceImpl impl1 = new MyInterfaceImpl();
		// MyInterfaceImpl.getInfo();
		System.out.println(MyInterfaceImpl.NUM);
		
		impl1.a();
		impl1.a2();
		impl1.a3();
		impl1.c();
		
		MyInterface arr[] = {
				new MyInterfaceImpl(),
				new MyInterfaceImpl()
		};
	}

}
