package literal;

import java.math.*;

public class BigDecimalTest {

	public static void main(String[] args) {
		double d1 = 0.1;
		double d2 = 0.2;
		
		System.out.println(d1 + d2);
		System.out.println(1 / 0.3);
		System.out.println();
	
		BigDecimal b1 = new BigDecimal("0.1");
		BigDecimal b2 = new BigDecimal("0.2");
		
		System.out.println(b1.add(b2));
		System.out.println(b1.subtract(b2));
		System.out.println(b1.multiply(b2));
		System.out.println(b1.divide(b2));
	}

}
