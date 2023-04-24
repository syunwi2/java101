package functionalInterface;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		/*
		 * java.util.function.Predicate
		 * 
		 * Predicate<T>: boolean test(T t)
		 * 
		 * IntPredicate<T>: boolean test(int t)
		 * LongPredicate<T>: boolean test(long t)
		 * DoublePredicate<T>: boolean test(double t)
		 * 
		 * BiPredicate<T, U>: boolean test(T t, U u)
		 */

		Predicate<Integer> isOdd = (t) -> t % 2 == 0? false: true;
		
		System.out.println(isOdd.test(1));
	}

}
