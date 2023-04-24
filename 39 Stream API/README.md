# 39 Stream API

# [스트림](https://www.geeksforgeeks.org/java-8-stream-tutorial/)

![Untitled](39%20Stream%20API%206d622558912b44d3a5024a2afb7b1f87/Untitled.png)

배열, 컬렉션, 파일에 저장된 데이터들은 Stream을 이용해 기능처리를 할 수 있다.

대부분 파라미터로 함수형 인터페이스 객체를 사용한다.

- 장점
    
    다양한 소스들을 표준화된 방법으로 다룰 수 있다.
    
    복잡한 로직을 간결한 코드로 나타낼 수 있다(method chaining).
    
    병렬 처리에 이용할 수 있다.
    

## 스트림 생성

`stream()`

각 Stream Source에서 적절한 방식으로 Stream 객체를 얻는다.

![Untitled](39%20Stream%20API%206d622558912b44d3a5024a2afb7b1f87/Untitled%201.png)

## 중간 처리

정렬

필터링

중복제거

연산

…

## 최종 처리

집계

변환

반복 출력

…

# 활용

![Untitled](39%20Stream%20API%206d622558912b44d3a5024a2afb7b1f87/Untitled%202.png)

![Untitled](39%20Stream%20API%206d622558912b44d3a5024a2afb7b1f87/Untitled%203.png)

```java
List<Integer> transactionsIds = 
    transactions.stream()
                .filter(t -> t.getType() == Transaction.GROCERY)
                .sorted(comparing(Transaction::getValue).reversed())
                .map(Transaction::getId)
                .collect(toList());
```