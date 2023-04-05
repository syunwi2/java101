# 02 Hello World

# 프로젝트 생성

패키지: 폴더와 같다

![Untitled](img%20c6b36cecef194ee0a944ccbf15b6b74d/Untitled.png)

클래스를 선택해 생성한다.

클래스의 이름은 대문자로 시작하는 것이 관례이며 _, $, 숫자를 포함할 수 있다.

클래스의 이름은 숫자로 시작하거나 공백 및 특수문자(_, $ 제외)를 포함할 수 없다.

![Untitled](img%20c6b36cecef194ee0a944ccbf15b6b74d/Untitled%201.png)

![Untitled](img%20c6b36cecef194ee0a944ccbf15b6b74d/Untitled%202.png)

![Untitled](img%20c6b36cecef194ee0a944ccbf15b6b74d/Untitled%203.png)

자동으로 메인 함수 생성 옵션을 체크하고 완료한다.

![Untitled](img%20c6b36cecef194ee0a944ccbf15b6b74d/Untitled%204.png)

# 네비게이터

`javac`를 통해 컴파일되어 `/bin` 경로에 생성된 `.class`파일들을 볼 수 있다.

![Untitled](img%20c6b36cecef194ee0a944ccbf15b6b74d/Untitled%205.png)

![Untitled](img%20c6b36cecef194ee0a944ccbf15b6b74d/Untitled%206.png)

# 실행

`ctrl + F11`

컴파일 및 인터프리트를 할 수 있다.

![Untitled](img%20c6b36cecef194ee0a944ccbf15b6b74d/Untitled%207.png)

# 기본 문법

## 주석

```java
// single line comment
/*
    multi line comment
*/
```

## 표준 출력 메서드

```java
// sysout + ctrl + space
// 새로운 라인을 생성하고 출력한다.
System.out.print("Merry ");
// 새로운 라인을 생성하지 않고 출력한다.
System.out.println("X-mas.");
// 형식을 지정해 새로운 라인을 생성하지 않고 출력한다.
System.out.printf("-%d", 486);
```

![Untitled](img%20c6b36cecef194ee0a944ccbf15b6b74d/Untitled%208.png)

# 단축키

### 한 줄 복사

`ctrl + alt + 화살표`

### 한 줄 삭제

`ctrl + d`

### 명령어 한 줄 위치 이동

`alt + 화살표`

# 메인 메서드

```java
public static void main(String[] args) {
	// code
}
```

반드시 위의 표현식으로 선언해야 제대로 메인 메서드로서 동작한다.
