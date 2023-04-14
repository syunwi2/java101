package FunctionalInterface;

public class Main {

	public static void main(String[] args) {
		MyFunctionalInterface1 obj = new MyFunctionalInterface1() {
			@Override
			public void func() {
				System.out.println("func() is overrrided.");
			}
		};
		obj.defaultFunc();
		obj.func();
		System.out.println();
		
		// Lambda Expression, Arrow Expreesion
		// 1. No parameters, No return Value
		MyFunctionalInterface1 noParaNoReturn = () -> {
			System.out.println("func() is overrrided.");
		};
		noParaNoReturn.defaultFunc();
		noParaNoReturn.func();
		System.out.println();
		
	    noParaNoReturn = () -> System.out.println("func() is overrrided.");
		noParaNoReturn.defaultFunc();
		noParaNoReturn.func();
		System.out.println();
		
		// 2. With paraameters, No return Value
		MyFunctionalInterface2 withParamNoRetrun = (int num) -> {
			System.out.println(num + " func() is overrrided.");
		};
		withParamNoRetrun.defaultFunc();
		withParamNoRetrun.func(0);
		System.out.println();
		
		withParamNoRetrun = (num) -> System.out.println(num + " func() is overrrided.");
		withParamNoRetrun.defaultFunc();
		withParamNoRetrun.func(1);
		System.out.println();
		
		withParamNoRetrun = num -> System.out.println(num + " func() is overrrided.");
		withParamNoRetrun.defaultFunc();
		withParamNoRetrun.func(2);
		System.out.println();
		
		// 3. No parameters, With return Value
		MyFunctionalInterface3 noParamWithReturn = () -> {
			return 3;
		};
		noParamWithReturn.defaultFunc();
		System.out.println(noParamWithReturn.func() + " func() is overrrided.");
		
		noParamWithReturn = () -> 4;
		noParamWithReturn.defaultFunc();
		System.out.println(noParamWithReturn.func() + " func() is overrrided.");
		
		// 4. With parameters, With return Value
		MyFunctionalInterface4 withParamWithReturn = (int num) -> {
			return num;
		};
		withParamWithReturn.defaultFunc();
		System.out.println(withParamWithReturn.func(5) + " func() is overrrided.");
		System.out.println();
		
		withParamWithReturn = (num) -> {
			return num;
		};
		withParamWithReturn.defaultFunc();
		System.out.println(withParamWithReturn.func(6) + " func() is overrrided.");
		System.out.println();
		
		withParamWithReturn = num -> {
			return num;
		};
		withParamWithReturn.defaultFunc();
		System.out.println(withParamWithReturn.func(7) + " func() is overrrided.");
		System.out.println();
		
		withParamWithReturn = num -> num;
		withParamWithReturn.defaultFunc();
		System.out.println(withParamWithReturn.func(8) + " func() is overrrided.");
		System.out.println();
	}

}
