package workshop02_정민경;

public class Test08 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.printf("%d foo\n", i);
			}
			else if (i % 5 == 0) {
				System.out.printf("%d bar\n", i);
			}
			else if (i % 7 == 0) {
				System.out.printf("%d baz\n", i);
			}
			else {
				System.out.printf("%d\n", i);
			}
		}

	}

}
