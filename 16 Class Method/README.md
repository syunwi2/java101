# 16 Class Method

# 인스턴스 메서드

```java
public class Class {
	int i;

	public int method() {
		return i;
	}
}

public class TestClass {
	public void main(String[] args) {
		Class obj = new Class();
		System.out.println(obj.method());
	}
}
```

- 정의
    
    `Acess ReturnDataType MethodName([parameter list]) { //TODO [return val;]}`
    
- 호출
    
    `var.method([parameter list]);`
    

인스턴스 변수가 값을 저장한다면 메서드는 기능을 처리한다.

## 메서드의 호출

- caller method
    
    worker method를 호출하는 메소드
    
- callee method
    
    호출되어 실제 동작하는 메소드
    
    worker method 혹은 method라고 한다.
    

## 특징

- 생성자와 달리 반드시 호출해야 동작한다.
- caller로의 복귀를 보장한다.

## 종류

- 파라미터가 있는 경우
    - 리턴값이 있는 경우
        
        `var2 = var1.method(parameter);`
        
    - 리턴값이 없는 경우
        
        `var1.method(parameter);`
        
- 파라미터가 없는 경우
    - 리턴값이 있는 경우
        
        `var2 = var1.method();`
        
    - 리턴값이 없는 경우
        
        `var1.method();`
        

## 메서드 내에서의 자기 참조

`this`키워드를 생략해도, 자기 인스턴스의 다른 메서드를 호출할 수 있다.

## 가변 인자

variable arguments

```java
class Test {
	public void a(int...a) {
		System.out.println(Arrays.toString(a));
	}
	public void b(String s, int...a) {
		System.out.println(Arrays.toString(a));
	}
}

public class TestMain {

	public static void main(String[] args) {
		Test tst = new Test();
		
		tst.a(1, 2, 3, 4);
		tst.b("Hello", 1);
		tst.b("Hello", 1, 2);
	}

}
```

`Access ReturnDataType MethodName (DataType... var) { //TODO [return;] }`

기본적인 메서드 호출은 반드시 인자 리스트(argument list)가 일치해야 한다.

가변 인자를 사용하면 갯수가 달라도 타입만 일치하면 메서드를 호출할 수 있다.

가변 인자를 사용해 받은 파라미터들은 배열로 관리된다.

- 가변인자를 사용하는 대표적인 함수
    
    `System.out.printf(String format, Object... args)`
    

# 메서드 오버로딩

하나의 클래스 안에 동일 이름의 메서드를 여러 번 정의할 수 있다.

argument list는 달라야 한다.

→ argument list는 같지만 return value가 다른 함수

: 정의할 수 없다. 문법 오류이다(호출 시 구분 불가).

오버로딩 된 동일한 이름의 메서드들을 오버로딩 메서드라 한다.

> ## 오버로딩
> 
> 
> 같은 이름의 메서드를 여러 개 가지면서 매개변수의 유형, 개수, 순서(argument list)를 다르게 하여 사용하는 기술이다.
> 
> 오버로딩을 통해 코드의 재사용성을 높이고 다양한 유형의 호출에 응답할 수 있다.
> 
> 메서드 오버로딩, 생성자 오버로딩이 가능하다.
> 

---

# Parameter and Argument

![Untitled](16%20Class%20Method%201d2f95f1e6b248b98e3ed95b299048d9/Untitled.png)