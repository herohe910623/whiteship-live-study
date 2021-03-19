## 과제 5 : 클래스   
### 목표   
자바의 Class에 대해 학습하세요.

### 학습할 것(필수)    
* 클래스 정의하는 방법
* 객체 만드는 방법 (new 키워드 이해하기)   
* 메소드 정의하는 방법   
* 생성자 정의하는 방법   
* this 키워드 이해하기   
### 과제(Optional)   
* int 값을 가지고 있는 이진 트리를 나타내는 Node 라는 클래스를 정의하세요.   
* int value, Node left, right 를 가지고 있어야 합니다.   
* BinaryTree라는 클래스를 정의하고 주어진 노드를 기준으로 출력하는 bfs(Node node)와 dfs(Node node) 메소드를 구현하세요.   
* DFS는 왼쪽, 루트, 오른쪽 순으로 순회하세요.   

----------

### Class   

Class 는 각 instance 를 만들기위한 청사진 혹은 프로토타입 이다. 쉽게 비유하자면, 붕어빵 (Object)이 있고 그 붕어빵을 만들기 위한 붕어빵 틀이 있는데, 
이 붕어빵 틀을 Class 라고 한다. 붕어빵 틀을 통해 만들어진 각 붕어빵들을 instance 라고 한다.    

### Class 선언   

Class 는 다음과 같이 선언할 수 있다.    
```java
public class ClassExample {
    // 생성자, 필드, 메서드 등등
}
```

최상위 레벨의 Class 에는 오로지 public 과 default(no modifier) 접근 제어지시자 만 사용할 수 있다.   
Class 의 body 부분 {} 에는 instance 의 life cycle 동안 제공될 모든 코드들이 존재하게 된다.   
{새 객체를 초기화할 생성자, 클래스 및 객체의 상태를 표현하는 필드 그리고 클래스 및 객체의 행동을 구현하는 메서드}   

Class 는 또한 extends 키워드와  implements 키워드를 통해 상위 클래스 및 인터페이스의 정보를 제공할 수 있다.   

```java
public class ClassExample extends SuperClassExample implements InterfaceExample {
    //생성자, 필드, 메서드 등등
}
```

### 메서드 정의   
method 란 클래스 내부에 선언되며, 객체와 관련된 서브 루틴이다.   
method 는 선언된 클래스의 멤버 변수에 대한 접근 권한을 갖는다.   
method 는 다음과 같이 선언할 수 있다.   

```java
public class ClassExample {
    public void methodExample (int number, String text) throws Exception {
        // ....
    }
}
```
메서드는 보통 다음의 요소를 가지고 있다.   
* 접근제어 지시자   
* 반환 타입 : void 일 경우 반환값을 갖지 않는다.   
* 메서드 이름    
* 파라미터 리스트 : () 로 감싸진 부분에 작성 된다.   
* 예외 리스트 : throws 키워드를 통해 명시할 수 있다.   
* 메서드 body : {} 로 감싸진 부분 이다.   

위의 요소중 메서드 이름과 파라미터 타입을 메서드 시그니처 라고 한다.   
위의 코드를 예로 들면 메서드 시그니처는 methodExample(int, String) 가 된다.   

### 메서드 Overloading   

자바에서 메서드를 메서드 시그니처를 통해 구별할 수 있기 때문에, method overloading을 지원한다.    
따라서 같은 이름의 메서드 이더라도 파라미터 타입이 다르거나, 파라미터의 갯수가 다르면 선언이 가능하다.   
하지만 반환타입은 메서드 시그니처가 아니기 때문에 반환 타입만 다른 경우는 선언 할 수 없다.   

```java
public class ClassExample {
    public void methodExample(int number , String text) {
        // ...
    }
    public void methodExample(int number) {
        // ...
    }
    public void methodExample(String text) {
        // ...
    }
}
```

### 생성자 선언    
* 생성자 (Constructor)란 Class 를 통해 인서턴스를 생성시 호출되는 서브루틴을 말한다.   
* 생성자는 메서드의 선언과 비슷하지만, 반환값을 가지고 있지 않기 때문에 엄밀히 말하자면 함수라고 할 수 없다.   
* 생성자를 통해 여러 필드를 초기화 할 수 있다.   
* 생성자의 파라미터 갯수, 혹은 파라미터 타입이 다르다면 여러 생성자를 가질 수 있다.   
* 어떠한 생성자도 선언하지 않을 경우, 컴파일러가 자동적으로 어떠한 파라미터도 가지지 않는 디폴트 생성자를 생성 한다.   
* 컴파일러가 만들어주는 디폴트 생성자의 경우, 상위 클래스(super class)의 no-argument 생성자를 호출하기 때문에 상위 클래스의 no-argument 생성자를 확인하는게 좋다.   
* 만약 상위 클래스에서 no-argument 생성자가 존재하지 않고, 하위 클래스는 컴파일러에 의해 디폴트 생성자가 생성되는 경우에는 컴파일러 에러가 발생 한다.    
* 어떠한 생성자다로 선언되어 있으면, 컴파일러는 디폴트 생성자를 만들지 않는다.   

생성자는 다음과 같이 선언할 수 있다.   
생성자는 반환값을 가지지 않고, 이름은 클래스의 이름과 동일해야 한다.   
```java
public class ClassExample {
    private int number; 

    //기본 생성자 선언
    public ClassExample() {
        System.out.println("ClassExample constructor");
    }

    //int 값을 파라미터로 받는 생성자
    public ClassExample(int number) {
        this.number = number;
    }
}
```

### 필드 선언   

변수에는 다음과 같은 종류가 존재 한다.   
* 클래스의 멤버 변수 - 필드라고 한다.   
* 메서드나 코드 블럭내의 변수 - 지역변수 라고 한다.   
* 메서드 선언에 있는 변수 - 파라미터 라고 한다.   

필드(Field)는 접근제어 지시자, 타입 그리고 이름으로 구성된다.   
필드를 선언하는 방법은 기존의 지역변수를 선언하듯이 Class 의 body 부분에 변수를 선언하면 된다.   
```java
public class ClassExample {
    private int number;
    private String text;
}
```

### 필드의 접근 제한   

Class 의 필드는 접근제어 지시자를 통해 외부로부터 접근을 제한할 수 있다.   
제한되는 범위는 다음 표와 같다.   
|---|클래스내부|동일패키지|상속받은클래스|이외의 영역|
|:---|:---:|:---:|:---:|:---:|
|private|O|X|X|X|
|default(no modifier)|O|O|X|X|
|protected|O|O|O|X|
|public|O|O|O|O|
