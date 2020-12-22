## JVM 은 무엇이며 자바 코드는 어떻게 실행하는가 ?
 Java Virtual Machine 의 줄임말이며 Java Byte Code를 OS에 맞게 해석 해주 역할을 합니다. 
 
Java Compiler는 .java 파일을 .class라는 Java byte code 로 변환 시켜 줍니다. Byte Code는 기계억 아니기 때문에 OS에서 바로 
실행되지 않습니다. 이때 JVM은 OS가 ByteCode를 이해할 수 있도록 해석 해줍니다.
하지만 JVM의 해석을 거칙 때문에 c언어 같은 네이티브 언어에 비해 속도가 느렸지만 JIT(Just In Time) 컴파일러를 구현하여 이점으 극복 했습니다.
Byte Code 는  JVM위에서 OS상관없이 실행됩니다. 이런 점이 Java의 가장 크 장점이라고 할 수 있습니다. 

OS에 종속적이지 않고 Java 파일 하나만 만들면 어느 디바이스든 JVM위에서 실행 할 수 있습니다. JVM은 크게 Class Loader, Runtime Data Areas,Excution Engine 3가질 구성되어 있고 
자세한 설명은 아래에 이어서 하겠습니다.
