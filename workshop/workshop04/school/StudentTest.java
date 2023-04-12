package school;

public class StudentTest {

	public static void main(String[] args) {
		Student studentArray [] = new Student[3];
		
		studentArray[0] = new Student("홍길동", 15, 171, 81);
		studentArray[1] = new Student("한사람", 13, 183, 72);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		// 나이, 신장, 체중 누적 합 계산
		int sumAge = 0;
		int sumHeight = 0;
		int sumWeight = 0;
		System.out.printf("%10s %10s %10s %10s\n", "이름", "나이", "신장", "몸무게");
		for (Student x : studentArray) {
			sumAge += x.getAge();
			sumHeight += x.getHeight();
			sumWeight += x.getWeight();
			System.out.printf("%10s %10s %10s %10s\n", x.getName(), x.getAge(), x.getHeight(), x.getWeight());
		}

		System.out.println();
		System.out.printf("나이의 평균: %.2f\n", sumAge / 3.0);
		System.out.printf("신장의 평균: %.2f\n", sumHeight / 3.0);
		System.out.printf("몸무게의 평균: %.2f\n", sumWeight / 3.0);
	}

}
