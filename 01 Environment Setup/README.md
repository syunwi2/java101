# img

# 1. 자바 설치

### jdk 8 설치

[https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled.png)

jdk 8을 다운받아 설치한다(오라클 로그인 필요).

jdk는 JAVA SE에 해당한다.

### 설치 경로 확인

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%201.png)

`C:\Program Files\Java\jdk1.8.0_361\`

`C:\Program Files\Java\jre1.8.0_361\`

### Windows의 시스템 환경 변수 추가

`JAVA_HOME`(자바 홈 디렉터리)을 새로 만들고, `PATH`(명령어 경로)를 추가한다.

`JAVA_HOME`의 경로는 하나이다.

`PATH`에는 여러 경로를 `;`으로 연결해 추가할 수 있다.

- `JAVA_HOME` 변수 추가

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%202.png)

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%203.png)

- `PATH` 변수 추가
    
    가장 많이 사용하는 명령어가 모인 `java`, `javac`가 있는 경로는 아래와 같다.
    
    아래 경로를 시스템 변수 중 PATH에 추가한다.
    

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%204.png)

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%205.png)

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%206.png)

위는 아래와 같다.

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%207.png)

명령어 탐색 시간을 줄이기 위해 `%JAVA_HOMe%\bin`을 최상단으로 이동한다.

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%208.png)

### jdk 정상 설치 및 시스템 환경 변수 적용 확인

cmd를 관리자 권한으로 실행한 뒤 아래의 명령어를 입력해 출력을 확인한다.

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%209.png)

---

# 2. 이클립스 설치

### 다운로드 및 설치

[https://www.eclipse.org/downloads/packages/release/2021-03/r](https://www.eclipse.org/downloads/packages/release/2021-03/r)

적절한 곳에 워크스페이스를 생성하고 설치 시 경로를 선택한다.

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2010.png)

### 한글 설정

텍스트 인코딩을 UTF-8로 변경한다.

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2011.png)

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2012.png)

### 글씨체 변경

Baisc은 코딩창, Debug는 콘솔창의 글씨체이다.

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2013.png)

Edit 버튼을 눌러 해당하는 글씨체를 수정할 수 있다.

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2014.png)

### 개발 환경 최적화

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2015.png)

이클립스는 JAVA SE뿐만 아니라 Git 개발 등 여러 개발에 최적화된 환경을 제공하므로 필요시 활용한다.

### jre 버전 설정

이클리스 설치 시 기본적으로 jre를 제공한다.

다른 버전의 jre를 프로젝트에 적용하기 위해서는 아래의 설정이 필요하다.

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2016.png)

jre를 추가한다.

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2017.png)

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2018.png)

jdk가 설치된 경로를 추가한다.

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2019.png)

이클립스가 기본으로 제공하는 jre를 삭제한다.

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2020.png)

적용 후 설정창 종료

### 프로젝트 생성

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2021.png)

프로젝트 이름과 jre 버전을 선택한다.

특정 jre 버전을 사용하기 위해서 항목을 선택한다.

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2022.png)

`/src`: 소스파일이 저장된다.

`/bin`: 컴파일된 클래스 파일이 저장된다.

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2023.png)

라이브러리 탭에서 `.jar`파일들을 확인할 수 있다.

`.jar`: 미리 만들어 제공하는 클래스들로 API와 같다.

(rt.jar로 원본 소스 파일은 jdk 설치 경로의 src.zip에 있다).

어떤 API가 제공되는지 확인할 수 있는 API 문서를 제공한다.

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2024.png)

> ## **자바의 압축 파일**
> 
> 
>  jar파일들은 기본적으로 제공하는 클래스 파일들이다.
> 
> ### *.jar
> 
> *.class, *.jar
> 
> → SE
> 
> ### *.war
> 
> 웹 어플리케이션 압축 파일
> 
> → EE
> 
> ### *.ear
> 
> jar + war
> 

> ## **API 문서 즐겨찾기 설정**
> 
> 
> [https://docs.oracle.com/javase/8/docs/api/index.html](https://docs.oracle.com/javase/8/docs/api/index.html)
> 
> 자바에서 제공하는 API들에 대한 문서를 제공하고 있다.
> 
> 필요 시 북마크나 즐겨찾기하여 참고한다.
> 
> ![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2025.png)
> 

Finish를 눌러 프로젝트 생성을 완료한다.

![Untitled](img%20c5449167ef2640808ba7beea05abd7d7/Untitled%2026.png)
