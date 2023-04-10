package workshop03_정민경;

public class ArrayTest03 {

	public static void main(String[] args) {
		int[][] arr2 = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};

		int sum = 0;
		for(int[] arr:arr2) {
			for(int x:arr) {
				sum += x;
			}
		}
		
		System.out.printf("total=%d\naverage=%.2f", sum, (float)sum / (arr2.length * arr2[0].length));
		
	}

}
