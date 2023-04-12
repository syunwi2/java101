# 21 Inheritance

# 상속

`extends ClassName`

하나의 클래스의 정의를 재사용할 수 있다.

- 상속되지 않는 멤버
    - private으로 선언된 변수, 메서드
    - 생성자

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