# 22 static

# static

![Untitled (2).png](22%20static%2023c2f90f97854404be17ebc67d3f2179/Untitled_(2).png)

![Untitled (1).png](22%20static%2023c2f90f97854404be17ebc67d3f2179/Untitled_(1).png)

- `static`키워드를 사용하면 프로그램 실행 시 method area에 올라간다.
    
    따라서 thread 제어가 필요할 경우 `static`으로 정의하지 않는다.
    
    `static`으로 선언된 클래스, 메서드는 `static`으로 선언된 멤버들에만 접근 가능하다.
    

## static variable

`ClassName.staticVar;`

정적 변수, 클래스 변수

클래스 인스턴스를 선언 및 생성하지 않아도 접근할 수 있다.

예) `Math.PI;`

## static method

`ClassName.staticMethod([parameter list]);`

정적 메서드

`this`키워드를 사용할 수 없다.

→ 낮은 주소에서 높은 주소 참조 불가

클래스 인스턴스를 선언 및 생성하지 않아도 실행할 수 있다.

→ OOP에서 벗어난 기능 사용

예) `Float.parseFloat();`

`Ingeter.parseInt();`

## static block

`static {}`

프로그램 실행 시 자동으로 블럭이 실행되므로, 주로 초기화 작업에 사용한다.

- 파일 경로 지정 등

### instance block

`{}`

실행문을 포함할 수 있다.

객체 생성(new 키워드 사용) 시 실행된다.

## static import

`import static packageName.ClassName.staticMember;`

static 멤버들을 클래스명을 사용해 `ClassName.staticVar;` , `ClassName.staticMethod([parameter list]);`와 같이 접근하지 않고 멤버명으로 바로 접근한다.

## [static class](https://m.blog.naver.com/iq_up/220013622883)

중첩된 클래스의 내부 클래스는 `static`키워드를 사용해 정적 클래스로 생성하거나, 키워드를 사용하지 않고 비정적 클래스로 정의할 수 있다.

정적 내부 클래스는 외부 클래스의 `static`멤버들만 참조할 수 있다.

정적 클래스 인스턴스들은 서로 다르다(서로 다른 참조값는 서로 다른 인스턴스를 참조하므로 싱글톤 개발에 사용 시 주의한다).

### [중첩된 클래스와 static 키워드](https://tecoble.techcourse.co.kr/post/2020-11-05-nested-class/)

가장 외부의 클래스는 항상 static class이며, static 키워드를 사용해 명시하지 않는다.

- 중첩된 클래스
    
    하나의 클래스 안에서 정의된 클래스로, 일반적으로 특정 클래스가 다른 클래스에서만 사용될 때 논리적으로 군집화하기 위해 사용한다.
    
- [자바에서 static class는](https://www.geeksforgeeks.org/nested-classes-java/)
    1. 부모 클래스가 될 수 있다.
    2. 외부 클래스의 인스턴스 생성과 무관하게 생성할 수 있다.
        
        `SuperClass.SubClass obj = new SubClass();`
        
        ⇒ 외부 클래스를 참조하지 않는다.
        
        ⇒ main() 메서드를 가질 수 있다.
        
    3. 외부 클래스의 `static`멤버들에만 접근할 수 있다.
- 자바에서는 non-static class는
    1. 부모 클래스가 될 수 없다
        
        ⇒ extends non-static-class 불가
        
    2. 외부 클래스의 인스턴스가 생성되어야만 non-static class의 인스턴스를 생성할 수 있다.
        
        `SuperClass.SubClass obj = new SuperClass().new SubClass();`
        
        ⇒ 해당 참조(obj)는 SuperClass에 대한 참조값을 가진다.
        
        1. 따라서 자신을 생성한 인스턴스에 대한 접근을 SuperClass.this로 할 수 있다.
        2. 외부 클래스는 사용되지 않지만 내부 클래스의 참조로 인해 garbage collector가 수거하지 못해 메모리 누수가 발생할 수 있다.
            
            → 내부 클래스가 외부 클래스와는 독립적으로 사용된다면 `static`으로 선언하는 것이 좋다.
            
        3. `static`멤버를 선언할 수 없다.
            
            → main() 메서드를 가질 수 없다.
            

---

- [Singleton](https://www.baeldung.com/java-static-class-vs-singleton)