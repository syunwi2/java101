# 28 Interface

# 인터페이스

```java
public interface MyInterface {
	// 1. constant
	int NUM = 10;     // == public static final int NUM = 10;
	
	// 2. abstract method
	public abstract void a();
	public void a2(); // == public abstract void a2();
	void a3();        // == public abstract void a3();
	
	// 3. default method
	public default int c() {
		return NUM;
	}
	
	// 4. static method
	public static void getInfo() {
		System.out.println(Collection.class);
	}
```

`public interface InterfaceName {}`

인터페이스는 추상 메서드, 정적 메서드, default 메서드, 상수만을 멤버로 가진다.

## 인터페이스의 멤버

인터페이스의 멤버로는 아래의 4종류가 올 수 있다.

- 상수
    
    `public static final`
    
    인터페이스의 모든 변수는 상수이다.
    
    → 인터페이스 정의 내에서 **변수를 초기화하지 않으면 에러**이다.
    
    위의 키워드를 생략할 수 있으며, 컴파일 타임에 자동으로 추가된다.
    
- 추상 메서드
    
    `public abstract`
    
    위의 키워드를 생략할 수 있으며, 컴파일 타임에 자동으로 추가된다.
    
    → **추상 클래스에서는 `abstract`키워드 생략이 불가**하지만, 인터페이스는 생략 가능
    
- [default 메서드](https://velog.io/@heoseungyeon/%EB%94%94%ED%8F%B4%ED%8A%B8-%EB%A9%94%EC%84%9C%EB%93%9CDefault-Method)
    
    `public default`
    
    키워드를 생략할 수 없다.
    
    → 키워드 생략시 `public abstract`
    
    > **default 메서드**
    > 
    > 
    > 인터페이스에서만 정의 가능한 메서드로, 구현부를 생략할 수 없다.
    > 
    > → 반드시 기능을 정의한다.
    > 
    > 자식 클래스에서 오버라이딩 할 수 있다.
    > 
    > → `default`키워드를 생략해야 한다.
    > 
- static 메서드
    
    `static`
    
    1. 키워드를 생략할 수 없다.
        
        → 키워드 생략시 `public abstract`
        
    2. 자식 클래스에서 오버라이딩할 수 없다.
        
        → static method는 컴파일 타임에 정의되기 때문이다.
        
    3. `InterfaceName.staticMethod();` 로 호출해 사용할 수 있다.
        
        → 자식 클래스의 객체 생성 필요 없음
        
        → `자식클래스.staticMethod();`로 호출해 사용할 수 없다.
        
        ⇒ [인터페이스의 정적 메서드의 범위는 인터페이스에 한정된다.](https://www.geeksforgeeks.org/static-method-in-interface-in-java/)
        
        ⇒ [부모 클래스나 인터페이스의 정적 메서드를 오버라이딩 하기: 하이딩](https://www.geeksforgeeks.org/method-hiding-in-java/)
        

## 인터페이스와 객체

인터페이스로는 객체 생성이 불가하다.

1. 인스턴스화하기 위해서는 해당 인터페이스를 구현한 자식 클래스 타입으로 선언한다.
    
    `Access class ClassName **implements** InterfaceName {}`
    
    → 인터페이스를 구현하기 위해서는 `implements`키워드를 사용한다.
    
2. 인터페이스를 구현한 자식 클래스가 **[추상 메서드를 반드시 오버라이딩할 의무는 없다.](https://velog.io/@tomato2532/JAVA-%EC%B6%94%EC%83%81%ED%81%B4%EB%9E%98%EC%8A%A4%EC%99%80-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4)**
    
    → 단 추상 메서드가 남아있게 되므로 **해당 자식 클래스는 추상 클래스**로 정의해야 한다.
    
3. 객체 생성은 불가하지만 데이터 타입으로는 사용할 수 있다.
    
    → 다형성 사용 가능(자식 클래스 타입을 인터페이스 타입으로 업캐스팅 가능)
    
    → 파라미터의 데이터 타입으로 사용 가능
    
    → 리턴 데이터 타입으로 사용 가능
    
    → 제너릭의 요소로 사용 가능
    
4. 생성자를 가질 수 없다.
    
    → 생성자는 인터페이스가 가질 수 있는 멤버가 아님
    

## 장점

- 다중 구현할 수 있다.
    
    `public class ClassName **extends** SuperClass **implements** Interface1, ... ,InterfaceN {}`
    
    → 하나의 클래스에서 상속은 하나만 가능하지만, 인터페이스의 구현은 여러 개가 가능하다.
    
    → 보다 논리적인 기능 정의에 용이
    
    인터페이스 간에는 다중 상속이 가능하다.
    
    → `public Interface extends Interface1, …, InterfaceN {}`
    
    ![Untitled](28%20Interface%20ee7d7f13ef4d4e10a3669e9d253f39e7/Untitled.png)
    
- 클래스들 간의 의존성을 감소시킬 수 있다.
    
    Loosely Coupling, Decoupling
    

# 추상 클래스, 인터페이스와 자식 클래스의 관계

![Untitled (3).png](28%20Interface%20ee7d7f13ef4d4e10a3669e9d253f39e7/Untitled_(3).png)

- 추상 클래스
    
    ![Untitled (5).png](28%20Interface%20ee7d7f13ef4d4e10a3669e9d253f39e7/Untitled_(5).png)
    
    `extends`
    

- 인터페이스
    
    ![Untitled (4).png](28%20Interface%20ee7d7f13ef4d4e10a3669e9d253f39e7/Untitled_(4).png)
    
    `implements`
    

# 인터페이스와 인터페이스의 관계

![Untitled](28%20Interface%20ee7d7f13ef4d4e10a3669e9d253f39e7/Untitled%201.png)

- 상속
    
    ![Untitled (5).png](28%20Interface%20ee7d7f13ef4d4e10a3669e9d253f39e7/Untitled_(5).png)
    
    `extends`