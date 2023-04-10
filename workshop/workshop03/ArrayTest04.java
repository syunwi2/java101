package workshop03_정민경;

public class ArrayTest04 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

		for(int i = arr.length; i > 0; i--) {
			System.out.printf("%d ", arr[i - 1]);
		}

	}

}
