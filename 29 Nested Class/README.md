29 Nested Class
중첩 클래스
하나의 클래스 안에서 또 다른 클래스가 정의되면 클래스가 중첩되었다고 한다.
어떤 클래스가 하나의 클래스에서만 사용될 때 중첩 클래스로 선언하는 것이 유리하다.
→ 관리 용이
→ 논리적 간결함
내부 클래스는 외부 클래스의 private멤버들에 접근할 수 있다.
Member Inner Class
public class OuterClass {
    String str;
    public class InnerClass {
    }
}
Outer Class의 멤버처럼 선언된 클래스이다.
Local Inner Class
public class OuterClass {
    public void func() {
        public class InnerClass {
				}
    }
}
Outer Class의 로컬 변수처럼 선언된 클래스이다.
해당 메서드가 호출되면 클래스가 정의되고, 메서드 종료 시 정의가 사라진다.
Static Inner Class
class OuterClass {
    static int outer_x = 10;
    int outer_y = 20;
 
    // static nested class
    static class StaticNestedClass {
        void display() {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);
 
            // cannot directly access non-static members
            // System.out.println("outer_y = " + outer_y);
        }
    }

}

public class StaticNestedClassDemo {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
    }
}
중첩된 클래스의 내부 클래스는 static키워드를 사용해 정적 클래스로 생성하거나, 키워드를 사용하지 않고 비정적 클래스로 정의할 수 있다.
정적 내부 클래스는 외부 클래스의 static멤버들만 참조할 수 있다.
자바에서 static class는
부모 클래스가 될 수 있다.
외부 클래스의 인스턴스 생성과 무관하게 생성할 수 있다.
SuperClass.SubClass obj = new SubClass();
⇒ 외부 클래스를 참조하지 않는다.
⇒ main() 메서드를 가질 수 있다.
외부 클래스의 static멤버들에만 접근할 수 있다.
Anonymous Class
public abstract class MyAbstractClass {
	String str;
	int num;

	public abstract void func();
	
}

public interface MyInterface {
	int NUM = 10;
	
	public abstract void func();

}

public class Main {
    public static void main() {
        MyAbstractClass obj1 = new MyAbstractClass() {
            @Override
            public void func() {
                // statements
            }
        };
        MyInterface obj2 = new MyInterface() {
            @Override
            public void func() {
                // statements
            }
        };
    }
}
익명 클래스
이름이 없는 클래스로, 일시적으로 한 번만 사용이 필요할 때 사용하는 클래스이다.
→ 다른 메서드나 클래스의 파라미터로 전달할 때
추상 클래스나 인터페이스의 객체를 생성할 수 있다.