package nestedClass;

import java.util.Collection;

public interface MyInterface {
	// 1. constant
	// int NUM; <- Error
	int NUM = 10;     // == public static final int NUM = 10;
	
	// 2. abstract method
	public abstract void a();
	public void a2(); // == public abstract void a2();
	void a3();        // == public abstract void a3();
	
	// 3. default method
	// public default int c(); <- Error
	public default int c() {
		return NUM;
	}
	
	// 4. static method
	// public static void getInfo(); <- Error
	public static void getInfo() {
		System.out.println(Collection.class);
	}
	
}
