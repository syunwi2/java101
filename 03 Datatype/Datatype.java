
public class Datatype {

	public static void main(String[] args) {
		// PDT
		System.out.println("1. numeric type");
		
		byte b = 7;
		int i = 7;
		short s = 7;
		long l = 7;
		
		System.out.println("1-1. integer number type");
		System.out.printf("\tbyte: %d\n", b);
		System.out.printf("\tintger: %d\n", i);
		System.out.printf("\tshort: %d\n", s);
		System.out.printf("\tlong: %d\n", l);
		
		System.out.println(10);											// decimal
		System.out.println(0b0);										// binary
		System.out.println(0b1);
		System.out.println(01);											// octal
		System.out.println(07);
		System.out.println(0x0);										// hexadecimal
		
		System.out.println("1-2. whole number type");
		
		float f = 3.14f;
		double d = 3.14;
		
		System.out.printf("\tfloat : %f\n", f);
		System.out.printf("\tdouble : %f\n", d);
		
		System.out.println(3.14f);										// float
		System.out.println(3.14F);
		System.out.println(3.14);										// double
		System.out.println(3.14d);
		System.out.println(3.14D);
		System.out.println(3.14e10);
		
		System.out.println("2. character type");
		
		char c = '\"';
		
		System.out.printf("\tcharacter: %c\n", c);
		
		System.out.println('A');
		System.out.println("C:\\");										// escape character
		System.out.println("\uC815\uBBFC\uACBD\uC0AC\uB791\uD574");	// unicode
		
		System.out.println("3. boolean type");
		
		boolean t = true;
		
		System.out.printf("\tboolena: %b\n", t);
		
		System.out.println(1 == 0);
		
		// RDT
		System.out.println("1. class");
		System.out.println(new String("Hello World"));			// new <- malloc
		System.out.println("2. array");
		System.out.println(new int[] {1, 2, 3});
		System.out.println("3. interface");
		System.out.println("TBA");
	}

}
