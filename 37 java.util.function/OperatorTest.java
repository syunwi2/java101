package functionalInterface;

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperatorTest {

	public static void main(String[] args) {
		/*
		 * java.util.function.UnaryOperator extends Function<T,T>
		 * 
		 * UnaryOperator<T>: T apply(T t)
		 * 
		 * IntUnaryOperator: int applyAsInt(int t)
		 * LongUnaryOperator: long applyAsLong(long t)
		 * DoubleUnaryOperator: double applyAsDouble(double t)
		 * 
		 * java.util.function.BinaryOperator extends BiFunction<T,T,T>
		 * 
		 * BinaryOperator<T>: T apply(T t, T u)
		 * 
		 * IntBinaryOperator: int applyAsInt(int t, int u)
		 * LongBinaryOperator: long applyAsLong(long t, long u)
		 * DoubleBinaryOperator: double applyAsDouble(double t, double u)
		 */

		UnaryOperator<String> u1 = new UnaryOperator<String>() {

			@Override
			public String apply(String t) {
				return "UnaryOperator: " + t;
			}
		};
		
		BinaryOperator<String> b1 = (t, u) -> "BinaryOperator: " + t + " " + u;
		
		System.out.println(u1.apply("hello"));
		System.out.println(b1.apply("hello", "world"));
		
		String str = new String();
		Function<String, Boolean> func = str::equals;
		
		System.out.println(func.apply(""));
	}

}
