package p02;

public class TypeCast {

	public static void main(String[] args) {
		// 1. Promotion
		// 1-1. Numeric Data
		byte n1 = 10;
		short n2 = n1;  // short <- byte
		int n3 = n2;	// int <- short
		long n4 = n3;	// long <- int
		
		float f1 = n3;	// float <- int
		double f2 = f1;	// double <- float
		
		// 1-2. Character to Numeric Data
		int x = 'A';
		int y = 'a';
		
		System.out.println(y - x);
		
		// 1-3. result of operation which becomes int
		short t1 = 10;
		short t2 = 20;
		// short t3 = t1 + t2; // error;
		
		// 1-4. result of operation with different types
		int a1 = 10;
		float a2 = 20;
		// int a3 = a1 + a2;	// error;
		
		// 1-5. result of operation with string and +
		String k1 = 1 + 2 + 3 + "hello";
		String k2 = "hello" + 1 + 2 + 3;
		System.out.println(k1);
		System.out.println(k2);
		
		// 2. Type Casting
		float f = (float)1.1;
		
		short c1 = 10;
		short c2 = 20;
		short c3 = (short)(c1 + c2);
		
	}

}
