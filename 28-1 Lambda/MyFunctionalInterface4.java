package FunctionalInterface;

public interface MyFunctionalInterface4 {
	int func(int num);
	// void func1();    <- Error
	
	public default void defaultFunc() {
		System.out.println("defaultFunc() is called.");
	}
	
	public static void staticFunc() {
		System.out.println("staticFunc() is called.");
	}
}
