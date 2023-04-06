# 05 JVM, JRE, JDK

# Java Virtual Machine

jdk를 설치하면 사용할 수 있는 소프트웨어로 자체적인 메모리와 연산 기능을 가진 일종의 가상 머신 소프트웨어이다.

**.class(바이트 코드)를 실행**한다.

.class를 실행하기 위해서는 **반드시 JVM**이 있어야 한다.

![Untitled](05%20JVM,%20JRE,%20JDK%20c54e4bcb8a2c4e9ca0083a5e3adc7ee0/Untitled.png)

## JVM과 의존성

- JVM을 사용해 바이트 코드를 실행하기 때문에 **.class는 O/S 독립적**이다.
- 단 O/S 위에 설치되는 **JVM은 O/S 의존적**이다.
    - 따라서 운영체제에 따라 다른 JVM을 설치해야 한다.
        
        예) Window 32bit, Windows 64bit, Mac OS가 설치해야 하는 JVM은 모두 다르다.
        

# JRE

Java Runtime Environment

.class + JVM

.class를 실행할 수 있는 환경이다.

![Untitled](05%20JVM,%20JRE,%20JDK%20c54e4bcb8a2c4e9ca0083a5e3adc7ee0/Untitled%201.png)

# JDK

Java Development Kit

JRE + javac.exe + etc…

Java를 개발할 수 있는 환경이다.