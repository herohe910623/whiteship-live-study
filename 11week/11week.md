
## 11주차 과제 : Enum   

### 목표 : 자바의 열거형에 대해 학습하세요.   

### 학습할 것(필수)   
* enum 정의하는 방법   
* enum이 제공하는 메소드 (values()와 valueOf())   
* java.lang.Enum   
* EnumSet   

-----------------------------

### 열거형이란?   
컴퓨터 프로그래밍에서 열거형(enumerated type, enumeration), 이넘(enum)은 요소, 멤버라 불리는 명명된 값의 집합을 이루는 자료형 이다. 
열거자 이름들은 일반적으로 해당 언어의 상수 역할을 하는 식별자 이다.    

일부 열거자 자료형은 언어에 기본적으로 포함되어 있을 수 있다.   
boolean 자료형을 예로 들면 거짓(false) 과 참(true) 와 같이 미리 정의된 열거형으로 볼 수 있다.   
수많은 언어는 사용자들이 새로운 열거형을 정의할 수 있게 하고 있다.   

### 열거형의 장점    
개발을 진행할 때 Enum을 통해 얻는 기본적인 장점들은 아래와 같다.    
* 문자열을 비교해, IDE 의 적극적인 지원을 받을 수 있다.   
    - 자동완성, 오타검증, 텍스트 리팩토링 등등   
* 허용 가능한 값을들 제한 할 수 있다.   
* 리팩토링시 변경 범위가 최소화 된다.   
    - 내용 추가가 필요하더라도, Enum 코드위에 수정할 필요가 없다.   

#### 아래는 Java 에서 얻을 수 있는 Enum 의 장점이다.   
* 확실한 부분과 불확실한 부분을 분리할 수 있다.   
    - A 값과 B 값이 실제로 동일한 것인지, 전혀 다른 의미인지    
    - 코드를 사용하기 위해 추가로 필요한 메서드들은 무엇인지    
    - 변경되면 어디까지 변경해야 하는 것인지   
* 문맥(Context)을 담을 수 있다.   
    - A 라는 상황에서 "a"와 B라는 상황에서 "a"는 똑같은 문자열 "a"지만 전혀 다른 의미이다.   
    - 문자열은 이를 표현할 수 없지만, Enum 은 이를 표현할 수 있다.   
    - 이로인해 실행되는 코드를 이해하기 위해 추가로 무언가를 찾아보는 행위를 최소화 할 수 있다.   

### Enum 정의하는 방법   

enum 을 정의하는 방법은 간단하다.   
아래와 같이 '{ }' 안에 상수의 이름을 나열하기만 하면 된다.   
```
enum 열거형 이름 {상수명1, 상수명2, ... 상수명n}
```
예를 들어 동서남북 4방향을 상수로 정의하는 열거형 Direction 은 다음과 같다.   
```java 
enum Direction {EAST, SOUTH, WEST, NORTH}
```
열거형에 정의된 상수를 사용하는 방법은 '열거형이름.상수명' 이다. 마치 클래스의 static 변수를 참조하는 것과 같다.   

```java 
enum Direction {EAST, SOUTH, WEST, NORTH} 

public class Unit {
    int x; 
    int y;
    Direction dir;  // 열거형을 인스턴스 변수로 선언 

    void init() {
        dir = Direction.EAST;   // 유닛의 방향을 EAST 로 초기화 
    }
}
```
열거형 상수는 필드를 가질 수 있다. 필드를 추가하는 방법은 추가하고 싶은 필드를 정의하고 생성자의 인자로 추가한 뒤 각각의 상수에 값을 입려갛면 된다.    
아래는 int 타입을 필드로 갖는 열거형 이다.   
```java 
enum Direction {
    EAST(1), SOUTH(5), WEST(-1), NORTH(10);

    private int value;
    Dircetion(int value) {
        this.value = value;
    }

    public int getValue() {return value;}
}
```

또한 열거형의 생성자는 접근제어자가 묵시적으로 private 이기 때문에 외부에서는 열거형의 생성자를 호출 할 수 없다.   
```java 
enum Direction {
    ...
    Direction(int value) {  // private Direction(int value)와 같다.
    ...
    }
}
```

### enum 상수간의 비교   
열거형의 상수간의 비교에는 '==' 을 사용할 수 있다. equals() 가 아닌 '=='로 비교가 가능하다는 것은 그만큼 빠른 성능을 제공한다는 얘기 이다.   

그러나 '<', '>' 와 같은 비교연산자는 사용할 수 없고 compareTo() 는 사용가능 하다.   

```java 
Direction dir;

if(dir == Direction.WEST) {
    ...
}else if (dir > Direction.WEST) {
    // 에러. 열거형 상수에 비교연산자는 사용 불가능
}else if (dir.compareTo(Direction.WEST) > 0) {
    // compareTo() 는 사용 가능 
}
```
switch 문의 조건식에도 열거형을 사용 할 수 있다.   

```java 
void move() {
    switch(dir) {
        case EAST : x++;
            break;
        case WEST : x--;
            break;
        case SOUTH : y++;
            break;
        case NORTH : y--;
            break;
    }
}
```
switch 문에 열거형을 사용할 때 주의할 점은 case 문에 열거형 타입의 이름은 적지 않고 상수의 이름만 적어야 한다는 제약이 있다. ( 'case Direction.EAST' 가 아닌 'case EAST'만 적여야 한다.)   

### Java 의 열거형   
(참고 : docs.oracle.com/javase/1.5.0/docs/guide/language/enums.html )   






출처 : https://parkadd.tistory.com/50
