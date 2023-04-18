package exception;

class Test {
	public void a() {
		this.b(new Integer(0));
	}
	
	// try-catch block
	public void b(Integer num) {
		try {
			int n = num;
			// int n = 0; -> ArithmeticException: / by zero
			int result = 10 / n;
			System.out.println("Result : " + result);
		}
		catch (ArithmeticException e) {
			// 1. getMessage()
			System.out.println("Error in "+ this.getClass() + " : "+ e.getMessage());
			// 2. printStackTrace()
			e.printStackTrace();
		}
		// catch block, matching with Exception, is run.
		catch (NullPointerException e) {
			System.out.println("Error in "+ this.getClass() + " : "+ e.getMessage());
		}
		// If any catch block isn't match with Exception,
		// this block can handle that one.
		catch (Exception e) {
			System.out.println("Error in "+ this.getClass() + " : "+ e.getMessage());
		}
		finally {
			System.out.println("try-catch block is done.");
			System.out.println();
		}
	}
	
}

class Test2 {
	public void b(int n) {
		// try - finally block
		try {
			if (n != 0) {
				int result = 10 / n;
				System.out.println("Result : " + result);
			}
			else {
				System.out.println("Can't divided by 0.");
			}
		}
		finally {
			System.out.println("Return to main().");
			System.out.println();
		}
	}
}

class Test3 {
	// throws Exception
	public void a(int num) throws NullPointerException, ArithmeticException {
		b(num);
	}
	
	public void b(int num) throws NullPointerException, ArithmeticException {
		System.out.println(10 / num);
		
		String name = null;
		System.out.println(name.length());
	}
}

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("start");

		Test t = new Test();
		t.a();
		t.b(null);
		
		Test2 t2 = new Test2();
		t2.b(0);
		t2.b(1);
		
		Test3 t3 = new Test3();
		try {
			t3.a(0);
		}
		catch (NullPointerException e) {
			System.out.println("Error : " + e.getMessage());
		}
		catch (ArithmeticException e) {
			System.out.println("Error : " + e.getMessage());
		}
		// Convention: last catch block has Exception as parameter 
		catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		finally {
			System.out.println("throws block is done.");
			System.out.println();
		}
		
		
		System.out.println("end");
	}

}