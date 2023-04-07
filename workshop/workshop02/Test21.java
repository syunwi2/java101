package workshop02_정민경;

public class Test21 {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			System.out.printf("%2d ", i);
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
