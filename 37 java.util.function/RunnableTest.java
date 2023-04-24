package functionalInterface;

import java.lang.Runnable;

public class RunnableTest {

	public static void main(String[] args) {
		/*
		 * java.lang.Runnable
		 * 
		 * Runnable: void run()
		 */

		Runnable r1 = () -> System.out.println("Runnable.");
	
		r1.run();
	}

}
