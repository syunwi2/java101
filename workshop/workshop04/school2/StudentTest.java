package school2;

import school2.Student;

public class StudentTest {

	public static void main(String[] args) {
		// 최대 및 최소 계산에 사용되는 비교 객체
		Student tmpMax = new Student("", 0, 0, 0);
		Student tmpMin = new Student("", 99, 999, 999);
		
		Student studentArray [] = new Student[3];
		
		studentArray[0] = new Student("홍길동", 15, 171, 81);
		studentArray[1] = new Student("한사람", 13, 183, 72);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		System.out.printf("%5s %5s %5s %5s\n", "이름", "나이", "신장", "몸무게");
		for (Student x : studentArray) {
			System.out.println(x.studentInfo());
		}

		// 누적 합 계산에 사용되는 변수
		int age;
		int height;
		int weight;
		int sumAge = 0;
		int sumHeight = 0;
		int sumWeight = 0;
		// 최대, 최소 객체를 가리키는 변수
		// 초기값은 비교 객체
		Student maxAge = tmpMax;
		Student minAge = tmpMin;
		Student maxHeight = tmpMax;
		Student minHeight = tmpMin;
		Student maxWeight = tmpMax;
		Student minWeight = tmpMin;
		for (Student x : studentArray) {
			age = x.getAge();
			height = x.getHeight();
			weight = x.getWeight();
			
			// 누적 합 계산
			sumAge += age;
			sumHeight += height;
			sumWeight += weight;
			
			// 최대, 최소 객체 갱신
			if (maxAge.getAge() < age) { maxAge = x; }
			else if (minAge.getAge() > age) { minAge = x; }
			
			if (maxHeight.getHeight() < height) { maxHeight = x; }
			else if (minHeight.getHeight() > height) { minHeight = x; }
			
			if (maxWeight.getWeight() < weight) { maxWeight = x; }
			else if (minWeight.getWeight() > weight) { minWeight = x; }
		}

		System.out.println();
		System.out.printf("나이의 평균: %.3f\n", sumAge / 3.0);
		System.out.printf("신장의 평균: %.3f\n", sumHeight / 3.0);
		System.out.printf("몸무게의 평균: %.3f\n", sumWeight / 3.0);
		System.out.println();
		System.out.printf("나이가 가장 많은 학생: %s\n", maxAge.getName());
		System.out.printf("나이가 가장 적은 학생: %s\n", minAge.getName());
		System.out.printf("신장이 가장 큰 학생: %s\n", maxHeight.getName());
		System.out.printf("신장이 가장 작은 학생: %s\n", minHeight.getName());
		System.out.printf("몸무게가 가장 많이 나가는 학생: %s\n", maxWeight.getName());
		System.out.printf("몸무게가 가장 적게 나가는 학생: %s\n", minWeight.getName());
	}
	
}
