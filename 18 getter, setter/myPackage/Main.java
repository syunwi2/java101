package myPackage;

import static java.lang.Integer.parseInt;

public class Main {
	static {
		System.out.println("Main: static block");
	}

	public static void main(String[] args) {
		int num = parseInt("3");
		MyClass obj1 = new MyClass("anon", "hungry", "city", num);
		MyClass obj2 = new MyClass("nona", "tired", "city", 0);
		System.out.println(MyClass.cnt);
		MyChildClass.out();

		//System.out.println(obj1.age + obj1.name);
		// obj1.age = 3;
		//obj1.name = "lunch";
		//System.out.println(obj1.age + obj1.name);
		
		System.out.println(obj2.getAge() + obj2.getName());
		obj2.setAge(4);
		obj2.setName("poke");
		System.out.println(obj2.getAge() + obj2.getName());
		
	}

}
