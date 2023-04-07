package exam01;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		// 1. while statement
		int i = 0;
		while (i < 5) {
			System.out.println((i + 1) + ". Hello");
			i++;
		}
		// 2. do-while statement
		int j = 0;
		do {
			System.out.println((j + 1) + ". World");
			j++;
		} while (j < 5);
		// 3. infinite loop
		Scanner scan = new Scanner(System.in);
		String name;
		while (true) {
			System.out.println("Name (Enter Q to qiut) ? ");
			name = scan.next();
			if (name == "Q") {
				break;
			}
			System.out.printf("Name : %s\n", name);
		}
	}

}
