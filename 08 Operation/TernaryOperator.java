package p03;

public class TernaryOperator {

	public static void main(String[] args) {
		int n = 10;
		int result = (n > 20)? 100: 200;
		System.out.println(result);

		int n2 = 30;
		System.out.println((n2 > 10)? ((n2 > 20)? 300: 200): 100);
	}

}
