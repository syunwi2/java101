package workshop03_정민경;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("키의 최대값을 구합니다.");
		
		System.out.print("사람 수: ");
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.printf("사람 %d: ", i + 1);
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.printf("최대값은 %d입니다.", arr[num - 1]);
	}

}
