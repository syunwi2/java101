# 41 Build Tool

# 프로그램 개발 단계

1. 소스파일 작성
    
    jar 다운로드, 빌드 패스
    
2. 컴파일
3. 단위 테스트
    
    junit 라이브러리
    
4. 패키징
    
    압축
    
5. 배포
    
    로컬
    
    원격
    

## 자동화 도구

소스파일 작성만 사용자가 하고 그 이후는 자동화 툴이 알아서 처리한다.

- maven
- gradle

# maven

- maven 프로젝트 만들기
    1. maven project 선택
        
        ![Untitled](41%20Build%20Tool%20f745f3b6b3564c599771b071f3062205/Untitled.png)
        
    2. simple project 선택
        
        ![Untitled](41%20Build%20Tool%20f745f3b6b3564c599771b071f3062205/Untitled%201.png)
        
    3. 이름 설정
        
        ![Untitled](41%20Build%20Tool%20f745f3b6b3564c599771b071f3062205/Untitled%202.png)
        
    4. 프로젝트 생성 완료
        
        ![Untitled](41%20Build%20Tool%20f745f3b6b3564c599771b071f3062205/Untitled%203.png)
        
        /java: 클래스 파일
        
        /resource: 그 외 소스 파일
        
        pom.xml: maven 프로젝트 관리
        
    5. jdk 버전 변경
        
        pom.xml 수정
        
        ```xml
        <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
        	  <modelVersion>4.0.0</modelVersion>
        	  <groupId>com.app</groupId>
        	  <artifactId>MavenTest</artifactId>
        	  <version>0.0.1-SNAPSHOT</version>
        	  
        	  <build>
        	 	<plugins>
        	      <plugin>
        	        <groupId>org.apache.maven.plugins</groupId>
        	        <artifactId>maven-compiler-plugin</artifactId>
        	        <version>3.5.1</version>
        	        <configuration>
        	          <source>1.8</source>
        	          <target>1.8</target>
        	        </configuration>
        	      </plugin>
        	    </plugins>
        	 </build>
        	</project>
        ```
        
        ![Untitled](41%20Build%20Tool%20f745f3b6b3564c599771b071f3062205/Untitled%204.png)
        
        ![Untitled](41%20Build%20Tool%20f745f3b6b3564c599771b071f3062205/Untitled%205.png)
        
- jar 다운로드나 빌드 패스를 하지 않고 pom.xml 파일을 수정해 사용할 수 있다.
    1. pom.xml 수정
        
        [https://mvnrepository.com/](https://mvnrepository.com/)
        
        ```xml
        <dependencies>
          <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine -->
        	<dependency>
        	    <groupId>org.junit.jupiter</groupId>
        	    <artifactId>junit-jupiter-engine</artifactId>
        	    <version>5.8.2</version>
        	    <scope>test</scope>
        	</dependency>
          </dependencies>
        ```
        
    2. 확인
        
        ![Untitled](41%20Build%20Tool%20f745f3b6b3564c599771b071f3062205/Untitled%206.png)
        
- 테스트 등 실행 방법
    
    이클립스 메이븐 프로젝트 마우스 우클릭
    
    ![Untitled](41%20Build%20Tool%20f745f3b6b3564c599771b071f3062205/Untitled%207.png)
    
    Run as → Maven build… 선택
    
    ![Untitled](41%20Build%20Tool%20f745f3b6b3564c599771b071f3062205/Untitled%208.png)
    
    명령어(test, clean 등) 입력 후 엔터
    

# lombok

[https://projectlombok.org/](https://projectlombok.org/)

- 설치 방법
    
    ![Untitled](41%20Build%20Tool%20f745f3b6b3564c599771b071f3062205/Untitled%209.png)
    
    jar 파일 다운 후 cmd 창 관리자 모드로 실행 후 파일 경로로 이동
    
    java -jar lombok.jar 입력 후 엔터
    
    ![Untitled](41%20Build%20Tool%20f745f3b6b3564c599771b071f3062205/Untitled%2010.png)
    
    ![Untitled](41%20Build%20Tool%20f745f3b6b3564c599771b071f3062205/Untitled%2011.png)
    
    이클립스 등 IDE 경로 선택해 인스톨
    
    실행 중이던 IDE 종료 후 재실행
    
    ![Untitled](41%20Build%20Tool%20f745f3b6b3564c599771b071f3062205/Untitled%2012.png)
    
    메이븐 환경은 업데이트 해주기
    
    ![Untitled](41%20Build%20Tool%20f745f3b6b3564c599771b071f3062205/Untitled%2013.png)
    
    이후 주해 사용 가능
    

`@Data`

getter, setter를 작성하지 않아도 사용할 수 있게 해준다.

`@AllArgsConstructor`

인자를 가진 생성자를 작성하지 않아도 사용할 수 있게 해준다.

`@NoArgsConstructor`

인자가 없는 생성자를 작성하지 않아도 사용할 수 있게 해준다.