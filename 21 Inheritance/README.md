# 21 Inheritance

# 상속

`extends ClassName`

하나의 클래스의 정의를 재사용할 수 있다.

- 부모의 변수, 메서드(멤버)를 자식이 선언없이 사용한다.
    
    자바에서는
    
    - 상속을 명시하지 않으면 `extends Object`로 해석된다.
        
        → 모든 클래스의 최상위 클래스는 Object이다.
        
        → Object에 정의된 메서드들을 사용할 수 있다.
        
    - 단일 상속만 지원한다.
        
        `extends` 뒤에 하나의 클래스명만 명시 가능하다.
        
    - [**자식 클래스의 인스턴스는 부모 클래스 생성된 뒤 생성된다.**](https://blog.naver.com/PostView.naver?blogId=roylove&logNo=189204286&redirect=Dlog&widgetTypeCall=true&directAccess=false)
        
        ![Untitled](21%20Inheritance%2076c941384965427e90bbfe519724be82/Untitled.png)
        
        → 자식 클래스 생성자 호출
        
        → 부모 클래스 생성자 호출
        
        > `super` 키워드
        > 
        > - 부모의 멤버와 자식의 멤버 명이 동일할 때 사용
        >     
        >     `super.var;`
        >     
        >     `super.method();`
        >     
        >     - 변수
        >     - 메서드
        > - 부모의 생성자 호출
        >     
        >     `super(parameter);`
        >     
        >     부모의 인스턴스 변수들은 부모 클래스에서 초기화
        >     
        >     **반드시 자식 클래스 생성자의 가장 첫 줄에 명시한다.**
        >     
        
        → 부모 클래스의 필드 생성
        
        → 자식 클래스의 필드 생성
        
- 상속되지 않는 멤버
    - private으로 선언된 변수, 메서드
    - 생성자

# 메서드 오버라이딩

`@Override`

> ### Annotation
> 
> 
> `@`
> 
> 어노테이션은
> 
> - 주석과 같이 코드 가독성을 높인다.
> - 컴파일러의 문법 에러 체크가 가능하도록 한다.
>     
>     예) @Override →오버라이딩 규칙을 위배하면 에러 발생
>     
> - 특정 기능 실행을 위한 정보를 제공한다.
>     
>     예) @Deprecated → 메서드 사용 시 경고 발생
>     
> 
> 내장 어노테이션이 제공되며, 사용자가 정의해 사용할 수 있다.
> 

자식 클래스에서 부모 클래스에 정의된 메서드를 다시 정의한다.

- 수정이 불가한 것
    - 메서드의 리턴 타입
    - 메서드의 이름
    - 메서드의 파라미터
- 수정에 제한이 있는 것
    - 접근 지정자
        
        동일하거나 덜 엄격한 접근 지정자로 수정 가능
        
- UML에서의 표현
    
    ![Untitled](21%20Inheritance%2076c941384965427e90bbfe519724be82/Untitled%201.png)
    
    부모 클래스의 메서드와 같은 이름을 가진 자식 클래스의 메서드는 오버라이딩되었음을 나타낸다.
    
- 오버라이딩이 불가한 부모 클래스의 멤버
    - `static` 멤버
        
        → 오버라이딩은 런타임에 일어나기 때문에, 컴파일 타임에 정의되는 멤버들을 오버라이딩 할 수 없다.
        
    - `final`로 정의된 멤버
        
        → `final` 키워드로 더 이상 상속되지 않음이 정의되었다.
        
    - `private` 접근 지정자로 선언된 멤버
        
        → 상속되지 않는다.
        

### 구현

```java
package myPackage;
public class MyClass {

	public String name;
	protected String status;
	String address;
	private int age;
	
	// constructor
	public MyClass() {}
	public MyClass(String name, String status, String address, int age) {
		this.name = name;
		this.status = status;
		this.address = address;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
-----------
package myPackage;

public class MyChildClass extends MyClass {
	public void echo() {
		System.out.println(this.name);
	}
}
------------
import myPackage.MyClass;

public class Test extends MyClass {
	public void echo() {
		System.out.println(this.name);
	}

}
```

.