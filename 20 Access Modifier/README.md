# 20 Access Modifier

# 접근 지정자

다른 클래스, 변수(로컬 변수 제외), 메소드(생성자 포함)에 접근할 때, 그 접근을 허용할 범위를 지정한다.

데이터 보호를 위한 목적으로 사용한다.

| 접근 지정자 | 접근 범위 | 동일 클래스 | 동일 패키지 | 타 패키지 자식 클래스 | 타 패키지 |
| --- | --- | --- | --- | --- | --- |
| public | 접근 제한 없음 | o | o | o | o |
| protected | 동일 패키지와 상속받은 클래스 | o | o | o |  |
| default | 동일 패키지 | o | o |  |  |
| private | 동일 클래스 | o |  |  |  |

## public

접근 제한 없음.

타 패키지와 상속받지 않은 클래스에서도 접근할 수 있다.

## protected

동일 패키지, 타 패키지의 자식 클래스에서만 접근할 수 있다.

## default

동일 패키지에서만 접근할 수 있다.

따로 접근 지정자를 지정하지 않으면 default로 선언된다.

## private

동일 클래스 내에서만 접근할 수 있다.