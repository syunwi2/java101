package p04;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		int n = 10;
		if (n % 2 == 0)
			System.out.println(n);
		
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();      // 표준 입력 버퍼에서 숫자 반환
		String n2 = scan.next();     // ' '를 기준으로 표준 입력 버퍼에서 문자열 토큰 반환
		String n3 = scan.nextLine(); // '\n'를 기준으로 표준 입력 버퍼에서 문자열 토큰 반환
		
		System.out.println("n1 : " + n1 + "\nn2 : " + n2 + "\nn3 : " + n3);
	}

}
