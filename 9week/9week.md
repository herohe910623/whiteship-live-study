## 9주차 과제 : 예외처리   

### 목표 : 자바의 예외 처리에 대해 학습하세요.   

### 학습할 것 (필수)   
* 자바에서 예외 처리 방법 (try, catch, throw, throws, finally)   
* 자바에서 제공하는 예외 계층 구조   
* Exception 과 Error의 차이는?   
* RuntimeException 과 RE가 아닌 것의 차이는?   
* 커스텀한 예외 만드는 방법   

-------------------------

### Exception과 Error의 차이는?   

#### 예외의 종류   
* checked exception   
* Error   
* runtime exception 혹은 unchecked exception   

#### Error   
* 컴퓨터 하드웨어의 오동작 또는 고장으로 인해 응용프로그램에 이상이 생겼거나 JVM 실행에 문제가 생겼을 경우 발생하는 것이다.   
* 프로세스에 영향을 준다.   
* 시스템 레벨에서 발생한다 (자바 프로그램 외의 오류)   
* VirtualMachineError , OutOfMemoryError , StackOverflowError , 등등...   

#### Exception(예외)   
* 컴퓨터의 에러가 아닌 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인해 발생하는 프로그램 오류이다.   
* 예외가 발생하면 프로그램이 종료가 된다는 것은 에러와 동이하지만 예외는 예외처리(Exception Handling)를 통해 프로그램을 
종료되지 않고 정상적으로 작동되게 만들어 줄 수 있다. 자바에서 예외처리는 Try Catch 문을 통해 해줄 수 있다.   
* 개발자가 구현한 로직에서 발생한다.   
* 쓰레드에 영향을 준다.   
* 종류   

-> Checked Exception    
>   >특징    
    * 반드시 예외 처리 해야한다.   
    확인   
    * 컴파일 단계   
    대표 예외   
    * Runtime Exception 를 제외한 모든 예외   
    * IOException   
    * SQLException 지금은 없다.   

-> Runtime Exception    
>   >특징   
    * 예외가 발생할 것을 미리 감지하지 못했을 때 발생.   
    * 런타임 예외에 해당하는 모든 예외들은 Runtime Exception을 확장한 예외들이다.   

-> 모든 예외의 부모 크래스는 java.lang.Throwable 클래스    
>   >특징   
    * Exception과 Error 클래스는 Throwable 클래스를 상속받아 처리하도록 되어 있다.   
    * Exception 이나 Error 를 처리할 때 Throwable로 처리해도 무관하다.   
    * Throwable 클래스에 선언되어 있고, Exception 클래스에서 Overriding한 메서드는 10개가 넘으며 가장 많이 상용되는 메서드는 getMessage, toString, printStackTrace 가 있다.   
>   >   >+ getMessage()    
            - 예외 메세지를 String 형태로 제공받는다.   
            - 예외가 출력되었을 때 어떤 예외가 발생되었는지를 확인할 때 매우 유용하다.   
            - 메시지를 활용하여 별도의 예외 메시지를 사용자에게 보여주려고 할 때 좋다.   
>   >   >+ toString()   
            - 예외 메시지를 String 형태로 제공받는다.   
            - getMessage() 메서드보다는 약간 더 자세하게, 예외 클래스 이름도 같이 제공한다.   
>   >   >+ printStackTrace()   
            - 가장 첫 줄에는 예외 메시지를 출력하고, 두번째 줄부터는 예외가 발생하게 된 메서드들의 호출 관계(Stack Trace)를 출력해준다.   
            - printStackTrace()는 서비스 운영시에 사용하면 안된다.   

#### getMessage()   
```java 
public class ThrowableSample {
    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        sample.throwable();
    }

    private void throwable() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
        }catch(Throwable t) {
            System.out.println(t.getMessage());
        }
    }
}
// 출력 결과 : null
```
1. 간단하게 출력된다.   

```java 
public class ThrowableSample {
    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        sample.throwable();
    }
    
    private void throwable() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
        }catch(Throwable t) {
            System.out.println(t.getMessage());
            System.out.println(t.toString());
        }
    }
}
// 출력 결과 : 
null
java.lang.NullPointerException
```
2. 조금 더 자세하게 출력된다.   

```java
public class ThrowableSample {
    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        sample.throwable();
    }

    private void throwable() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
        }catch(Throwable t) {
            System.out.println(t.getMessage());
            System.out.println(t.toString());
            t.printStackTrace();
        }
    }
}
// 출력 결과 : 
java.lang.NullPointerException
java.lang.NullPointerException
    at me.herohe.exceptionStudy.ThrowableSample.throwable(ThrowableSample.java:13)
    at me.herohe.exceptionStudy.ThrowableSample.main(ThrowableSample.java:6)
```
3. 매우 자세한 메시지를 볼 수 있다.    
   이 메서드는 개발할 때만 사용해야 한다.   
   운영할 시스템에 적용시 엄청난 양의 로그가 쌓이게 된다.    

#### 반복문 내에서는 Checked Exception 에 대한 처리는 지양해야 한다.   
```java 
for (String item : items) {
    try {
        insert(item);
    }catch(SQLException e) {
        e.printStackTrace();
    }
}
```
반복문 내에서 Checked Exception에 대한 예외처리 구분이 들어가게 되면 성능은 2배 3배 떨어지게 된다. 이러한 경우에는 insert에서 예외 발생 시, 
RuntimeException으로 한번 Wrapping 하여 Exception이 발생 되도록 하고 반복문 내에서는 최대한 예외처리에 대한 코드를 제거하는 
것이 성능상 유리하다.   

### 자바에서 예외 처리 방법 (try, catch, throw, throws, finally)   
java에서는 프로그램이 실행되는 도중 발생되는 예외를 처리하기 위해 try / catch / finally 문을 사용할 수 있다.   
#### 문법   
```java 
try {
    예외를 처리하길 원하는 실행 코드;
}catch (e1) {
    e1 에외가 발생할 경우에 실행될 코드;
}catch (e2) {
    e2 예외가 발생할 경우에 실행될 코드;
}
...
finally {
    예외 발생 여부와 상관없이 무조건 실행될 코드;
}
```

try 블록   
* 기본적으로 맨 먼저 실행되는 코드로 여기에 발생한 예외는 catch 블록에서 처리된다.   
catch 블록   
* try 블록에서 발생한 예외 코드나 예외 객체를 인수로 전달 받아 그 처리를 담당한다.   
finally 블록   
* 이블록은 try 블록에서 예외가 발생하나 안하나 상관없이 맨 마지막에 무조건 실행된다.   

```java 
1. try / catch   
2. try / finally   
3. try / catch / ... / finally
```

#### 예외 throws   
```java 
public class ThrowSample {
    public static void main (String[] args) {
        ThrowSample sample = new ThrowSample();
        sample.throwException(13);
    }
    
    private void throwException(int number) {
        try { 
            if(number > 12) {
                throw new Exception("Number is over than 12");
            }
            System.out.println("Number is " + number);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// 실행 결과 : 
java.lang.Exception : Number is over than 12 
    me.herohe.exceptionStudy.ThrowSample.throwException(ThrowSample.java:13)
    me.herohe.exceptionStudy.ThrowSample.main(ThrowSample.java:6)
```
* 강제 예외 발생 : throw new Exception("Number is over than 12");   
 
```java 
public void throwException(int number) throws Exception {
    if(number > 12) {
        throw new Exception("Number is over than 12");
    }
    System.out.println("Number is " + number);
}
```
* 에외가 발생 했을때 try - catch로 묶어주지 않아도 메서드를 호출한 메서드로 예외 처리를 위임하는 것이기 때문에 전혀 문제가 되지 않는다.   
* throwsException() 이라는 메서드는 Exception을 던진다고 메서드 선언부에 throws 선언을 해놓았기 때문에, throwsException() 메서드를 호출한 
메서드에서는 반드시 try - catch 블록으로 throwsException() 메서드를 감싸주어야만 한다. 그렇지 않을 경우에 컴파일 에러가 발생한다.   

```java 
public static void main(String[] args) {
    ThrowSample sample = new ThrowSample();
    sample.throwException(13);
    sample.throwExceptions(13); // 오류
}
```
* 오류 발생   

해결방안1   
```java 
public static void main(String[] args) {
    ThrowSample sample = new ThrowSample();
    sample.throwException(13);
    try {
        sample.throwException(13);
    }catch(Exception e) {

    }
}
```

해결방안2   
```java
public static void main(String[] args) throws Exception {
    ThrowSample sample = new ThrowSample();
    sample.throwException(13);
    sample.throwExceptions(13);
}
```
* 호출한 메서드(main() 메서드) 에서도 다시 throws 해버리면 된다.   
* 이미 throws 한것을 다시 throws 하면 안된다.   
* 가장 좋은 방법은 throws 하는 메서드를 호출할때 try - catch 로 처리하는 것이다.   

#### 예외의 throws와 throw    
 메서드를 선언할 때 매개변수 소괄호 뒤에 throws 라는 예약어를 적어 준 뒤 예외를 선언하면, 해당 메서드에서 선언한 예외가 발생했을 때 
호출한 메서드로 예외가 전달된다.   
만약 메서드에서 두 가지 이상의 예외를 던질 수 있다면, 콤마로 구분하여 예외 클래스 이름을 적어주면 된다.   
 try 블록 내에서 예외를 발생시킬 경우에는 throw 라는 예약어를 적어 준 뒤 예외 객체를 생성하거나, 생성되어 있는 객체를 명시해준다.   
throw 한 예외 클래스가 catch 블록에 선언되어 있지 않거나, throws 선언에 포함되어 있지 않으면 컴파일 에러가 발생한다.   
 catch 블록에서 예외를 throw 할 경우에도 메서드 선언의 throws 구문에 해당 예외가 정의되어 있어야만 한다.   

#### throw    
throw 키워드를 이용해서 고의로 예외를 발생시킬 수도 있다. 예를 들어 사용자가 "바보"라는 닉네임을 사용하지 못하게 하고 싶다면 다음과 같이 예외를 발생시켜 프로그램을 중단 시킬 수 있다.   
```java 
public class Exception { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("아이디를 입력하세요.");
        String userName = scanner.nextLine();

        try {
            if(userName.equals("바보")) {
                throw new IllegalArgumentException("부적절한 이름입니다.");
            }
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
```
Output   
```java   
> Task : ExceptionDemo.main()
아이디를 입력하세요.
바보
부적절한 이름입니다.

BUILD SUCCESSFUL in 6s
2 actionable tasks : 2 executed
```

#### throws   
throws 키워드를 통해 메서드에 예외를 선언할 수 있다. 여러 개의 메서드를 쉼표로 구분해서 선언할 수 있다. 형태는 다음과 같다.   
```java 
void method() throws Exception1, Exception2, ... ExceptionN {
    // 메서드 내용
}
```
throws 는 메서드 선언부에 예외를 선언해둠으로써 해당 메서드를 사용하는 사람들이 어떤 예외를 처리해야 하는 지를 알려주는 역할을 한다.   

throws 자체는 예외의 처리와는 관계가 없다. throws 로 예외가 선언된 메서드를 사용할 때, 사용자가 각자 알아서 예외를 처리해줘야 한다. 
즉 throws는 해당 메서드에서 예외를 처리하지 않고, 해당 메서드를 사용하는 쪽이 예외를 처리하도록 책임을 전가하는 역할을 한다.   
```java 
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("파일 이름을 입력하세요");
            String fileName = scanner.nextLine();

            File f = createFile(fileName);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static File createFile(String fileName) throws Exception {
        if(fileName == null || fileName.equals("")) {
            throw new Exception("파일 이름이 유효하지 않습니다.");
        }
        
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}
```
createFile 이라는 메서드는 파일 이름을 입력받아서 파일을 생성하는 역할을 한다. 만약 파일 이름이 null 이거나 빈 문자열 이라면 예외를 던진다.   
createFile 메서드 내에서는 해당 예외에 대한 처리를 하지 않고, 단지 throws 로 예외를 선언하기만 했다. 그래서 createFile을 사용하는 사람들이 각자 상황에 맞게 예외를 어떻게 처리할지 선택해야 한다.   

#### finally   
finally 는 try - catch와 함께 예외의 발생 여부와 상관없이 항상 실행되어야 할 코드를 포함시킬 목적으로 사용된다. try - catch문의 끝에 선택적으로 덧붙여 
사용할 수 있으며, try - catch - finally 의 순서로 구성된다.   
```java
try {
    // 예외가 발생할 가능성이 있는 문장을 넣는다.
}catch {
    // 예외 처리를 위한 문장을 넣는다.
}finally {
    // 예외 발생 여부와 상관없이 항상 실행되어야 할 문장을 넣는다.
}
```
예외가 발생한 경우에는 try -> catch -> finally 순으로 실행되고, 예외가 발생하지 않은 경우에는 try - finally 순으로 실행된다.   
한 가지 짚고 넘어갈 점은 finally 블록 내의 문장은 try , catch 블록에 return 문이 있떠라도 실행된다는 것이다.   

```java 
public class ExceptionDemo {
    public static void main(String[] args) throws Exception {
        methodA();
        System.out.println("methodA가 복귀한 후 실행될 문장");
    }

    static void methodA() {
        try {
            System.out.println("트라이 블록 수행");
            return;
        } catch(Exception e) {
            System.out.println("캐치 블록 수행");
        } finally {
            System.out.println("파이날리 블록 수행");
        }
    }
}
```
Output   
```java 
> Task : ExceptionDemo.main()
트라이 블록 수행
파이날리 블록 수행
methodA가 복귀한 후 실행될 문장

BUILD SUCCESSFUL in 256ms
2 actionable tasks : 2 executed
```
methodA를 보면 "트라이 블록 수행"을 출력하고 분명 return을 하는데도, 그전에 finally 블록이 수행되는 것을 확인할 수 있다.   
catch 블록을 수행하다가 return 문을 만날 때에도 finally 블록이 수행되고 리턴한다.   

#### try - with - resources   
exception 시 resources 를 자동으로 close() 해준다.   
사용 로직을 작성할 때 객체는 AutoCloseable 인터페이스를 구현한 객체 이어야 한다.   
자바 7부터 추가 되었다.   
```java 
try(FileOutputStream out = new FileOutputStream("text.txt")) {
    // try 안에서 선언된 객체의 close() 메서드 들을 명시적으로 호출해줄 필요가 없다.
} catch(IOException e) {
    e.printStackTrace();
}
```

#### AutoCloseable 인터페이스   
```java 
public interface AutoCloseable {
    void close() throws Exception;
}
```
자동으로 리소스를 close() 해주는 인터페이스   

위의 예제에서 FileOutputStream의 상속구조는 다음과 같다.   
```java 
java.lang.Object 
    java.io.OutputStream
        java.io.FilterOutputStream
```
OutputStream은 AutoCloseable을 상속받은 Closeable을 구현하였다.   
```java 
public abstract class OutputStream extends Object implements Closeable {
    ....
}
public interface Closeable extends AutoCloseable {
    void close() throws IOException;
}
```
이런 이유로 위의 예제에서 객체가 try-with-resources에 의해서 해제될 수 있다.   

#### Multi Catch   
하나의 try 블록에서 여러개의 예외가 발생할 때 많은 catch 문을 사용한다. 이렇게 사용했을 때 중복되는 코드들이 발생하는데 그것을 줄이기 위함이다.   
자바 7부터 추가 되었다.   
* 주의사항 : Multi Catch 문에 사용된 예외들은 예외의 상속관계에서 부모와 자식 관계에 있으면 안된다.   
```java 
try {
    // 생략
} catch(NoSuchElementException | RuntimeException e) {

}
```
```java 
Exception in thread "main" java.lang.Error: Unresolved compilation problem : 
    The exception NoSuchElementException is already caught by the alternative RuntimeException   
```
NoSuchElementException 은 RuntimeException 의 자식 클래스 이기 때문에 RuntimeException 하나만 처리가 가능하다.   

### 자바에서 제공하는 예외 계층 구조   
자바에서 실행 시 발생할 수 있는 오류 (Exception & Error)를 클래스로 정의하고 있다. 예외와 에러의 상속계층도는 다음과 같다.   
<img width="500" src="./IMG/IMG_001exception.png">   
Exception 과 Error 는 Throwable 이라는 클래스를 상속받고 있으며 Throwable 은 Object를 직접 상속받고 있다.   

### Checked Exceptions VS Unchecked Exceptions  (RuntimeException 과 RE 가 아닌 것의 차이는?)    
 위 그림을 살펴보면 Exception 을 상속받는 클래스들 중에서 RuntimeException 을 제외하고 모두 Checked Exception 이라고 표시되어 있다.   

Chekced Exception 은 컴파일 시점에서 확인될 수 있는 예외이다. 만약 코드 내에서 Checked Exception을 발생시킨다면, 해당 예외는 반드시 처리되거나, 
해당 코드가 속한 메서드의 선언부에 예외를 선언해줘야 한다.   

예를 들어 Checked Exception 중에 하나인 IOException 을 발생시키는 메서드를 선언했다고 치자.   
```java 
public class ExceptionDemo {
    public static void main (String[] args) {
        methodA();
    }
    
    static void methodA()  {
        throw new IOException();
    }
}
```
이 코드는 애초에 컴파일 자체가 안된다. IOException은 Checked Exception 이기 떄문에 컴파일 단계에서 예외가 확인이 된다. 따라서 위 코드를 
컴파일 하려면 try - catch 로 예외를 처리하거나 throws 로 예외를 던져줘야 한다.   

```java 
public class ExceptionDemo {
    public static void main(String[] args) throws IOException {
        methodA();
    }

    static void methodA() throws IOException {
        throw new IOException();
    }
}
```
이렇게 예외를 던져주면 컴파일은 가능하다.   


Unckecked Exception 은 컴파일 단계에서 확인되지 않는 예외이다. Java 에서는 RuntimeException 과 그 하위 클래스, 그리고 Error와 그 하위 클래스가 이에 속한다. 
이 예외들은 컴파일러가 예외를 처리하거나 선언하도록 강제하지 않는다. 프로그래머가 알아서 처리를 해야 한다. 예를 들어 위의 예시를 RuntimeException 으로 바꾸면 컴파일 에러가 발생하지 않는다.    
```java 
public class ExceptionDemo {
    public static void main(String[] args) {
        methodA();
    }

    static void methodA() {
        throw new RuntimeException();
    }
}
```
예외를 처리하거나 던지지 않아도 컴파일이 잘 된다.   

예외는 메서드의 파라미터나 반환 값만큼이나 중요한 공용 인터페이스 중 하나이다.   

메서드를 호출하는 쪽은 그 메서드가 어떤 예외를 발생시킬 수 있는가에 대해 반드시 알아야 한다. 따라서 Java 는 checked exception 을 통해 해당 메서드가 발생시킬 수 있는 예외를 명세하도록 강제하고 있다.   

그럼 Runtime Exception 은 왜 예외를 명세하지 않아도 되도록 했을까? RuntimeException은 프로그램 코드의 문제로 발생하는 예외이다. 
따라서 클라이언트 쪽 (메서드 호출하는 쪽) 에서 이를 복구(or 회복) 하거나 대처할 수 있을 거라고 예상하긴 어렵다. 또 Runtime Exception 은 프로그램 어디서나 매우 빈번하게 발생할 수 있기 때문에 모든 Runtime Exception 을 메서드에 명시하도록 강제하는 것은 프로그램의 명확성을 떨어뜨릴 수 있다.    

따라서 클라이언트 exception 을 적절히 회복할 수 있을 것이라고 예상되는 경우 checked excpetion 으로 만들고, 그렇지 않은 경우 unchecked exception 으로 만드는 것이 좋다.   


### 커스텀한 예외 만드는 방법   
Throwable 을 직접 상속 받는 클래스는 Exception 과 Error가 있다.   
Error 와 관련된 클래스는 개발자가 손대서는 절대 안된다.   
직접 만들때는 Exception 을 처리하는 클래스라면 java.lang.Exception 클래스의 상속을 받는 것이 좋다.   
```java 
public class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String messgae) {
        super(message);
    }
}
```
#### super() 메서드   
this() 메서드가 같은 클래스의 다른 생성자를 호출할 때 상요된다면, super() 메서드는 부모 클래스의 생성자를 호출할 때 사용된다.   
자식 클래스의 인스턴스를 생성하면, 해당 인스턴스에는 자식 클래스의 고유 멤버뿐만 아니라 부모 클래스의 모든 멤버까지도 포함되어 있다.   
따라서 부모 클래스의 멤버를 초기화 하기 위해서는 자식 클래스의 생성자에서 부모 클래스의 생성자까지 호출해야만 한다.   
이러한 부모 클래스의 생성자 호출은 모든 클래스의 부모 클래스인 Object 클래스의 생성자까지 계속 거슬러 올라가며 수행된다.   
```java 
public class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
```
```java 
public class CustomException {
    public static void main(String[] args) {
        CustomException sample = new CustomException();
        try {
            sample.throwMyException(13);
        } catch(MyException e) {
            e.printStackTrace();
        }
    }

    private void throwMyException(int number) throws MyException {
        try {
            if(number > 12) {
                throw new MyException ("Number is over than 12");
            }
        } catch(MyException e) {
            e.printStackTrace();
        }
    }
}
// 출력 결과 : 
me.herohe.exceptionStudy.MyException : Number is over than 12
me.herohe.exceptionStudy.CustomException.throwMyException(CustomException.java:16)
    me.herohe.exceptionStudy.CutomException.main(CustomException.java:7)
```
MyException 을 던진다고 명시해 놓았지만, 이 메서드를 호출하는 메서드 main()에서는 반드시 MyException으로 catch 할 필요는 없다.   
MyException 의 부모 클래스인 Exception 클래스로 catch 해도 무방하다.   
그런데, 앞에서 MyException 이 예외 클래스가 되려면 Throwable 클래스의 자식 클래스가 되어야 한다고 이야기 했다. 만약 MyException 을 선언할 때 관련된 클래스를 확장하지 않았을 때에는 이 부분에서 제대로 컴파일이 되지 않는다.   
다시 말해서, 다음과 같이 MyException 이 아무런 상속을 받지 않고 선언되어 있다면,   
```java 
public class MyException { // extedns Exception 
    public MyException() {
        super();
    }

    public MyException(String message) {
        // super(message);
    }
}
```
CustomException 클래스를 컴파일할 때 에러 메세지들을 내뿜게 된다.   
```java 
public class CustomException {
    public static void main(String[] args) {
        CustomException sample = new CustomException();
        try {
            sample.throwMyException(13);
        } catch (MyException e) {   // error
            e.printStackTrace();
        }
    }

    private void throwMyException(int number) throws MyException {
        try {
            if(number > 12) {
                throw new MyException("Number is over than 12"); // error
            }
        } catch (MyException e) {   // error
            e.printStackTrace();
        }
    }
}
```

#### 자바 예외 처리 전략    
 예외를 어떻게 처리할지를 알아두는 것이 좋다.   
 실행시에 발생할 확률이 매우 높은 경우에는 런타임 예외로 만드는 것이 나을 수도 있다. 즉, 클래스 선언시 extends Exception 대신 extends RuntimeException 으로 선언하는 것이다. 
이렇게 되면 해당 예외를 던지는(throw) 메서드를 사용하더라도 try - catch 로 묶지 않아도 컴파일시에 예외가 발생하지 않는다.   
하지만, 이 경우에는 예외가 발생할 경우 해당 클래스를 호출하는 다른 클래스에서 예외를 처리하도록 구조적인 안전장치가 되어 있어야만 한다. 여기서 안전 장치라고 하는 것은 try - catch 로 묶지 않은 메서드를 
호출하는 메서드에서 예외를 처리하는 try - catch 가 되어 있는 것을 이야기 한다.   
```java 
public void methodCaller() {
    try {
        methodCaller();
    } catch (Exception e) {
        // 예외처리
    }
}

public void methodCaller() {
    // RuntimeException 예외 발생 가능성 있는 부분
}
```
이와 같이 unchecked exception인 RuntimeException 이 발생하는 메서드가 있따면, 그 메서드를 호출하는 메서드는 try-catch 로 묶어주지 않더라도 컴파일 할 때 문제가 생기지 않는다.   
하지만, 예외가 발생할 확률은 높으므로, 위의 예에서 methodCaller() 처럼 try-catch 로 묶어주는 것이 좋다.   
```java
try {
    // 예외발생 가능한 코드
} catch (SomeException e) {
    // 여기 아무 코드없음
}
```
이렇게 catch 문장을 처리해주는 건 피해야 한다.   
여기서 SomeException 이라는 것은 그냥 어떤 예외를 잡는다는 것을 의미할 뿐 실제 존재한다는것이 아니다.   
catch 에 아무런 작업을 하지 않으면 어디서 발생했는지 전혀 문제를 찾을 수 없다.   

### 정리   
* 임의의 예외 클래스를 만들 때에는, 반드시 try - catch 로 묶어줄 필요가 있을 경우에만 Exception 클래스를 확장한다. 일반적으로 실행시 예외를 처리할 수 있는 경우에는 
RuntimeException 클래스를 확장하는 것을 권장한다.   
* catch 문 내에 아무런 작업 없이 공백을 놔두면 예외 분석이 어려워지므로 꼭 로그처리와 같은 예외 처리를 해줘야만 한다.   

