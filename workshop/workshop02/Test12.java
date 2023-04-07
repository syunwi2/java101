package workshop02_정민경;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		int n, d = 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("양의 정수값의 자릿수 구하기");
		do {
			System.out.print("정수값 : ");
			n = scan.nextInt();
		} while (n < 0);

		while ( n / 10 > 0 ) {
			d++;
			n/=10;
		}
		
		System.out.printf("그 수는 %d자리입니다.", d);
	}

}
