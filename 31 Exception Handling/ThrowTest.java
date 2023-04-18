package exception;

import java.util.Random;

class MyRandom {
	public void getRandom() throws MyException {
		Random r = new Random();
		int n = r.nextInt(3);
		if (n == 0) {
			throw new MyException("random number can't be 0.");
		}
		else {
			System.out.println("random number : " + n);
		}
	}
}

public class ThrowTest {

	public static void main(String[] args) {
		System.out.println("start.");
		System.out.println();
		
		MyRandom r = new MyRandom();
		
		try {
			r.getRandom();
		}
		catch (MyException e) {
			System.out.println("Error : " + e.getMessage());
		}
		finally {
			System.out.println();
		}
		
		System.out.println("end.");

	}

}
