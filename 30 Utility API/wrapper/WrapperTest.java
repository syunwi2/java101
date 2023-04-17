package wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		int n1 = Integer.parseInt("10");
		System.out.println(n1 * 10);
		
		System.out.println(Integer.max(10, 20));
		System.out.println(Integer.min(10, 20));
		System.out.println(Integer.sum(10, 20));
		
		Integer i1 = new Integer(10);
		System.out.println(i1.intValue());
		
		// Auto Boxing
		Integer i2 = 10;
		Object[] arr = {
			10,
			new Float(10.0)
		};
		
		// Auto Unboxing
		int n2 = i2;
		
		
	}

}
