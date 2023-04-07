package workshop02_정민경;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);

		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		System.out.print("몇 단 삼각형입니까? : ");
		n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			int j = 1 + 2 * i;
			int k = n - (i + 1);
			for(; k > 0; k--) {
				System.out.print(" ");
			}
			for(; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
