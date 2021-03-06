## 3주차 : 자바가 제공하는 다양한 연산자를 학습하세요.
`학습할 것`
* 산술 연산자
* 비트 연산자
* 관계 연산자
* 논리 연산자
* instanceof
* assignment(=) operator
* 화살표(->) 연산자
* 3항 연산자
* 연산자 우선 순위
* (optional) Java 13. switch 연산자

- - -
<용어 정의>   
연산 (operation) : 프로그램에서 데이터를 처리하여 결과를 산출하는 것
연산자 (oprator) : 연산에 사용되는 표시나 기호 
피연산자 (operand) : 연산의 대상이 되는 데이터
연산식 (expressions) : 연산자와 피연산자로 연산의 과정을 기술한 것

<img width="500" src="./IMG/IMG_001oper.png">

- - -


## 산술 연산자

 일반적으로 산술 연산은 덧셈, 뺄셈, 곱셈, 나눗셈의 사칙 연산을 뜻한다.   
 자바에서 산술 연산은 사칙연산과 나머지 연산을 포함한 다섯 가지 연산을 뜻한다.

 덧셈과 뺄셈 그리고 곱셈은 일반적으로 알고 있는 수학에서 계산과 동일하다.   
 나눗셈과 나머지 연산은 처음 프로그래밍을 접한다면 다소 생소할 수 있다. 

 산술 연산에 대한 예를 살펴보기 전에 타입 캐스팅과 타입 프로모션을 다시 한 번 생각해볼 필요가 있다.   

타입 캐스팅은 원본 데이터의 데이터 타입 표현 범위를 모두 표현하지 못하는 데이터 타입으로 만들어진 변수에 값을 넣을 때 발생한다.   
타입 프로모션은 원본 데이터의 데이터 타입 표현 변위를 모두 표현할 수 있는 데이터 타입으로 만들어진 변수에 값을 넣을 때 발생한다.   


 <img width="500" src="./IMG/IMG_002oper.png">
 <img width="500" src="./IMG/IMG_003oper.png">  

예시로 작성한 코드에서 보면 알수 있듯이 정수형 자료형을 사용해서 연산을 했기 때문에 정수 표현 범위 내에서만 결과를 만들어 낼 수 있다.   
그래서 나눗셈과 나머지 연산을 보면, 정확히 그 몫과 나머지를 정수형으로 자동 변환 되어 결과를 출력한 것을 알 수 있다. 

실수형 자료형으로 사용하면 다음과 같이 나온다. 

 <img width="500" src="./IMG/IMG_004oper.png">
 <img width="500" src="./IMG/IMG_005oper.png"> 
실수 표현 범위를 가질 수 있기 때문에 소수점 아래 값도 계산되어 나오는 것을 볼 수 있다. 

## 비트 연산자

 비트 연산은 1과 0을 가지고 이루어진다. 
 일반적으로 0이 거짓(false) 1은 진실(true)를 상징한다.   

 ~ 은 단항 연산을 하며 부정, not을 뜻한다. 그래서 1은 0으로 0은 1로 변환한다. (NOT)   
 & 는 이항 연산자로 양쪽 항의 값이 모두 1인 경우 1을 반환한다. (AND)   
 | 는 이항 연산자로 양쪽 항 중 하나라도 1이면 1을 반환한다. (OR)   
 ^ 는 이항 연산자로 양쪽 항의 값이 서로 다를 때 1을 반환 한다. (XOR, exclusive OR)   

 비트 연산을 할 때 '진리표' 라는 것을 작성 하기도 한다.   
 진리표는 모든 입출력 경우에 대한 참거짓 결과를 논리값으로 정리한 표이다.   

 각 비트 연산에 대한 진리표는 다음과 같다. 

 <img width="300" src="./IMG/IMG_006oper.png">    
 비트를 반전 시킨다. 

 <img width="300" src="./IMG/IMG_007oper.png">    
 둘 다 참(1)인 경우 참(1)을 반환한다.

 <img width="300" src="./IMG/IMG_008oper.png">    
 하나라도 참(1)인 경우 참(1)을 반환 한다.

 <img width="300" src="./IMG/IMG_009oper.png">    
 서로 다른 경우 참(1)을 반환 한다.   

 숫자에 대해 비트 연산을 하면 어떻게 되는지 예시를 살펴보자. 

 <img width="500" src="./IMG/IMG_010oper.png">  

## 관계 연산자    

 관계 연산자는 이 연산자를 중심으로 양쪽의 값이 어떤 관계를 갖는지 확인하는 연산이다.   
 예를 들면, 두가지 값이 같은지, 어느 쪽 값이 더 큰지, 작은지 등을 알아보는데 사용 한다.   
 종류는 다음과 같다.   
== , != , > , < , >= , <= , instatnce of   

<img width="500" src="./IMG/IMG_011oper.png">  

<img width="500" src="./IMG/IMG_012oper.png">  


## 논리 연산자    

 비트 연산과 비슷하지만 그 대상(피연산자)이 boolean 타입의 논리 값이라는 것이다.   
 ! 는 논리적인 부정을 뜻하며, true를 false로, false를 true로 바꿔준다.   
 그 외 && (AND), ||(OR) 연산은 비트 연산자에서 보았던 것과 같은 개념을 갖는다.    

 즉, &&는 양쪽 피연산자 모두 true 일 때 true를 반환하고 그 외의 경우는 false를 반환한다.    
 || 는 양쪽 피연산자 중 하나라도 true 이면 true를 반환하고 그 외의 경우는 flase를 반환한다.   

 <img width="500" src="./IMG/IMG_013oper.png"> 

 그렇다면 & 와 && 그리고 | 과 || 는 무엇이 다른걸까?    
 && 첫번째 조건이 참이 아니면 두번째 조건을 확인하지 않는다.   
 & 는 첫번째 조건이 참이 아니어도 두번째 조건을 확인한다.   

 || 는 첫번째 조건이 참이면 두번째 조건을 확인하지 않는다.   
 | 는 첫번째 조건이 참이어도 두번째 조건을 확인한다.   

## instance of

사용 방법은 "(레퍼런스 타입 변수) instance of (레퍼런스 데이터 타입)" 이며, 레퍼런스 타입 변수가 레퍼런스 타입의 데이터 타입인지 확인해보는 연산이다.    

클래스 역시 사용자 정의 자료형이라 할 수 있기 떄문에 포괄적으로 레퍼런스 데이터 타입 이라고 정리했다.   

타양한 곳에서 활용할 수 있지만, 보통 레퍼런스 타입 변수가 레퍼런스 데이터 타입으로 변환이 가능한지 확인하기 위해 사용한다.    
타입 변환이 가능 하다는 것은 여러가지 내용을 내포할 수 있다.    

<pre>
<code>   
System.out.println("whiteship" instance of String) // true   
System.out.println(null instanceof String) //false   
</code>
</pre>

## assignment(=) operator   

 대입 또는 할당 연산자라고 부른다. 오른쪽의 피연산자를 왼쪽의 피연산자의 값으로 할당한다.    
 그러기 때문에 왼쪽에는 변수가, 오른쪽엔 리터럴 또는 리터럴이 담긴 변수가 온다.   
 값을 초기화 한다고 표현하기도 한다.    

 등호 (=) 만 사용하는 경우도 있지만, 다른 연산자를 함께 사용하여 문장의 길이를 줄이기도 한다.    
 다른 연산자를 함께 사용하면 다음과 같은 효과가 있다.   
 a += b;  
 이것은 a = a + b; 
 즉, 자기 자신에 대해 연산한 결과를 다시 자기 자신에 담을 경우 사용한다.    

<pre>
<code>   
public Class Week3 {
    public static void main(String[] args) {
        int v1 = 10; 
        System.out.println(v1 += 20); // 30
        System.out.println(v1);       // 30
    }
}
</code>
</pre>

시프트 연산은 비트 이동 연산자로 말 그대로 비트를 이동하는 연산을 한다.   
<pre>
<code>   
public class week3 {

    public static void main(String[] args) {

        int v1,v2;

        v1 = 14; // 00000000 00000000 00000000 00001110
        v2 = v1 << 3 ; // 00000000 00000000 00000000 01110000
                       // 128(0) 64(1) 32(1) 16(1) 8(0) 4(0) 2(0) 1(0)

        System.out.println(v2); //64 + 32 + 16 = 112

        v2 = v1 >> 3 ; // 00000000 00000000 00000000 00000001
                       // 128(0) 64(0) 32(0) 16(0) 8(0) 4(0) 2(0) 1(1)
        System.out.println(v2); // 1

        v2 = v1 >>> 3; // 00000000 00000000 00000000 00000001
                       // 128(0) 64(0) 32(0) 16(0) 8(0) 4(0) 2(0) 1(1)
        System.out.println(v2); // 1
    }
}
</code>
</pre>

 여기서 >>  와 >>> 의 차이는, 오른쪽으로 비트 이동을 할 때 MSB값으로 채우느냐 무조건 0으로 채우느냐의 차이 이다.   
 이런 >>  연산의 경우 MSB 값으로 부족한 비트를 채우고, >>> 연산은 MSB 상관없이 무조건 0으로 값을 채워준다.   
모든 비트 연산을 할 때, 밀려나는 비트는 전부 버려진다.

## 화살표(->) 연산자    

 Java 8 에서 람다가 도입 되면서 등장한 연사자 이다.    
 (인자 리스트) -> {바디}   
 인자 리스트가 없을때 : ()    
 인자가 한개일 때 : (one) 또는 one   
 인자가 여러개 일때 : (one, two)   
 인자의 타입은 생략 가능, 컴파일러가 추론(infer) 하지만 명시할 수도 있다.(integer one, integer two)   

 바디는 화살표 오른쪽에 함수 본문을 정의한다.   
 여러줄인 경우에 {} 를 사용하여 묶는다.   
 한 줄인 경우에 생략 가능, return 도 생략 가능하다.   

람다가 하는 일이 기존 메소드 또는 생성자를 호출하는 것이라면, 메소드 레퍼런스를 사용하여 매우 간결하게 표현할 수 있다.   
타입 :: 스태틱 메소드 ( 스태틱 메소드 참조 )    
객체 레퍼런스 :: 인스턴스 메소드 ( 특정 객체의 인스턴스 메소드 참조 )   
타입 :: 인스턴스 메소드 ( 임의 객체의 인스턴스 메소드 참조 )    
타입 :: new ( 생성자 참조 )   

<pre>
<code>   
Runnable r = () -> {
    System.out.println("1");
}
// Runnable r = () -> System.out.println("1"); 으로 생략 가능
</code>
</pre>


## 3항 연산자   

3항 연산자는 항이 3개라 3항 연산자다.     
물음표와 콜론을 사용하며, 기본적인 생김새는 다음과 같다.   

(조건) ? (조건이 참일 때 실행) : (조건이 거짓일 때 실행)    

<pre>
<code>   
public class week3 {

    public static void main(String[] args) {

        int v1 = 10;
        int v2 = 5;
        System.out.println((v1>v2)? "true" : "false");
    }
}
</code>
</pre>

## 연산자 우선 순위    

수학에서도 그렇지만 모든 연산에는 우선순위가 있다.    

<img width="500" src="./IMG/IMG_014oper.png">    

자주 사용하는 연산은 굳이 외우지 않아도 익숙해진다. 그리고 사실 전부 외우는 것이 불가능하지 않지만 쉽지도 않다.   
그래서 괄호를 적극적으로 사용하면 좋다.
가독성이 좋은 연산 문장을 작성 하도록 하자.   

## (optional) Java 13. switch operator    

자바13 부터 추가된 연산자로 일반적인 switch 문에서는 break로 리턴을 시켜줬지만, 자바13 부터는 yield 키워드를 이용해서 리턴하게 변경 되었다.   

<pre>
<code>   
private static int getValueSwitchBreak(String mode) {
    int result = switch (mode) {
        case "a":
        case "b":
            break 1;
        case "c":
            break 2;
        case "d":
        case "e":
        case "f":
            break 3;
        default:
            break -1;            
    };
    return result;
}
</code>
</pre>


위에 코드가 자바 13에서는 yield 가 사용되어 형태가 변경되었다.   

<pre>
<code>
private static int getValueSwitchYield(String mode) {
    int result = switch (mode) {
        case "a" , "b":
            yield 1;
        case "c":
            yield 2;
        case "d","e","f":
            //do something here...
            System.out.println("Supports multi line block!");
            yield 3;
        default:
            yield =1;
    };
    return result;
}
</code>
</pre>
