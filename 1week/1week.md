`학습할 것`
- JVM이란 무엇인가
- 컴파일 하는 방법
- 실행하는 방법
- 바이트코드란 무엇인가
- JIT컴파일러라 무엇이며 어떻게 동작하는지
- JVM 구성 요소
- JDK와 JRE의 차이

## JVM 은 무엇인가? 
 Java Virtual Machine 의 줄임말이며 Java Byte Code를 OS에 맞게 해석 해주 역할을 합니다. 
 
 운영체제는 자바 프로그램을 바로 실행할 수 없는데, 그 이유는 자바 프로그램은 완전한 기계어가 아닌, 중간 단계의 바이트 코드이기 때문에 이것을 해석하고 실행할 수 있는 가상의 운영체제가 필요하다. 이것이 자바 가상 기계 JVM (Java Virtual Machine) 이다. JVM은 실 운영체제를 대신해서 자바 프로그램을 실행하는 가상의 운영체제 역할을 한다.
프로그램을 별도로 개발하는 것보다는 운영체제와 잡 프로그램을 중계하는 JVM을 두어 자바 프로그램이 여러 운영체제에서 동일한 실행 결과가 나오도록 설계한 것이다. 따라서 개발자는 운영체제와 상관없이 자바 프로그램을 개발 할 수 있다.

<img width="500" src="./IMG/IMG_001JVM.jpeg">

자바 프로그램은 확장자가 .java 인 파일을 작성하는 것부터 시작된다. 이것을 소스파일이라고 하는데, 이 소스 파일을 컴파일러로(javac.exe)로 컴파일하면 확장자가 .class인 바이트 코드 파일이 생성된다.바이트 코드 파일은 JVM 구동 명령어 (java.exe)에 의해 JVM에서 해석되고 해당 운영체제에 맞게 기계어로 번역된다.
바이트 코드는 하나지만, JVM에 의해서 번역되는 기계어는 운영체제에 따라서 달라진다.

* Write once, run anywhere (한 번 작성하면 어디서든 실행된다.)

## 컴파일 하는 방법
 자바 프로그램을 개발하려면 다음과 같은 순서로 진행해야 한다.
<img width="500" src="./IMG/IMG_002JVM.jpeg">

*[Hello.java] 자바 소스 파일*
```
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to the java world!");
    }
}
```
*Hello.java 소스 파일을 다음과 같이 컴파일*   
```
C:/Temp>javac Hello.java
```   
<img width="500" src="./IMG/IMG_003v2JVM.jpeg">
Hello.class가 생성되었는지 확인한다.  
 
## 실행하는 방법    
*JVM 구동 명령어인 java.exe를 다음과 같이 입력*   
```
C:/Temp>java Hello
```
<img width="500" src="./IMG/IMG_004v2JVM.jpeg">   
Hello, welcome to the java world! 가 출력되는 것을 볼수 있다.
