package interfaceAndClass;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public void a() {
		System.out.println(this.getClass() + "." + "a()");
	}

	@Override
	public void a2() {
		System.out.println(this.getClass() + "." + "a2()");
	}

	@Override
	public void a3() {
		System.out.println(this.getClass() + "." + "a3()");
	}
}
