package workshop03_정민경;

public class ArrayTest01 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
		int sum = 0;
		for(int x:arr) {
			sum += x;
		}
		
		System.out.printf("sum=%d\navg=%d", sum, sum / arr.length);

	}

}
