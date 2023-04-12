package student;

public class TestStudent {

	public static void main(String[] args) {
		Student Kim = new Student("Kim", 100, 90, 95, 89);
		Student Lee = new Student("Lee", 60, 70, 99, 98);
		Student Park = new Student("Park", 68, 86, 60, 40);

		System.out.printf("%s 평균: %.2f 학점: %s학점\n", Kim.getName(), Kim.getAvg(), Kim.getGrade());
		System.out.printf("%s 평균: %.2f 학점: %s학점\n", Lee.getName(), Lee.getAvg(), Lee.getGrade());
		System.out.printf("%s 평균: %.2f 학점: %s학점\n", Park.getName(), Park.getAvg(), Park.getGrade());
	}

}
