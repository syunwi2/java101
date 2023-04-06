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
    
4. switch문

### 반복문

1. for/for each문
2. while문
3. do ~ while문

> ### 표준 입력 객체 생성
> 
> 
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
> 

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