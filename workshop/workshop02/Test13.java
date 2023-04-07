package workshop02_정민경;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);

		System.out.println("2자리의 정수를 입력하세요.");
		do {
			System.out.print("입력: ");
			n = scan.nextInt();
		} while(n < 10 || 100 <= n);
		
		System.out.printf("입력값은 %d", n);
	}

}
