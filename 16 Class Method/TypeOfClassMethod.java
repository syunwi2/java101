
public class TypeOfClassMethod {
	String name;
	int age;
	String sex;

	public TypeOfClassMethod(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	// 1. no parameters, no return value.
	public void method1() {
		
	}
	// 2. with parameters, no return value.
	public void method2(int var) {
		System.out.println(this.age + var);
	}
	// 3. no parameters, with return value.
	public int method3() {
		return this.age;
	}
	// 4. with parameters, with return value.
	public int method4(int var) {
		return this.age + var;
	}
}
