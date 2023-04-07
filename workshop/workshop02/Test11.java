package workshop02_정민경;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		int a, b;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a의 값 : ");
		a = scan.nextInt();
		b = a;
		
		do {
			if (b < a) {
				System.out.println("a보다 큰 값을 입력하세요!");
			}
			System.out.print("b의 값 : ");
			b = scan.nextInt();
		} while(b < a);
		
		System.out.printf("b - a는 %d입니다.", b - a);
	}

}
