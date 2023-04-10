package workshop03_정민경;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("키의 최대값을 구합니다.");
		
		System.out.print("사람 수: ");
		int num = scan.nextInt();
		
		Random r = new Random();
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = r.nextInt(100) + 100;
			System.out.printf("사람 %d: %d\n", i + 1, arr[i]);	
		}
		
		Arrays.sort(arr);
		
		System.out.printf("최대값은 %d입니다.", arr[num - 1]);
	}

}
