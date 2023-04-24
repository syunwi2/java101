package instanceMethod;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class StringMethod {

	public static void main(String[] args) {
		UnaryOperator<String> s1 = new UnaryOperator<String>() {

			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
		};
		UnaryOperator<String> s2 = t -> t.toUpperCase();
		UnaryOperator<String> s3 = String::toUpperCase;
		System.out.println(s3.apply("my"));

		Consumer<String> c1 = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		Consumer<String> c2 = t -> System.out.println(t);
		Consumer<String> c3 = System.out::println;
		
		c3.accept("my");
	}

}
