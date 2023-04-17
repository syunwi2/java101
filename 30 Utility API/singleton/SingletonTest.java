package singleton;

class Earth {
	private static Earth e;
	
	public static Earth getInstance() {
		if(e == null) {
			e = new Earth();
		}
		return e;
	}
	
	private Earth() {}
}

public class SingletonTest {

	public static void main(String[] args) {
		Earth e1 = Earth.getInstance();
		Earth e2 = Earth.getInstance();
		
		System.out.println(e1 == e2);
		System.out.println(e1);
		System.out.println(e2);
	}

}
