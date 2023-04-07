# 09 Statements

# 1. 실행문

## 순차문

라인 순서대로 실행된다.

`;`로 끝난다.

## 제어문

### 조건문

실행될 문장이 여러 개면 블럭으로 묶는다.

다만 가독성을 위해 항상 그룹핑하는 것을 권장한다.

1. 단일 if문
    
    조건이 참일때만 실행
    
2. if ~ else문
    
    조건이 참이면 if 블럭, 거짓이면 else 블럭 실행
    
3. 다중 if문
    
    조건에 맞는 블럭, 맞는 블럭 없으면 else 블럭 실행
    

> ### if문의 조건식에 올 수 있는 연산자
> 
> 
> 연산 결과가 논리값이어야 한다.
> 
> - 논리 연산자
> - 비교 연산자
> - instanceof
4. switch문
    
    변수와 각 case문의 값이 같으면 해당되는 문장을 실행한다.
    
    만약 없다면 default문을 실행한다.
    
    - case문 내부에 break문이 없으면
        
        해당 case문 아래에 있는 문장 모두가 실행된다.
        
        따라서 해당 case문만 실행 후 switch문을 빠져 나오고 싶다면 break문을 사용한다.
        
    
    ```java
    switch (var) {
    	case val1:
    		// TODO
    	case val2:
    		// TODO
    	default:
    		// TODO
    }
    ```
    

> ### switch문의 case문이 가질 수 있는 데이터 타입
> 
> 
> 내부적으로 case문의 값과 동등 연산을 실행해 값이 참이면 해당 블럭을 실행한다.
> 
> - bye
> - short
> - int
> - char
> - String
> - enum

### 반복문

조건이 일치하지 않을 때까지 특정 블럭 반복

> ### 반복문의 3가지 요소
> 
> - 시작값(초기값)
> - 조건식
> - 증감연산
1. for문
    
    반복 횟수 예측이 쉬울 때 사용한다.
    
    ```java
    for (시작값; 조건식; 증감연산) {
    	// TODO
    }
    ```
    
2. foreach문
    
    배열 요소의 갯수만큼 실행된다.
    
    ```java
    for (var:array) {
    	// 배열에 저장된 값을 하나 얻어 배열에 저장
    }
    ```
    
3. while문
    
    반복 횟수 예측이 어려울 때 사용한다.
    
    ```java
    초기값;
    while (조건식) {
    	// TODO
    	증감연산;
    }
    ```
    
4. do ~ while문
    
    문장이 먼저 실행되고 조건 검사가 실행된다.
    
    문장이 반드시 한 번은 실행된다.
    
    ```java
    초기값;
    do {
    	// TODO
    	증감연산;
    } while(조건식);
    ```
    

### continue

반복문 실행 블럭 내부에서 이후의 문장을을 무시하고 조건식으로 돌아감

### break

반복문을 빠져나감

# 2. 비실행문

주석문이라 한다.

## 한 줄 주석문

`//`

## 여러 줄 주석 문

`/* */`

## API 주석

`/** */`

API 문서 작성 시 사용한다.

javadoc.exe를 사용해 html형식의 API 문서를 만들 수 있다.

---

> ### 표준 입력 객체 생성
> ```java
> import java.util.Scanner;
> 
> Scanner scan = new Scanner(System.in);
> // 2023 happy new year'\n'
> int n = scan.nextInt();      // 표준 입력 버퍼에서 숫자 반환
> String n2 = scan.next();     // ' '를 기준으로 표준 입력 버퍼에서 문자열 토큰 반환
> String n3 = scan.nextLine(); // '\n'를 기준으로 표준 입력 버퍼에서 문자열 토큰 반환
> 
> System.out.println("n1 : " + n1 + "\nn2 : " + n2 + "\nn3 : " + n3);
> 
> /*
> n1 : 2023
> n2 : happy
> n3 :  new year
> */
> ```
