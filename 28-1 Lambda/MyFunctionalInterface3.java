package FunctionalInterface;

public interface MyFunctionalInterface3 {
	int func();
	// void func1();    <- Error
	
	public default void defaultFunc() {
		System.out.println("defaultFunc() is called.");
	}
	
	public static void staticFunc() {
		System.out.println("staticFunc() is called.");
	}
}

