package workshop03_정민경;

import java.util.Arrays;

public class ArrayTest08 {

	public static void main(String[] args) {
		int [] score= {99,34,67,22,11,9};
		
		Arrays.sort(score);
		
		System.out.printf("최대값:%d\n최소값:%d", score[score.length - 1], score[0]);

	}

}
