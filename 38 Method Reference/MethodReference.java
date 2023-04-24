package functionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

class Calculator {
	public static int methodA(int x, int y) {
		return x + y;
	}
	
	public int methodB(int x, int y) {
		return x + y;
	}
	
	public String methodC() {
		return this.toString();
	}
}

public class MethodReference {

	public static void main(String[] args) {
		// ClassName::MethodName -> referring to a static method
		BinaryOperator<Integer> k = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return Calculator.methodA(t, u);
			}
		};
		BinaryOperator<Integer> k2 = (t, u) -> Calculator.methodA(t, u);
		BinaryOperator<Integer> k3 = Calculator::methodA;
		
		System.out.println(k.apply(10, 20));
		System.out.println(k2.apply(10, 20));
		System.out.println(k3.apply(10, 20));
		
		Function<String, Integer> z1 = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				return Integer.parseInt(t);
			}
		};
		Function<String, Integer> z2 = t -> Integer.parseInt(t);
		Function<String, Integer> z3 = Integer::parseInt; 
		
		System.out.println(z1.apply("10"));
		System.out.println(z2.apply("10"));
		System.out.println(z3.apply("10"));
		
		// ReferenceVariable::MethodName ->  referring to an instance method of an existing object
		Calculator cal = new Calculator();
		BinaryOperator<Integer> i1 = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return cal.methodB(t, u);
			}
		};
		BinaryOperator<Integer> i2 = (t, u) -> cal.methodB(t, u);
		BinaryOperator<Integer> i3 = cal::methodB;
		
		// ClassName::MethodName -> reference to instance method of non-existing object
		// referring to an instance method by passing reference variables as an argument
		Function<Calculator, String> j1 = new Function<Calculator, String>() {
			@Override
			public String apply(Calculator cal) {
				return cal.methodC();
			}
		};
		Function<Calculator, String> j2 = t -> t.methodC();
		Function<Calculator, String> j3 = Calculator::methodC;

		// ClassName::new -> Constructor References
		Supplier i = Calculator::new;
	}

}
