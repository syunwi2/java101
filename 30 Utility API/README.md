# 30 Utility API

# String

## String

문자열을 생성한다.

- new 이용
    
    스트링 클래스의 인스턴스 생성
    
- 리터럴 이용
    
    “”안에 문자열 리터럴 명시해 생성
    
    → Constant Pool에 생성, 이후 같은 리터럴일 경우 같은 값 참조
    

인스턴스 메서드의 리턴값은 새로운 String

→ 원본 변경 안됨

## StringBuilder

- new 이용

인스턴스 메서드를 호출하면 원본이 변경됨

→ StringBuffer 성능이 더 좋고 메모리 낭비를 줄일 수 있다.

대신 안정성이 떨어진다.

## StringBuffer

- new 이용

인스턴스 메서드를 호출하면 원본이 변경됨

→ 안정적이다. 대신 성능이 떨어진다.

# Wrapper Class

자바의 기본형을 참조형으로 제공하는 클래스

| byte | Byte |
| --- | --- |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

클래스 메서드를 이용하는 듯 기본형 데이터를 효율적으로 사용하기 위해 이용한다.

## Auto Boxing

기본형을 참조형으로 변환

예) Integer n = 10;

## Auto Unboxing

참조형을 기본형으로 변환

예) int n = new Integer(10);

# Random

# 날짜

## Date

Deprecated

더 이상 지원하지 않는다.

## Calender

싱글톤디자인이 적용되어 있다.

# BigDecimal

부동소수점 오차 없이 연산할 수 있다.