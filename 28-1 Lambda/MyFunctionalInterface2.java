package FunctionalInterface;

public interface MyFunctionalInterface2 {
	void func(int num);
	// void func1();    <- Error
	
	public default void defaultFunc() {
		System.out.println("defaultFunc() is called.");
	}
	
	public static void staticFunc() {
		System.out.println("staticFunc() is called.");
	}
}
