## 과제 6 : 패키지   

### 목표 : 자바의 패키지에 대해 학습하세요.    

### 학습할 것 (필수)      
* package 키워드   
* import 키워드   
* 클래스패스   
* CLASSPATH 환경변수   
* -classpath 옵션   
* 접근지시자   


-------------

### 패키지   
* 클래스를 구분짓는 폴더 개념   
* 자바는 패키지의 가장 상위 디렉토리(root)에서 실행해야 한다는 약속이 있기 때문에 해당 패키지로 가서 컴파일 하지 않는다.    
* 소스에 가장 첫 줄에 있어야하고, 패키지 선언은 소스 하나에 하나만 있어야 한다.   
* 패키지 이름은 모두 소문자여야 한다.   
* 자바의 예약어를 사용하면 안된다. (ex. int, static)    
* 개발 패키지 표준은 정하는 것에 따라 지정하면 된다.   
* 패키지 이름과 위치한 폴더의 이름이 같이야 한다.   
* 패키지 이름을 java 로 시작하면 안된다.   
* 모든 클래스에는 정의된 클래스 이름과 패키지 이름이 있다. 이 둘을 합쳐야 완전하게 한 클래스를 표현한다고 할 수 있으며 FQCN(Fully Qualified Class Name) 이라고 한다.   

예를 들어 String 클래스의 패키지는 java.lang 이먀 FQCN 은 java.lang.String 이 된다.   

패키지 구조 사진
<img width="500" src="./IMG/IMG_001package.png">    

대부분의 패키지 이름 지정 규칙    
|패키지 시작이름|내용|
|:---|:---|
|java|자바 기본 패키지(java vendor 개발)|
|javax|자바 확장 패키지(java vendor 개발)|
|org|일반적으로 비영리단체(오픈소스)패키지|
|corm|일반적으로 영리단체 패키지|

빌트-인 패키지(Built-in Package)    
자바는 개발자들이 사용할 수 있도록 여러 많은 패키지 및 클래스를 제공한다.   
가장 자주 쓰이는 패키지로는 java.lang과 java.util이 있다.   
java.lang 은 자주 사용하는 패키지이지만 한번도 import 하여 사용한적이 없다.   
즉, 자바에서 java.lang 패키지는 아주 기본적인 것들이기 때문에 import로 불러오지 않아도 자바가 알아서 java.lang의 클래스를 불러온다.    

```java
import java.lang.String; 
import java.lang.System;
public class Main {
    public static void main(String[] args) {
        String str = "this is from java.lang.String";
        System.out.println(str);
    }
}
```

### Import 키워드    

```
import 패키지명.클래스명   
```
다른 패키지명에 있는 클래스를 찾지 못할때 사용한다.    
패키지에 다수의 클래스를 import 하는 경우 ```import 패키지명.*``` 처럼 import 할 수 있다.    
```import static``` 의 경우, static 한 변수(클래스 변수)와 static 한 메소드를 사용하고자 할 때 용이하다. (이것이 없다면, 클래스함수, 클래스.변수 형태로 이용해야 한다.)   

import 를 하지 않아도 되는 패키지의 경우는    
1. java.lang 패키지    
2. 같은 패키지   


