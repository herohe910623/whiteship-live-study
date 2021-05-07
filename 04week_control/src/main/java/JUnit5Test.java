import org.junit.jupiter.api.*;

public class JUnit5Test {


    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll Test");
    }

    @BeforeEach
    static void beforeEach() {
        System.out.println("BeforeEach Test");
    }

    @Test
    @DisplayName("테스트1")
    static void testing(){
        System.out.println("testing");
    }

    @AfterEach
    static void afterEach() {
        System.out.println("AfterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll");
    }
}
