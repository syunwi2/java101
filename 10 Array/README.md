# 10 Array

# 데이터 타입과 데이터의 저장

- 변수
    
    하나의 변수에 하나의 데이터만 담을 수 있다.
    
    여러 데이터를 저장해야 하면 해당 데이터의 갯수만큼 변수를 생성해야 한다.
    
- 배열
    
    하나의 변수에 여러 데이터를 저장할 수 있다.
    
    하나의 데이터 타입만 저장할 수 있다.
    
    한 번 선언하면 크기를 변경할 수 없다.
    
    → 추가, 삽입, 삭제 어려움
    
- 컬렉션
    
    하나의 변수에 여러 데이터를 저장할 수 있다.
    
    여러 데이터 타입을 저장할 수 있다.
    
    선언 이후에 크기를 변경할 수 있다.
    
    → 추가, 삽입, 삭제 가능
    
    Map, Set, List 등의 계열이 있다.
    

# 참조형 변수의 데이터

**반드시 new** 키워드 이용해 해당 데이터 타입의 인스턴스를 생성하고 이를 참조형 변수가 참조하도록 한다.

`Dataype var = new Datatype();`

# 배열

배열은 크게

1. new 키워드 이용
    
    `int[] n = new int[3];`
    
2. 리터럴 이용
    
    `int[] n = {1, 2, 3};`
    
3. new 키워드와 리터럴 이용
    
    `int[] n = new int[]{1, 2, 3};`
    

위의 세 가지 방식으로 선언할 수 있다.

## 선언

`datatype [] varName`

`datatype varName []`

배열의 참조만이 생성된 것과 같다.

선언하면 참조형 변수의 값은 NULL로 초기화(아직 힙의 특정 주소로 초기화 안 됨)

참조할 배열의 데이터 타입에는 기본형과 참조형이 모두 올 수 있다.

즉 배열은 기본형과 참조형 인스턴스로 생성될 수 있다.

## 생성

`varName = new datatype[size];`

(데이터 타입 크기) * (size)만큼 힙에 공간을 할당해 배열 인스턴스 생성 후 주소를 반환한다.

```java
int[] n2;
n2 = new int[10];
```

## 초기화

`varName[idx] = data;`

### 자동 초기화

배열의 원소들을 초기화하지 않았을 때 다음과 같이 자동 초기화된다.

- 기본형
    - 정수: 0
    - 실수: 0.0
    - 문자: \u0000
    - 논리: false
- 참조형
    - NULL

### ArrayIndexOutOfBoundException

접근이 불가능한 배열 요소에 접근할 시 발생한다.

배열의 인덱스가 배열 크기 범위를 넘어가면 발생한다.

## 배열을 선언하는 여러 방법

- 생성 & 초기화 없이 배열 참조변수만 선언
`int[] arr;`
`int arr[];`
- 선언과 동시에 배열 생성
    
    크기를 생략하면 문법 오류이다.
    `int[] arr = new int[5];`
    `String[] arr = new String[5];`
    
- 기존 배열의 참조 변수에 배열 생성하기
    
    ```java
    int[] arr;
    arr = new int[5]; //5의 크기를 가지고 원소들이 초기값으로 채워진 배열 생성
    ```
    
- 선언과 동시에 배열 생성 및 리터럴을 이용해 초기화
    
    {}를 사용해 new키워드를 생략할 수 있다.
    
    new 키워드 사용 시 **[]안에 크기를 주지 않는다.**
    
    {}을 이용한 초기화는 배열 선언문이 종료된 이후에는 사용할 수 없다.
    `int[] arr = {1, 2, 3, 4, 5};`
    `int[] arr = new int[]  {1, 3, 5, 2, 4};`
    `int[] odds = {1, 3, 5, 7, 9};`
    `String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};`
    
- 2차원 배열 선언
    
    ```java
    int[][] arr1 = new int[4][3];   //3의 크기의 배열을 4개 가질 수 있는 2차원 배열 할당
    int[][] arr2 = { {2, 5, 3}, {4, 4, 1}, {1, 7, 3}, {3, 4, 5} };
    //arr1[0] = {2, 5, 3};    // Error
    //arr1[0][0] = 2;         // Fine.
    ```
    

# 배열의 인스턴스 변수와 메소드

## 길이

`varName.length`

# 배열과 메모리 세그먼트

모든 참조형 변수는 스택에 선언된다.

배열 인스턴스는 힙에 생성되며, 배열 참조형 변수는 해당 주소를 저장한다.