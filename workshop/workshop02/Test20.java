package workshop02_정민경;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		int sal, bonus, workingTime;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("보너스 및 월급 구하기");
		System.out.print("근무시간입력 : ");
		workingTime = scan.nextInt();
		System.out.print("월급입력 : ");
		sal = scan.nextInt();
		
		if (25 <= workingTime) {
			bonus = sal;
		}
		else if (20 <= workingTime) {
			bonus = (int)(sal * 0.8);
		}
		else if (18 <= workingTime) {
			bonus = (int)(sal * 0.5);
		}
		else {
			bonus = 0;
		}
		
		System.out.println("====================");
		System.out.println("보너스 : " + bonus);
		System.out.println("지급될 급여 : " + (sal + bonus));
	}

}
