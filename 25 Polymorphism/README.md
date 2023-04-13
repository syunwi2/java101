# 25 Polymorphism

# 다형성

![Untitled](25%20Polymorphism%209e3673326fd6483f8e4a1a3e56c97666/Untitled.png)

하나의 속성이나 동작이 다른 형태로 변할 수 있는 것을 뜻한다.

하나의 참조 변수가 다른 데이터 형을 참조할 수 있다.

이 때 해당 데이터 형은 상속관계여야 한다.

## 장점

- 여러 자식 클래스 참조들을 하나의 부모 클래스 참조로 관리할 수 있다.
    
    →  자식 클래스들에 대한 배열을 부모 클래스 타입 배열로 선언
    
    메소드 파라미터 타입을 부모 클래스 타입으로 선언
    
    예) `System.out.printf(String format, **Object**... args)`
    

## instanceof

`var instanceof ClassName`

변수가 해당 클래스와 상속 관계에 있으면 참을 반환한다.

- 형변환이 가능한지 검사
    
    → 부모 클래스로 선언된 배열에서 자식 클래스로 다운 캐스팅 가능한 지 검사
    

# Upcasting

`Person p = new Dancer();`

`Dancer d = new Dancer();
Person p = d;`

자식 클래스 참조를 부모 클래스 참조로 변경

캐스팅 연산자를 생략할 수 있다.

예) `List<String> list = Arrays.asList(arr);`

→ ArrayList 타입을 List 타입으로 업캐스팅

# Downcasting

`Person p = new Dancer();
Dancer d = **(Dancer)**p;`

부모 클래스 참조를 자식 클래스 참조로 변경

→  [무조건 부모 클래스 참조 변수를 다운 캐스팅 할 수 있는 것은 아니다.](https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%97%85%EC%BA%90%EC%8A%A4%ED%8C%85-%EB%8B%A4%EC%9A%B4%EC%BA%90%EC%8A%A4%ED%8C%85-%ED%95%9C%EB%B0%A9-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0)

한 번 부모 클래스로 업캐스팅되었던 참조를 다시 자식 클래스 참조로 복구하는 연산자이다.

연산 효율을 위해 **업캐스팅된 자식 클래스의 필드 복구**를 위한 것이다.

캐스팅 연산자를 생략할 수 없다.

# 다형성과 바인딩 시기

## 동적 바인딩

컴파일 타임이 아닌 런타임에 변수 및 메서드가 바인딩되는 것.

**[다형성을 사용한 경우, 오버라이딩된 메서드를 호출하면 동적으로 바인딩](https://kadosholy.tistory.com/99)**한다.

→ 다형성을 사용해 **자식 함수에만 사용된 함수를 부모 클래스 타입으로 호출 불가**

(모든 인스턴스 메서드는 런타임에 결정된다.)

예) 자식 클래스가 부모 클래스의 메서드 하나를 오버라이딩했다고 하자.

이때 다형성을 사용해 해당 메서드를 호출하면

→ 컴파일 타임에는 부모 함수에 해당 함수가 선언되었으므로 문법 에러 아님

→ 런타임에는 자식 함수에 해당 메서드가 구현되었으므로 오버라이딩 된 함수 실행

## 정적 바인딩

컴파일 타임에 변수 및 메서드가 바인딩되는 것.

모든 변수는 컴파일 타임에 바인딩된다.

→ 다형성을 사용한 경우, 자식 클래스 타입에 있는 변수를 사용하기 위해서는 자식 클래스 타입으로 캐스팅 필요

![Untitled](25%20Polymorphism%209e3673326fd6483f8e4a1a3e56c97666/Untitled%201.png)