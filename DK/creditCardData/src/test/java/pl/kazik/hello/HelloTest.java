package pl.kazik.creditcarddata;


import org.junit.jupiter.api.Test;

public class HelloTest {

    @Test
    void helloMyFirstUnitTest(){
        String name = "Kazik";
        String message= String.format("Hello %s", name);
        assert "Hello Kazik".equals(message);
    }
    @Test
    void failMyTest(){
        int a = 2;
        int b = 8;

        int result = a+b;

        assert result==10;
    }
}
