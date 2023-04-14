package abstractClass;

public class Main {

	public static void main(String[] args) {
		// MyAbstractClass a1 = new MyAbstractClass(); <- Error
		MyAbstractClass a1 = new MyConcreateClass("upcasting", 1);
		MyConcreateClass c1 = new MyConcreateClass("general", 0);
		
		System.out.println(c1.getInfo());
		c1.printInfo();
		System.out.println(a1.getInfo());
		a1.printInfo();
		
		MyConcreateClass c2 = (MyConcreateClass)a1;
		System.out.println(c2.getInfo());
		c2.printInfo();
		
		MyAbstractClass arr[] = {
				new MyConcreateClass("upcasting", 2),
				new MyConcreateClass("upcasting", 3)
		};
		
		
	}

}
