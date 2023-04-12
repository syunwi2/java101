# 18 getter, setter

# 객체 지향 프로그래밍의 4가지 특징

1. 추상화
    
    객체 공통의 속성과 동작을 추출한다.
    
    - 클래스
2. 상속
    
    기존의 클래스를 활용해 새로운 클래스를 정의할 수 있다.
    
3. 다형성
    
    객체의 속성이나 기능이 상황에 따라 여러 형태로 변화할 수 있다.
    
    - 메서드 오버로딩
        
        하나의 함수가 파라미터에 따라 따르게 정의될 수 있다.
        
    - 메서드 오버라이딩
        
        상속받은 함수를 재정의할 수 있다.
        
4. 캡슐화
    
    객체의 속성과 동작을 하나로 묶어 관리해 외부로부터 보호한다.
    
    데이터 보호와 데이터 은닉이 목적이다.
    
    캡슐화를 통해 클래스 내부의 동작을 숨겨 은닉(데이터 은닉)하고, 이를 통해 내부 속성들과 동작을 보호(데이터 보호)할 수 있다.
    
    - 인스턴스 변수와 인스턴스 메서드
    - **접근 지정자**
    - **getter, setter 메서드**

## 접근 지정자

| 접근 지정자 | 접근 범위 | 동일 클래스 | 동일 패키지 | 타 패키지 자식 클래스 | 타 패키지 |
| --- | --- | --- | --- | --- | --- |
| public | 접근 제한 없음 | o | o | o | o |
| protected | 동일 패키지와 상속받은 클래스 | o | o | o |  |
| default | 동일 패키지 | o | o |  |  |
| private | 동일 클래스 | o |  |  |  |

# getter, setter

인스턴스 변수에 직접 접근하지 않고 그 값을 가져오거나 갱신한다.

```java
public class MyClass {

	private String name;
	private int age;
	
	// constructor
	public MyClass() {}
	public MyClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (ageCheck(age)) {
			this.age = age;
		}
		else {
			System.out.println("setAge() : input value out of bound");
		}
	}
	
	// value checker
	private boolean ageCheck(int age) {
		boolean result = false;
		if (0 <= age && age <= 20) {
			result = true;
		}
		return result;
	}
	
}

public class Main {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass("hungry", 0);
		MyClass obj2 = new MyClass("morning", 1);

		//System.out.println(obj1.age + obj1.name);
		//obj1.age = 3;           // The field MyClass.age is not visible
		//obj1.name = "lunch";    // The field MyClass.name is not visible
		//System.out.println(obj1.age + obj1.name);
		
		System.out.println(obj2.getAge() + obj2.getName());
		obj2.setAge(4);
		obj2.setName("poke");
		System.out.println(obj2.getAge() + obj2.getName());
		
	}

}
```