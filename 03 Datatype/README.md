# 03 Datatype

---

# 0. 리터럴

데이터의 값을 리터럴이라 한다.

# 1. 기본형

Primitive Datatype(PDT), 8개가 있다.

## 수치형

### 정수형

1. `byte`: 1byte
2. `short`: 2byte
3. `int`: 4byte (**defalut**)
4. `long`: 8byte

### 실수형

1. `float`: 4byte
    
    **3.14F** 혹은 **3.14f**처럼 f, F를 실수 뒤에 붙여야 float형이다.
    
2. `double`: 8byte (**defalut**)
    
    **3.14**와 같이 실수 뒤에 f, F를 붙이지 않거나
    
    **3.14D** 혹은 **3.14d**처럼 d, D를 실수 뒤에 붙이면 double형이다.
    

## 문자형

1. `char`: 2byte
    
    문자 하나와 escape 문자들을 표현하는 데이터 타입이다.
    
    - 이스케이프 문자
        
        \n: 줄 바꿈
        
        \t: 탭
        
        \”: “
        
        \’: ‘
        
        \\: \
        

## 논리형

1. `boolean`: 1byte
    
    true나 false값을 가진다.
    
    0이나 1을 대신 사용할 수 없다.
    

# 2. 참조형

Reference Datatype(RDT)

기본형 데이터 8개를 제외한 모든 데이터 타입은 참조형이다.

클래스, 배열, 인터페이스 모두 참조형 데이터 타입이다.
