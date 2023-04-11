# 11 Two-Dimensional Array

# 자바의 참조형과 배열 생성

![Untitled](11%20Two-Dimensional%20Array%20b706123d944047e4aef8698e4c7ba629/Untitled.png)

![Untitled](11%20Two-Dimensional%20Array%20b706123d944047e4aef8698e4c7ba629/Untitled%201.png)

자바에서의 배열은 모두 참조형이므로 [힙에 할당된 1차원 배열을 참조하는 형태로 생성](https://velog.io/@jerry92/2%EC%B0%A8%EC%9B%90-%EB%B0%B0%EC%97%B4%EC%9D%98-%EB%A9%94%EB%AA%A8%EB%A6%AC-%ED%95%A0%EB%8B%B9)된다.

따라서 비정방형인 배열도 생성이 가능하다.

- 행의 길이
    
    `arr.length`
    
- 열의 길이
    
    `arr[0].length`
    
    `arr[1].length`
    
    `arr[2].length`
    

# new를 이용한 배열 사용

## 1. 선언

`int[][] arr;`

`String[][] arr;`

## 2. 생성

1. 정방형
    
    `arr = new int[3][2]`
    
2. 비정방형
    - 행 생성
        
        `int[][] arr = new int[3][];`
        
    - 각 행의 열 생성
        
        `arr[0] = new int[3];`
        
        `arr[1] = new int[]{4, 5};`
        
        `arr[2] = new int[1];`
        
        - 선언이 끝났기 때문에 반드시 new 키워드를 이용한다.
            
            `arr[2] = {6};`은 문법 오류이다.
            

## 3. 초기화

`arr[0][0] = 1;`

# 리터럴을 이용한 배열 사용

## 1. 선언, 생성, 초기화

`int[][] arr = { {1, 2, 3}, {4, 5}, {6} };`

# new와 리터럴을 이용한 배열 사용

## 1. 선언, 생성, 초기화

`int[][] arr = new int[][]{ {1, 2, 3}, {4, 5}, {6} };`

⇒ **배열의 크기를 명시하지 않음에 주의한다.**

---

### [String  인스턴스와 String 리터럴](https://ict-nroo.tistory.com/18)

![Untitled](11%20Two-Dimensional%20Array%20b706123d944047e4aef8698e4c7ba629/Untitled%202.png)

- `String s = new String("Hello World");`
    
    힙에 스트링 인스턴스가 생성되고 s는 이를 참조한다.
    
- `Stirng s = “Hello World”;`
    
    String constant pool에 “Hello World”가 생성되고 s는 이를 참조한다.