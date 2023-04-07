package workshop02_정민경;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		int n, sum = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("1부터 n까지의 총합 구하기");
		do {
			System.out.print("n 값: ");
			n = scan.nextInt();
		} while(n <= 0);
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.printf("1부터 %d 까지의 총합: %d", n, sum);
	}

}
