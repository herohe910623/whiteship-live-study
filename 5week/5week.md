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

==========

### Class   

Class 는 각 instance 를 만들기위한 청사진 혹은 프로토타입 이다. 쉽게 비유하자면, 붕어빵 (Object)이 있고 그 붕어빵을 만들기 위한 붕어빵 틀이 있는데, 
이 붕어빵 틀을 Class 라고 한다. 붕어빵 틀을 통해 만들어진 각 붕어빵들을 instance 라고 한다.    

### Class 선언   

Class 는 다음과 같이 선언할 수 있다.    
'''java
public class ClassExample {
    // 생성자, 필드, 메서드 등등
}
'''
