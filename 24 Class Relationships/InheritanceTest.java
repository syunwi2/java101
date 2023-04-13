package classRelationships;

public class InheritanceTest {

	public static void main(String[] args) {
		MyClass1 sup1 = new MyClass1("super class", 0);
		MySubclass1 sub1 = new MySubclass1("subclass", 1, 2);
		MySubclass2 sub2 = new MySubclass2("subclass", 3, " 4");

		
		// Inheritance
		System.out.println("Inheritance -----");
		sub1.func();
		sub2.func();
		System.out.println();
		
		
		// Overriding
		System.out.println("Overriding -----");
		sup1.getInfo();
		sub2.getInfo();
		System.out.println();
		
		
		// Downcasting;
		System.out.println("Downcasting -----");
		MyClass1 sup2 = new MySubclass1("subclass", 5, 6);
		MySubclass1 sub3 = (MySubclass1)sup2;
		
		// using field of superclass
		System.out.println(sup2.num);
		
		// using field of subclass
		System.out.println(sub3.num);
		System.out.println();
		
		
		// Upcasting
		System.out.println("Upcasting -----");
		MyClass1 sup3 = new MySubclass1("subclass", 7, 8);
		sup3.getInfo();
		System.out.println();
		
		MyClass1 arr[] = {
				new MySubclass1("subclass", 9, 10),
				new MySubclass2("subclass", 11, "12")
		};
		
		for (MyClass1 x: arr) {
			// instanceof
			System.out.println("instanceof -----");
			System.out.printf("MyClass1 : %b\n", x instanceof MyClass1);
			System.out.printf("MySubclass1 : %b\n", x instanceof MySubclass1);
			System.out.printf("MySubclass2 : %b\n", x instanceof MySubclass2);
			
			System.out.println(x.toString());
			
			// Downcasting
			if (x instanceof MySubclass1) {
				System.out.println(Integer.toString(x.num) + " " + ((MySubclass1)x).num);
			}
			else {
				System.out.println(Integer.toString(x.num) + " " + ((MySubclass2)x).substr);
			}
			System.out.println();
		}

	}	

}