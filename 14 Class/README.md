# 14 Class

# 객체 지향 프로그래밍

객체를 사용해 프로그래밍 하는 방법론

## 객체

Object

현실 세계에 존재하는 사물을 의미한다.

객체는 속성과 동작을 가진다.

### 속성

객체를 나타내는 특성, 성질

### 동작

객체의 기능

## 추상화

모델링

프로그래밍에 필요한 객체와 그 객체의 속성 및 동작을 추출하는 것

의뢰→분석→설계의 3단계에서 분석 단계에 추상화를 실시한다.

분석을 완료하고 설계 단계에 들어서면

- 객체는 클래스로
- 속성은 인스턴스 변수(필드)로
- 동작은 메서드로

표현된다.

## 클래스

Class

클래스는 인스턴스 변수와 메서드를 멤버로 가진다.

**메인 메서드를 가지지 않는다.**

따라서 독자적으로는 실행되지 않으며,

**메인 메서드를 가지는 핸들링 클래스**를 따로 둔다.

핸들링 클래스는 재사용이 불가능하지만

### 인스턴스 변수

멤버 변수라고도 한다.

### 인스턴스 메서드

멤버 메서드라고도 한다.

## 상속

객체 간에 관계가 존재한다면 이를 상속 관계로 표현할 수 있다.

# 클래스의 사용

![Untitled](14%20Class%20ca2b5f79d38a484b9a473e8156149cec/Untitled.png)

![Untitled](14%20Class%20ca2b5f79d38a484b9a473e8156149cec/Untitled%201.png)

## 클래스 정의

인스턴스 변수와 메서드를 정의한다.

```java
public class Cat {
	String name;
	int age;
	String sex;

	// Method ...
}
```

## 클래스 인스턴스화

핸들링 메서드에서 클래스 인스턴스를 선언하고 생성한다.

- 생성자 호출
    
    `new ClassName([parameters]);`
    

이때 인스턴스 변수들을 초기화하지 않으면 데이터 타입에 따라 자동 초기화된다.

```java
public class TestCat {

	public static void main(String[] args) {
		Cat momo;
		// momo.name = "momochan" <- **Error, local variable needs to be initialized.**
		momo = new Cat();
		momo.name = "momochan";
		momo.age = 2;
		momo.sex = "f";
	}

}
```

## 생성자

`public ClassName([parameters])`

클래스의 멤버에는 속하지 않는다.

- 클래스의 멤버
    - 인스턴스 변수
    - 인스턴스 메소드

인스턴스 변수를 초기화하는 역할을 한다.

**인스턴스 생성 시 반드시 호출**해야 한다.

생성자를 이용해 초기화하는 방법은 초기화 시점이 가장 빠른 방법이다.

인스턴스 변수에직접 접근해 초기화하는 방법은 초기화 시점이 아주 늦다.

### 기본 생성자

생성자를 명시적으로 정의하지 않으면 자동으로 정의된다.

- 기본 생성자의 형태
    
    `public ClassName() {}`
    

하나의 생성자라도 정의되면 기본 생성자는 자동으로 정의되지 않는다.

- 생성자를 `public Dog(int age) {}`만 정의한 상태에서
    
    `Dog puppy = new Dog();`으로 인스턴스를 생성하려 하면 에러이다.
    

따라서 하나의 생성자를 정의했다면 기본 생성자도 함께 정의하는 것이 좋다.

### 오버로딩 생성자

하나의 클래스에 같은 이름의 생성자를 여러 개 정의할 수 있다.

- 각 생성자의 변수의 데이터 타입, 갯수, 순서(argument list)가 달라야 한다.

### 파라미터

호출 시 전달되는 값(인자값)을 저장하는 변수를 파라미터라 한다.

### this 키워드

힙에 생성된 자신의 인스턴스를 참조할 때 사용한다.

인스턴스 변수명과 파라니터 변수명이 동일할 때에는 반드시 사용한다.

```java
public class Cat {
	String name;
	int age;
	String sex;

	public Cat() {
	}

	public Cat(int age) {
		this.age = age;
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Cat(int age, String name) {
		this(name, age);
	}
}
```

---

# 객체, 클래스, 인스턴스

![Untitled](14%20Class%20ca2b5f79d38a484b9a473e8156149cec/Untitled%202.png)

- 객체
    
    실체가 있고, 사람이 구분하여 인식할 수 있는 것들을 객체라 한다.
    
    프로그래밍에서는 특별히 요구사항을 분석하며 추출된 객체들을 특별히 객체라 한다.
    
- 클래스
    
    설계 단계에서 객체가 공통적으로 가지는 속성, 행동들을 특별히 정의해 각각 인스턴스 변수와 인스턴스 메모리로 구현하여 정의한 것이다.
    
- 인스턴스
    
    실행 단계에서 클래스의 정의를 이용해 실제로 구현, 생성한 것이 인스턴스이다.