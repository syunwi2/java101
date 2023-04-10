package workshop03_정민경;

public class ArrayTest02 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int sum = 0;
		
		for (int i = 1; i <= arr.length; i++) {
			if (i % 2 == 0) {
				sum += arr[i - 1];
			}
		}
		
		System.out.printf("sum=%d", sum);

	}

}
