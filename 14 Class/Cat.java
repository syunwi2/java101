/*
 * 애완 동물 관리 프로그램 개발
 * 1. 분석 단계에서 추출한 객체
 * 		고양이 객체
 * 		속성: 이름, 나이, 성별
 * 		동작: 먹기, 자기, 뛰기
 * 
 * 2. 설계 단계에서 표현은 클래스 이용(main 메서드가 없다.)
 * 		Cat 클래스 ===============
 * 			변수:
 * 			String name;
 * 			int age;
 * 			String sex;
 * 			메서드:
 * 			먹기
 * 			자기
 * 			뛰기
 */

public class Cat {
	// 인스턴스 변수
	String name;
	int age;
	String sex;

	// 생성자
	public Cat() {
	}

	public Cat(int age) {
		this.age = age;
		// this.name = NULL;
		// this.sex = NULL;
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Cat(int age, String sex) {
		this("", age, sex);
	}
	
	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
}
