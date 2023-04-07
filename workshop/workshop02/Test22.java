package workshop02_정민경;

public class Test22 {

	public static void main(String[] args) {
		char[] arr = {'A', 'B', 'C', 'D', 'E'};
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}

	}

}
