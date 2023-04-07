package exam01;

public class BreakAndContinue {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("End.");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("A" + i);
			System.out.println("B" + i);
			if (i == 3) {
				continue;
			}
			System.out.println("C" + i);
		}
		System.out.println("End.");
		
	} // End of main()

}
