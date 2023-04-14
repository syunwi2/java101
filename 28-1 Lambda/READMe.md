28-1 Lambda
함수형 프로그래밍
객체가 아닌 기능 중심의 프로그래밍이다.
자바는 객체 지향 프로그래밍 언어이기 때문에, 하나의 변수나 메서드를 사용하기 위해서도 클래스를 정의해야하는 번거로움이 있다.
이런 불편함을 해소하기 위해 람다 표현식을 사용할 수 있다.
함수형 인터페이스
@FunctionalInterface
public interface MyInterface {
    // abstract method 오직 하나
    void abstractMethod();

    // default method, static method에는 제약 없음
    default void defaultFunc() {
    }
    static void staticFunc() {
    }
}
단 하나의 추상 메서드를 가지는 인터페이스이다.
람다식
함수형 인터페이스는 익명 클래스 혹은 람다식으로 객체를 생성할 수 있다.
람다식 사용법
기본
(int num) -> {System.out.println(num);};
단일 실행문은 중괄호 제거
(int num) -> System.out.println(num);
단일 인자는 타입 생략
(num) -> System.out.println(num);
단일 인자는 소괄호 제거
num -> System.out.println(num);
인자가 없으면 소괄호 필수
() -> System.out.println("매개변수 없음");
인자가 여러개면 소괄호 필수
(x, y) -> System.out.println(x, y);
인자가 없고 반환값이 있으면
() -> {return value;};
실행코드가 return문 뿐이면 return 키워드 생략 가능
() -> value;
매개변수, 리턴타입 둘다 있으면
(x, y) -> x+y;