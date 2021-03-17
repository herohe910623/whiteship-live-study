
## 4주차    
자바가 제공하는 제어문을 학습하세요.

### 학습할 것 (필수)   

선택문   
반복문

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

=================================

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
</pre>

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

## 과제 0.JUnit 5 학습   
인텔리J , 이클립스, VS code 에서 JUnit 5 로 테스트 코드 작성하는 방법에 익숙해 질 것.    

### JUnit5의 Life-Cycle   
@BeforeAll : @Test 메소드들이 실행되기 전에 실행   
@BeforeEach : 각각의 @Test 메소드가 실행되기 전에 실행   
@AfterEach : 각각의 @Test 메소드가 실행된 후에 실행   
@AfterAll : @Test 메소드들이 실행된 후에 실행   

<pre>
<code>
import org.junit.jupiter.api.*;

class StudyTest {
    @Test
    @DisplayName("test1")
    void create() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create test");
    }
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("After All");
    }
    @BeforeEach
    void beforeEach() {
        System.out.println("Before Each");
    }
    @AfterEach
    void afterEach() {
        System.out.println("After Each");
    }
}
</code>
</pre>

### JUnit5 Feature   
@DisplayName : 한글, 스페이스, 이모지를 통해 테스트 이름의 표기 가능   
@Nested : 계층 구조 테스트가 가능하게 지원   
@ParameterizedTest : 여러개의 테스트 데이터를 매개변수 형태로 간편하게 사용 가능, NullSource, ValueSource, EmptySource, CsvSource, EnumSource, MethodSource 등 최소 하나의 소스 어노테이션이 필요   


<pre>
<code>
//DisplayName을 이용한 테스트 이름 작성   
@Test
@DisplayName("test 1")
void testing() {
    System.out.println("testing");
}

//Nested를 이용한 계층 구조 테스트
@Nested
@DisplayName("people")
Class People {
    @Nested
    @DisplayName("man")
    Class Man {
        @Test
        void manTest() {
            System.out.println("man");
        }
    }
    @Nested
    @DisplayName("woman")
    class Woman {
        @Test
        void womanTest() {
            System.out.println("woman");
        }
    }
}

//ParameterizedTest를 이용한 매개변수이용
@ParameterizedTest
v@ValueSource(ints = {1,2,3,4,5})
void isOdd(int num) {
    assertTrue(Numbers.isOdd(num));
}
</code>
</pre>

###JUnit Assert   
기존 JUnit4는 assert 메소드가 하나라도 실패하면 다음 assert를 실행하지 않았다. 하지만 JUnit5는 assertAll이라는 메소드를 통해 여러개의 assert를 실행하게 하여 실패하더라도 모든 결과를 확인할 수 있게 지원하였다.   

<pre>
</code>
@Test
static assertAllTest() {
    int num = 10;
    assertAll("assertAll test"),
        () -> assertEquals(10,num),
        () -> assertEquals(13,num+5),
        () -> assertEquals(15,num+5)
    );
}
</code>
</pre>

또한, JUnit4의 경우 라이브러리를 이용해 예외 검증이 가능했다면, JUnit5는 assertThrows를 이용해 예외 검증이 가능하게 되었다.   
<pre>
<code>
@Test 
void assertTimeoutTest() {
    assertTimeout(ofSeconds(1), () -> {
        //1초 이내에 수행해야함
    });
}
</code>
</pre>

## 과제1. live-study 대시 보드를 만드는 코드를 작성하세요.   
* 깃헙 이슈 1번부터 18번까지 댓글을 순회하며 댓글을 남긴 사용자를 체크 할 것.   
* 참여율을 계산하세요. 총 18회에 중에 몇 %를 참여했는지 소숫점 두자리까지 보여줄 것.   
* Github 자바 라이브러리를 사용하면 편리합니다.   
* 깃헙 API를 익명으로 호출하는데 제한이 있기 때문에 본인의 깃헙 프로젝트에 이슈를 만들고 테스트를 하시면 더 자주 테스트할 수 있습니다.   

<pre>
<code>
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class GitHubIssue {
    //personal token need to secret
    private static final String MY_PERSONAL_TOKEN = "MY_PERSONAL_TOKEN";

    public static void main(String[] args) throws IOException {
        Github github = new GitHubBuilder().withOAuthToken(MY_PERSONAL_TOKEN).build();

        //Repository 연결
        GHRepository repo = github.getRepository("whiteship/live-study");

        //IssueState ALL, OPEN, CLOSED 
        List<GHIssue> issues = repo.getIssues(GHIssueState.ALL);
        Map<String, Integer> participant = new HashMap<>();

        //1-18개 이슈
        for(GHIssue issue : issues) {
            Set<String> onlyOneParticipant = new Hashset<>();

            //댓글 한개 이상 단 경우 유저이름 중복 제거
            for(GHIssueComment comment : issue.getComments()) {
                onlyOneParticipant.add(comment.getUser().getName());
            }
        
            //카운터 증가해주기
            for(String name : onlyOneParticipant) {
                if(participant.onlyOneParticipant(name)) {
                    participant.replace(name,participant.get(name) + 1);
                    continue;
                }
                participant.put(name, 1);
            }
        }    
    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //참여율 출력
        for(String name : participant.keySet()) {
            double rate = (double)(participant.get(name) * 100) / issues.size();
            bw.write("name : " + name);
            bw.write(", Participation Rate : " + String.format("%.2f", rate) + "%");
            bw.newLine();
        }
        bw.close();
    }    
}
</code>
</pre>

## 과제2. LinkedList를 구현하세요.   
* LinkedList에 대해 공부하세요.   
* 정수를 저장하는 ListNode 클래스를 구현하세요.   
* ListNode add(ListNode head, ListNode nodeToAdd, int Position)를 구현하세요.   
* ListNode remove(ListNode head, int positionToRemove)를 구현하세요.   
* boolean contatins(ListNode head, ListNode nodeTocheck)를 구현하세요.   

### LinkedList Interface   

<pre>
<code>
public interface LinkedList {
    //add remove contatins
    ListNode add(ListNode head, ListNode nodeToAdd, int position);
    ListNode remove(ListNode head, int positionToRemove);
    boolean contains(ListNode head, ListNode nodeToCheck);
}
</code>
</pre>

### ListNode.java   

<pre>
<code>
public class ListNode implements LinkedList {
    int data;
    ListNode next;

    public ListNode() {}
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        ListNode node = head;

        //position 이전까지 탐색
        for(int i=0 ; i < position -1 ; i++) {
            node = node.next;
        }

        //지정 위치에 노드 삽입
        nodeToAdd.next = node.next;
        node.next = nodeToAdd;
        return head;
    }
    @Override
    public ListNode remove(ListNode head, int positionToRemove) {
        ListNode node = head;

        //삭제 위치가 가장 앞인 경우
        if(positiononToRemove == 0 ) {
            ListNode deleteToNode = node;
            head = node.next;
            deleteToNode.next = null;
            return deleteToNode;
        }
        for(int i= 0; i < positionToRemove -1 ; i++) {
            node = nde.next;
        }

        //지정 위치 노드 삭제
        ListNode deleteToNode = node.next;
        node.next = deleteToNode.next;
        deleteToNode.next = null;
        return deleteToNode;
    }
    @Override
    public boolean contains(ListNode head, ListNode nodeToCheck) {
        while(head.next != null) {
            if(head.next == nodeToCheck) 
                return true;
            head = head.next;    
        }
        return false;
    }
}
</code>
</pre>

### ListNodeTest.java   

<pre>
<code>
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ListNodeTest {
    private ListNode listNode;
    private static final int[] ADD_DATA = {1,3,4,5,7,9};
    private static final boolean[] CONTAINS_DATA = {true,false};
    private static List<Integer> acc_data;

    @BeforeEach
    void SetUp() {
        acc_data = new ArrayList<>();
        listNode = new ListNode();
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(3);
        ListNode thirdNode = new ListNode(6);
        ListNode fourthNode = new ListNode(7);
        Listnode fifthNode = new ListNode(9);

        this.listNode = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
    }
    @Test
    void add() {
        listNode = listNode.add(listNode, new ListNode(4), 2);

        while(listNode != null) {
            acc_data.add(listNode.data);
            listNode = listNode.next;
        }
        for(int i=0 ; i < acc_data.size() ; i++) {
            Assertions.assertEquals(ADD_DATA[i], acc_data.get(i));
        }
    }
    @Test 
    void remove() {
        ListNode removed = listNode.remove(listNode,2);
        Assertions.assertEquals(5,removed.data);
    }
    @Test
    void contains() {
        boolean[] result = new boolean[2];
        result[0] = listNode.contains(listNode, new ListNode(9));
        result[1] = listNode.contains(lsitNode, new ListNode(10));

        for(int i=0 ; i < acc_data.size() ; i++ ) {
            Assertions.assertEquals(CONTAINS_DATA[i], result[i]);
        }
    }
}
</code>
</pre>

## 과제3. Stack을 구현하세요.   

* int 배열을 사용해서 정수를 저장하는 Stack을 구현하세요.   
* void push(int data)를 구현하세요.   
* int pop()을 구현하세요.   

### Stack Interface

<pre>
<code>
public interface Stack {
    void push(int data);
    int pop();
}
</code>
</pre>

### ArrayStack.java   

<pre>
<code>
public class ArrayStack implements Stack {
    int[] stack;
    int top;

    public ArrayStack(int size) {
        stack = new int[size];
        top = -1;
    }

    @Override
    public int pop() {
        if(top == -1) {
            System.out.println("Empty");
            return top;
        }
        return stack[top--];
    }
}
</code>
</pre>

### ArrayStackTest.java   

<pre>
<code>
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayStackTest {
    private ArrayStack arrayStack;
    private static final int[] PUSH_DATA = {1,3,5,7,9};

    @BeforeEach
    void setUp() {
        arrayStack = new ArrayStack(5);
    }
    @Test
    void push() {
        arrayStack.push(1);
        arrayStack.push(3);
        arrayStack.push(5);
        arrayStack.push(7);
        arrayStack.push(9);

        for(int i =0 ; i < arrayStack.stack.stack.length ; i++) {
            Assertions.assertEquals(PUSH_DATA[i], arrayStack.stack[i]);
        }
    }
    @Test
    void pop() {
        arrayStack.push(1);
        arrayStack.push(3);
        arrayStack.push(5);
        arrayStack.push(7);
        arrayStack.push(9);
        Assertions.assertEquals(9,arrayStack.pop());
    }
}
</code>
</pre>

## 과제 4.앞서 만든 ListNode를 사용해서 Stack을 구현하세요.   
* ListNode head를 가지고 있는 ListNodeStack 클래스를 구현하세요.   
* void push(int data)를 구현하세요.   
* int pop()을 구현하세요.   

###ListNodeStack.java   

<pre>
<code>
public class ListNodeStack implements Stack {
    static int top;
    ListNode node;
    public ListNodeStack() {
        this.node = null;
        this.top = -1;
    }
    @Override
    public void push(int data) {
        ListNode pushNode = new ListNode(data);
        if(node == null) {
            node = new ListNode(data);
            top++;
        }else {
            node = node.add(node, pushNode, ++top);
        }
    }
    @Override
    public int pop() {
        if(top == -1) {
            System.out.println("Empty");
            return top;
        }
        return node.remove(node,top--).data;
    }
}
</code>
</pre>

### ListNodeStackTest.java   

<pre>
<code>
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeStackTest {
    private ListNodeStack stack;
    private static final int[] PUSH_DATA = {1,3,5,7,9};
    @BeforeEach
    void setUp() {
        stack =new ListNodeStack();
    }
    @Test
    void push() {
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        
        ListNode node = stack.node;

        int i=0;
        while(node != null) {
            Assertions.assertEquals(PUSH_DATA[i++], node.data);
            node = node.next;
        }
    }
    @Test
    void pop() {
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);

        Assertions.assertEquals(9,stack.pop());
        Assertions.assertEquals(7,stack.pop());
        Assertions.assertEquals(5,stack.pop());
        Assertions.assertEquals(3,stack.pop());
        Assertions.assertEquals(1,stack.pop());
    }
}
</code>
</pre>

## 과제 5.Queue를 구현하세요.      
* 배열을 사용해서 한번   
* ListNode를 사용해서 한번.   

### 배열을 사용   

QueueImpl   
<pre>
<code>
package datastructure.queue;

public class QueueImpl Implements Queue {
    private int[] queue;

    @Override
    public void enqueue(int data) {
        if(queue == null) {             // 빈 큐일 경우
            queue = new int[]{data};
            return;
        }
                                        // 일반적인 경우
        int size = queue.length;
        int[] tmp = queue.clone();      // 기존의 배열을 깊은 복사
        queue = new int[size + 1];
        for(int i = 0 ; i < size ; i++) {
            queue[i] = tmp[i];          // 기존 값으로 초기화
        }
        queue[size] = data;             // 마지막 방 새로운 값으로 초기화
    }

    @Override 
    public int dequeue() {
        if(queue == null) {throw new IndexOutOfBoundsException();}  // 빈 큐일 경우
        if(queue.length == 1) {                                     // 값이 하나만 존재할 경우
            int result = queue[0];
            queue = null;
            return result;
        }
                                                // 일반적인 경우
        int size = queue.length;                
        int[] tmp = queue.clone();              // 기존의 배열을 깊은 복사    
        queue = new int[size - 1];              // 사이즈 1칸 감소시킨 배열로 초기화
        for (int i = 1 ; i < size ; i++) {
            queue[i -1 ] = tmp[i];              // 기존 값으로 초기화
        }
        return tmp[0];                          // 기존 배열의 첫번째 방 반환
    }

    public String toString() {
        if (queue == null) { return "";}

        String result = "";
        for(int i = 0 ; i<queue.length ; i++) {
            result += String.valueOf(queue[i]) + ',';
        }
        return result.substring(0, result.length() -1);
    }
}
</code>
</pre>

QueueImplTest
<pre>
<code>
package datastructure.queue;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThroews;

@TestInstance(TestInstance.lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.orderAnnotation.class)
public lcass QueueImplTest {
    QueueImpl queue;

    @BeforeAll
    void init() {
        queue = new QueueImpl;
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
    }

    @Test
    @DisplayName("요소 추가 테스트")
    @Order(1)
    void enqueueTest() {
        assertEquals("1,3,5", queue.toString());
    }

    @Test
    @DisplayName("요소 삭제 테스트")
    @Order(2)
    void dequeueTest() {
        assertAll("요소 삭제 오류 ", 
            () -> {     // 큐(1,3,5)에서 1번 pop 한 결과
                queue.dequeue();
                assertEquals("3,5", queue.toString());
            },
            () -> {     // 큐(3,5)에서 1번 pop 한 결과
                queue.dequeue();
                assertEquals("5", queue.toString());
            },
            () -> {     // 큐(5)에서 1번 pop 한 결과
                queue.dequeue();
                assertEquals("", queue.toString());
            },
            () -> {     // 빈 큐에서 pop 시도할 경우
                Exception exception = assertThrows(IndexOutOfBoundsException.class, 
                    () -> queue.dequeue());
            });
    }
}
</code>
</pre>

### ListNode를 사용   

LinkedNodeQueue   
<pre>
<code>
package datastructure.queue;

import datastructure.linkedlist.ListNode;

public class LinkedNodeQueue implements Queue {
    private ListNode head;
    private int queueSize = 0;      //노드 개수

    @Override
    public void enqueue(int data) {     //빈 큐일 경우
        queueSize += 1; 
        if(head == null) {
            head = new ListNode(data);
            return;
        }
        getNodeAtThePosition(queueSize-1).next = new ListNode(data);    //마지막 방에 생성한 노드 연결
    }

    @Override
    public int dequeue() {
        int result;
        if(head == null) {throw new IndexOutOfBoundsException();}       //빈 큐 일 경우
        if(queueSize == 1) {
            result = head.getData();
            head = null;
            queueSize = 0;
            return result;
        }
                                                            // 일반적인 경우
        result = getNodeAtThePosition(1).getdata();         // 1번째 노드 result에 저장
        head = getNodeAtThePosition(2);                     // 2번째 노드를 head로 지정
        queueSize -= 1;
        return result;
    }

    // position 위치의 노드 반환
    public listNode getnodeAtThePosition(int position) {    // position : 1 ~ queueSize
        if( position < 1 || position > getSize) {           // position 이 인덱스 범위를 벗어난 경우
            throw new IndexOutOfBoundsException();
        }
        if(position == 1) {                                 // 1번째 노드를 요구하는 경우 
            return head;
        }

        ListNode node = head;                               // 일반적인 경우
        for(inti=1 ; i< position; i++) {                    // position 위치까지 노드 순환시키기
            node = node.next;
        }
        return node;
    }

    public String toString() {
        if(head == null) return "";
        String result = "";
        for(int i= 1 ; i <= queueSize ; i++ ) {
            result += String.valueOf(getNodeAtThePosition(i).getData()) + ',' ;
        }
        return result.substring(0, result.length() -1);
    }
}


</code>
</pre>

LinkedNodeQueueTest   
<pre>
<code>

package datastructure.queue;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThroews;

@TestInstance(TestInstance.lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LinkedNodeQueueTest {
    LinkedNodeQueue queue;

    @BeforeAll
    void init() {
        queue = new LinktedNodeQueue();
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
    }

    @Test
    @DisplayName("노드 큐 요소 삽입 테스트") 
    @Order(1)
    void enqueueTest() {
        assertEquals("1,3,5", queue.toString());
    }

    @Test
    @DisplayName("노드 큐 요소 삭제 테스트")
    @Order(2)
    void dequeueTest() {
        assertAll("노드 큐 요소 삭제 오류" ,
            () -> {         // 큐(1,3,5) 에서 2번 pop 한 결과
                queue.dequeue();
                queue.dequeue();
                assertEquals("5", queue.toString());
            }, 
            () -> {         // 큐(5) 에서 1번 pop 한 결과
                queue.dequeue();
                assertEquals("", queue.toString());
            },
            () -> {         // 빈 큐에서 pop 시도할 경우
                Exception exception = assertThrows(IndexOutOfBoundsException.class , () -> queue.dequeue());
            }); 
    }
}

</code>
</pre>
