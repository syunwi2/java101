package functionalInterface;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		/*
		 * java.util.function.Supplier
		 * 
		 * Supplier<T t>: T get()
		 * 
		 * IntSupplier: int getAsInt()
		 * LongSupplier: long getAsLong()
		 * DoubleSupplier: double getAsDouble()
		 * BooleanSupplier: boolean getAsBoolean()
		 */

		Supplier<String> s1 = new Supplier<String>() {

			@Override
			public String get() {
				return "hello";
			}
		};
		
		IntSupplier s2 = () -> 2023;
		
		System.out.println(s1.get() + " " + s2.getAsInt());
	}
}
