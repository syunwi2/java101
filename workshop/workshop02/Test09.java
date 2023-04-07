package workshop02_정민경;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		int a, b, c, max;
		Scanner scan = new Scanner(System.in);

		System.out.println("세 정수의 최대값 구하기");
		System.out.print("a 값: ");
		a = scan.nextInt();
		max = a;
		
		System.out.print("b 값: ");
		b = scan.nextInt();
		if (max < b) {
			max = b;
		}
		
		System.out.print("c 값: ");
		c = scan.nextInt();
		if (max < c) {
			max = c;
		}
		
		System.out.println("최대값: " + max);
	}

}
