
## 4주차    
자바가 제공하는 제어문을 학습하세요.

### 학습할 것 (필수)   
선택문   
반복문
=
## 과제 (옵션)   
### 과제 0. JUnit 5 학습하세요.   
* 인텔리J, 이클립스, VS Code에서 JUnit 5로 테스트 코드 작성하는 방법에 익숙해 질 것.   
* 이미 JUnit 알고 계신분들은 다른 것 아무거나!   
* 더 자바, 테스트 강의도 있으니 참고하세요 ~    

## 과제 1.ilve-study 대시 보드를 만드는 코드를 작성하세요.   
* 깃헙 이슈 1번부터 18번까지 댓글을 순회하며 댓글을 남긴 사용자를 체크 할 것.   
* 참여율을 계산하세요. 총 18회에 중에 몇 %를 참여했는지 소숫점 두자리까지 보여줄 것.   
* Github 자바 라이브러리를 사용하면 편리합니다.   
* 깃헙 API를 익명으로 호출하는데 제한이 있기 때문에 본인의 깃헙 프로젝트에 이슈를 만들고 테스트를 하시면 더 자주 테스트할 수 있습니다.   

## 과제 2.LinkedList 를 구현하세요.   
* LinkedList에 대해 공부하세요.
* 정수를 저장하는 ListNode 클래스를 구현하세요.   
* ListNode add(ListNode head, ListNode nodeToAdd, int Position)를 구현하세요.   
* ListNode remove(ListNode head, int positionToRemove)를 구현하세요.   
* boolean contatins(ListNode head, ListNode nodeTocheck)를 구현하세요.   
## 과제 3.Stack을 구현하세요.   

* int 배열을 사용해서 정수를 저장하는 Stack을 구현하세요.   
* void push(int data)를 구현하세요.   
* int pop()을 구현하세요.   

## 과제 4.앞서 만든 ListNode를 사용해서 Stack을 구현하세요.   
* ListNode head를 가지고 있는 ListNodeStack 클래스를 구현하세요.   
* void push(int data)를 구현하세요.   
* int pop()을 구현하세요.   

## 과제 5.Queue를 구현하세요.    
* 배열을 사용해서 한번   
* ListNode를 사용해서 한번.   


### 선택문(조건문)   
Java는 if/else문 (조건문)과 Switch/case문(선택문)을 제공한다.   

### if/else문   
if문에 들어가는 조건식이 참인 경우에 if문 내의 블록 코드를 실행한다.   

<pre>
<code>
    int a = 10;
    if(a>5) {  //조건이 참이므로 코드 실행
        a += 5;
    }
</code>
<pre>

만약 조건식이 거짓인 경우 else if 문이 있다면 else if 문의 조건을, else문이 있다면 else문의 코드를 실행한다.   

<pre>
<code>
    int a = 8;
    if(a>5) {
        if(a<10) {
            System.out.println("a가 5보다 크고 10보다 작으면 코드 실행");            
        }else {
            System.out.println("a가 10이상이면 코드 실행");
        }
    }
</code>
</pre> 

또한, if문 내에 다시 if문 사용이 가능하다. 이를 중첩 if문이라 한다.

<pre>
<code>
    int a = 8;
    if(a>5) {
        if(a<10) {
            System.out.println("a가 5보다 크고 10보다 작으면 코드 실행");
        }else {
            System.out.println("a가 10 이상이면 코드 실행");
        }
    }
</code>
</pre>

### switch/case 문   
여러개의 if문은 코드의 가독성 및 여러 조건 탐색을 해야하므로 속도가 늦어진다는 단점이 있다. switch문은 switch의 매개변수에 맞는 조건에 따라 case문을 실행하여 다중 if문의 단점을 개선한 선택문이다.   

각각의 case문에 break 키워드를 사용하지 않으면 switch문을 탈출하지 않으므로 다음 case문도 실행하기 때문에 주의해야 한다.   


<pre>
<code>
    int a = 3;
    switch(a) {
        case 1 :
            System.out.println("a가 1이면 코드 실행");
            break;
        case 2 :
            System.out.println("a가 2이면 코드 실행");
            break;
        case 3 :
            System.out.println("a가 3이면 코드 실행");
            break;
        default :
            System.out.println("a가 그 외의 값일 때 코드 실행");
    }
</code>
</pre>
3주차 스터디 마지막에서 다룬 java 13 switch 문을 부면 최근 Java 12부터 switch/case문에서 사용할 수 있는 기능이 확장되었다.   

### 반복문    
코드를 조건에 맞게 반복해주는 구문을 말한다.   
반복문에는 for문, while문, do-while문, for-each(향상된 for문), Iterator 가 있다.    

### for문(초기화 ; 조건문 ; 증감식)   
for문은 초기화한 값을 가지고 조건문을 검사해 초기화한 값을 증감식의 조건에 따라 증감해가면서 for문의 내부의 코드를 반복하는 구문이다.   

<pre>
<code>
    for(int i = 0 ; i<10; i++) {
        //코드 0~9회 즉, 10번 식행
    }
</code>
</pre>

### while문 (조건)   
while문은 조건의 값이 참인 경우에 계속 반복하는 구문이다. 따라서, 조건이 항상 참인 경우 무한루프가 발생하기 때문에 유한적인 조건을 주거나 while문 내부에 탈출 조건을 반드시 명시해주어야 한다.   

<pre>
<code>
    int i = 0;
    while(i<10) {
        //코드 10회 반복
        i++; //for문과 달리 증감식이 없기 때문에 증감식을 통해 유한적인 조건이 되게함
    }
</code>
</pre>

### do-while문(하단 조건)   

do-while문은 while문과 달리 조건문이 하단에 있는 구문이다.   
while문은 처음에 조건을 확인하고 실행하는 반면, do-while문의 경우 먼저 구문을 실행한 후 마지막에 조건을 확인함으로써 반드시 한번은 실행한다는 차이점이 있다.   
do-while문은 반드시 하단 조건을 명시한 후 세미콜론(;)을 써야한다.   


<pre>
<code>
    int i = 0;
    do{
        //코드 10회 반복
        i++;
    }while(i<10);
</code>
</pre>

### for-each문(향상된 for문)    

for문과 동일하게 for를 사용하지만 구조가 for문보다 직관적이고, 반복할 객체를 하나씩 차례대로 가져와 사용하는 구조이다.   


<pre>
<code>
    List<Integer> list = new ArrayList<>();
    for(int i = 0 ; i<5 ; i++) {
        list.add(i);
    }
    for(int num : list) {
        //1부터 5를 list에서 하나씩 가져와 출력   
        System.out.println(num);
    }
</code>
</pre>

### Iterator   
Iterator는 Java의 Collection에 저장되어 있는 데이터를 읽어오는 방법을 표준화한 기술 중 하나이다.   
hasNext(), next(), remove() 메소드를 이용해 데이터를 뽑아와 사용할 수 있다.   


<pre>
<code>
    Set<String> set = new HashSet<>();
    set.add("안녕");
    set.add("hello");
    set.add("world");

    Iterator<String> it = set.iterator();
    while(it.hasNext()) {
        //요소 출력 후 다음 요소로 이동   
        System.out.println(it.next());

        it.remove(); //요소 삭제
    }
</code>
</pre>
