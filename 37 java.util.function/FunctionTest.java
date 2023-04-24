package functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class FunctionTest {

	public static void main(String[] args) {
		/*
		 * java.util.function.Function
		 * 
		 * Function<T, R>: R apply(T t)
		 * IntFunction<R>: R apply(int t)
		 * LongFunction<R>: R apply(long t)
		 * DoubleFunction<R>: R apply(double t)
		 * 
		 * ToIntFunction<T>: int apply(T t)
		 * ToLongFunction<T>: long apply(T t)
		 * ToDoubleFunction<T>: double apply(T t)
		 * 
		 * LongToIntFunction<T, R>: int apply(long t)
		 * DoubleToIntFunction<T>: int apply(double t)
		 * IntToLongFunction<T>: long apply(int t)
		 * DoubleToLongFunction<T>: long apply(double t)
		 * IntToDoubleFunction<T>: double apply(int t)
		 * LongToDoubleFunction<T>: double apply(long t)
		 * 
		 * BiFunction<T, U, R>: R apply(T t, U u)
		 * 
		 * ToIntBiFunction<T, U>: int apply(T t, U u)
		 * ToLongBiFunction<T, U>: long apply(T t, U u)
		 * ToDoubleBiFunction<T, U>: double apply(T t, U u)
		 */

		Function<String, List> f1 = new Function<String, List>() {
			@Override
			public List apply(String t) {
				return Arrays.asList(t);
			}
		};
		
		System.out.println(f1.apply("hello world"));
	}

}
