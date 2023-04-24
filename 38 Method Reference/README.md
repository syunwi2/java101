# 38 Method Reference

# [메소드 참조](https://javaconceptoftheday.com/java-8-method-references/)

![Untitled](38%20Method%20Reference%204229266ea83f413a878b85fb89bcaf18/Untitled.png)

람다식이 하나의 메소드만을 호출하는 경우 파라미터, 람다 연산자, 리턴식을 생략해 표현할 수 있다.

```java
class Calculator {
	public static int methodA(int x, int y) {
		return x + y;
	}
	
	public int methodB(int x, int y) {
		return x + y;
	}
	
	public String methodC() {
		return this.toString();
	}
}
```

## 정적 메서드 참조

`ClassName::MethodName`

```java
    BinaryOperator<Integer> k = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return Calculator.methodA(t, u);
			}
		};
		BinaryOperator<Integer> k2 = (t, u) -> Calculator.methodA(t, u);
		BinaryOperator<Integer> k3 = Calculator::methodA;
```

## 인스턴스 메서드 참조

`ReferenceVariable::MethodName`

```java
    Calculator cal = new Calculator();
		BinaryOperator<Integer> i1 = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return cal.methodB(t, u);
			}
		};
		BinaryOperator<Integer> i2 = (t, u) -> cal.methodB(t, u);
		BinaryOperator<Integer> i3 = cal::methodB;
```

## 파라미터로 전달된 클래스 객체의 인스턴스 메서드 참조

`ClassName::MethodName`

```java
    Function<Calculator, String> j1 = new Function<Calculator, String>() {
			@Override
			public String apply(Calculator cal) {
				return cal.methodC();
			}
		};
		Function<Calculator, String> j2 = t -> t.methodC();
		Function<Calculator, String> j3 = Calculator::methodC;
```

## 생성자 참조

`ClassName::new`

```java
Supplier i = Calculator::new;
```