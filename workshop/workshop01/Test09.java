import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2;

		System.out.println("1.정수 입력하세요.");
		n1 = scan.nextInt();
		System.out.println("2.정수 입력하세요.");
		n2 = scan.nextInt();
		System.out.printf("정수 %d 과 정수 %d 중에서 최대값: %d", n1, n2, n1 > n2? n1: n2);
	}

}
