package exam01;

public class ArrayTest {

	public static void main(String[] args) {
		int[] n = new int[3];
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		
		for (int i = 0; i < n.length; i++) {
			n[i] = (i + 1) * 10;
		}
		
		for (int j:n) {
			System.out.println(j);
		}
	}

}
