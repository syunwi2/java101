# 19 package, import

# package

`package packageName.packageName.(...)`

클래스 파일들을 관리하기 위해 사용한다.

관련있는 클래스 파일들을 하나로 묶어 폴더와 같이 사용할 수 있다.

패키지 명은 유일한 값(ex. IP Domain)을 사용하고, 깊이는 2~3개 정도를 권장한다.

하나의 클래스는 하나의 패키지에만 소속된다.

### default package

명시적으로 소속된 패키지를 밝히지 않으면 클래스는 default package에 속한다.

모든 클래스는 소속된 패키지를 가진다.

# import

`import packageName.(...).ClassName;`

![Untitled](19%20package,%20import%20587a0812cf65462da071fd82ac7c14b3/Untitled.png)

패키지가 다르면 기본적으로 클래스 간 접근이 되지 않는다.

패키지가 다른 클래스에 접근하기 위해서는 두 가지 방법이 있다.

- 클래스 명 앞에 패키지의 경로를 포함
- import 키워드 사용
    
    ![Untitled](19%20package,%20import%20587a0812cf65462da071fd82ac7c14b3/Untitled%201.png)
    
    매번 클래스 명 앞에 경로를 포함할 필요가 없다.
    

import는 여러 번 하더라도 상관없다.

# API

자바 API는 패키지 형태로 제공된다.

`java.~`

`javax.~`

위의 이름으로는 사용자가 패키지 명을 정의할 수 없다.

자바 API를 사용하기 위해서도 import해야 한다.

- java.lang.~은 import하지 않아도 된다.