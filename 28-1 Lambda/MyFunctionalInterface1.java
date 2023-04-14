package FunctionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface1 {
	void func();
	// void func1();    <- Error
	
	public default void defaultFunc() {
		System.out.println("defaultFunc() is called.");
	}
	
	public static void staticFunc() {
		System.out.println("staticFunc() is called.");
	}
}
