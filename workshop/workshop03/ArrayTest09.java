package workshop03_정민경;

import java.util.Random;

public class ArrayTest09 {

	public static void main(String[] args) {
		int[] arr3 = new int[5];
		int sum = 0;
		Random r = new Random();

		for(int i = 0; i < 5; i++) {
			arr3[i] = r.nextInt(9) + 1;
			sum += arr3[i];
			System.out.printf("%d ", arr3[i]);
		}
		
		System.out.println();
		System.out.printf("sum=%d\navg=%.1f", sum, (float)sum / 5);
	}

}
