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
