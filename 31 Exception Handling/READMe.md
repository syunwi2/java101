# 31 Exception Handling

# 예외

프로그램 실행 중 발생하는 의도치 않은 사건

일반적으로 에러라고 부른다.

## 예외 발생의 문제점

프로그램이 실행 중 비정상적으로 종료된다.

# 예외 처리

비정상 종료를 없애고 프로그램이 정상 종료될 수 있도록 함

- 예외가 발생된 코드를 수정하는 것과는 다르다.
    
    예외가 발생하면 프로그램이 바로 종료되는 것이 아니라 다른 동작을 할 수 있도록 해
    
    프로그램이 종료지점까지 실행될 수 있도록 하는 것이다.
    

## [암기] **예외 클래스 계층 구조**

![Untitled](31%20Exception%20Handling%202dc2a18958fc41ef84617129654b7636/Untitled.png)

Exception 클래스를 상속한 클래스들은 예외 클래스이다.

→ Exception이 최상위 예외 클래스이다.

![Untitled](31%20Exception%20Handling%202dc2a18958fc41ef84617129654b7636/Untitled%201.png)

크게 Runtime, 비Runtime계열이 있다.

- 비Runtime계열
    
    크게 IOException, SQLException이 있다.
    
    어떤 예외가 발생할 지 예상 가능하기에 try-catch, throws 방법으로 예외처리
    
    예외 처리 문법은 비Runtime계열을 위한 것임
    
    ⇒ 예외 처리 안하면 컴파일 에러
    
    = **Checked Exception**
    
- Runtime계열은
    
    try-catch, throws 방법으로 예외처리하지 않는다.
    
    어떤 예외가 발생할지 예상 불가
    
    조건 검사를 미리 잘해야 함
    
    ⇒ 예외 처리 안해도 컴파일 에러 안 남
    
    = **Unchecked Exception**
    

## 예외 처리 방법

![Untitled](31%20Exception%20Handling%202dc2a18958fc41ef84617129654b7636/Untitled%202.png)

예외 처리는 어떤 문제가 발생했는지 사용자가 쉽게 알아차릴 수 있도록 정보를 주는 것이다.

- `**getMessage()**`
- `**printStackTrace()**`

### 예외가 발생한 곳에서 처리

`try {} catch {}`

```java
try {
    // statements
} catch (ArithmeticException e) {
    // if Exception occurs in try block, run this block
}
// ...
catch (Exception e) {
    //
} finally {
    // whether exception occurs or not, run this block
}
```

어떤 catch 블럭의 파라미터와 일치하는 예외 클래스 인스턴스가 발생하면 해당 블럭이 예외를 처리한다.

만약 발생한 예외가 어떤 catch 블럭의 파라미터와도 일치하지 않으면 비정상 종료되므로

마지막에는 Exception 클래스 파라미터를 가지는 catch 블럭을 정의한다.

- 만약 Exception 클래스 파라미터를 가지는 catch 블럭을 가장 먼저 정의하면?
    
    어떤 예외가 발생하더라도 해당 블럭이 예외를 처리한다.
    
    → 가장 낮은 계층의 예외부터  catch 블럭을 작성한다.
    
    (instanceof 동일)
    
- finally 블럭
    
    예외 발생 여부와 상관없이 반드시 수행되는 블럭
    
    예) 사용한 외부 자원 정상 반환(close())
    
    - catch 블럭 없이 try - finally 블럭만 사용
        
        반드시 처리해야 하는 문장을 명시적으로 작성하기 위해 사용할 수 있다.
        

### 예외가 발생한 곳이 아닌 곳에 위임하여 처리

`throws`

```java
public void int funcB() throws Exception {    // 가능한 하위 계층의 클래스로 작성 권장
    // Exception may occur
}
public void int funcA() throws Exception {
    // Exception may occur
    funcB();
}
public static void main() {
    try {
        funcA();
    } catch (Exception e) {
        //
    } finally {
        //
    }
}
```

If exception occurs in callee, Caller handles the exception.

일반적으로 main()까지 위임한다.

- **[시험] 명시적 예외 발생**
    
    `throw`
    
    ```java
    public void func() **throws** Exception {
        if (cond) {
            **throw** new Exception("msg");
            // "msg" can be printed with getMessage(), printStackTrace().
        }
    }
    ```
    
    예외 인스턴스를 생성해 발생시킴
    
    시스템이 예외을 발생시키지 않는 경우, 명시적으로 예외가 발생하도록 할 수 있다.
    
    → 문법적으로 오류가 아니기 때문에 묵시적으로 예외가 발생하지 않는 경우
    
    - 명시적으로 예외를 발생시키는 이유
        
        비지니스 규칙에 위반되는 경우가 발생하지 않도록 하기 위해서
        
    - Checked Exceptions를 발생시키면
        
        이후 예외 처리 구문을 작성하지 않을 시 컴파일 에러이다.
        
        → Unchecked Exceptions는 예외를 발생시키고 예외 처리 안해도 컴파일 에러 안 남
        

# 사용자 정의 예외 클래스

```java
public class MyException extends Exception {

	public MyException(String message) {
		super(message);
	}

}
```

프로그램 상에 필요한 예외 처리를 위해 사용자가 예외 클래스를 정의할 수 있다.

Exception 클래스를 상속받은 클래스는 예외 클래스로 사용할 수 있다.