# 26 Object

# Object 클래스

모든 클래스의 부모인 최상위 클래스이다.

따라서 Object 클래스 안에 정의된 메서드를 사용할 수 있고, 오버라이딩할 수 있다.

## Object.toString()

해당 메서드는 참조 변수가 출력 함수에서 사용될 경우 자동으로 호출된다.

참조 변수가 참조하고 있는 값을 문자열로 변환한다.

- 자바 API에서
    
    대부분 해당 메서드를 오버라이딩 해 실제 값을 출력하도록 되어 있다.
    
    ```java
    String a = "Hello";
    System.out.println(a);
    System.out.println(a.toString());
    ```
    
- 사용자 정의 클래스에서
    
    오버라이딩 하지 않으면 Object에 정의된 함수 호출
    
    → `getClass().getName() + “@” + Integer.toHexString(hashCode())`
    

## [Lombook 라이브러리](https://dololak.tistory.com/783)

- 생성자, getter, setter, toString 메서드 자동 생성