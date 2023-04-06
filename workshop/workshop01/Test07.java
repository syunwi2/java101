import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		String name;
		int age;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.이름을 입력하세요.");
		name = scan.next();
		System.out.println("2.나이를 입력하세요.");
		age = scan.nextInt();
		System.out.printf("이름은 %s, 나이는 %d 입니다.", name, age);
	}

}
