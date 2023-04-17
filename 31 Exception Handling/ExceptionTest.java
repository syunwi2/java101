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
		} catch (ArithmeticException e) {
			// 1. getMessage()
			System.out.println("Error in "+ this.getClass() + " : "+ e.getMessage());
			// 2. printStackTrace()
			e.printStackTrace();
		// catch block, matching with Exception, is run.
		} catch (NullPointerException e) {
			System.out.println("Error in "+ this.getClass() + " : "+ e.getMessage());
			
		// If any catch block isn't match with Exception,
		// this block can handle that one.
		} catch (Exception e) {
			System.out.println("Error in "+ this.getClass() + " : "+ e.getMessage());
		} finally {
			System.out.println("try-catch block is done.");
			System.out.println();
		}
	}
	
}

class Test2 {
	public void b(int n) {
		if (n != 0) {
			int result = 10 / n;
			System.out.println("Result : " + result);
			System.out.println();
		}
		else {
			System.out.println("Can't divided by 0.");
			System.out.println();
		}
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
		
		System.out.println("end");
	}

}
