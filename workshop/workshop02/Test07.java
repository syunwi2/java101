package workshop02_정민경;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		int n, sum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("한 자리 정수값을 입력하시오");
		n = scan.nextInt();
		
		for(int i = 1; n * i <= 100; i++) {
			System.out.printf("%d", n * i);
			sum += n * i;
			if (n * i < 100) {
				System.out.print("+");
			}
		}
		System.out.printf(" = %d", sum);
	}

}
