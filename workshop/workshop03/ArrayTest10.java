package workshop03_정민경;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest10 {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("다시 입력하세요.");
			return;
		}
		
		
		int n1 = Integer.parseInt(args[0]);
		if (n1 < 1 || 5 < n1) {
			System.out.println("숫자를 확인하세요.");
			return;
		}
		
		int n2 = Integer.parseInt(args[1]);
		if (n2 < 1 || 5 < n2) {
			System.out.println("숫자를 확인하세요.");
			return;
		}
		
		int[][] arr = new int[n1][n2];
		int sum = 0;
		Random r = new Random();

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = r.nextInt(4) + 1;
				sum += arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.printf("sum=%d\navg=%.1f", sum, (float)sum / 5);

	}

}
