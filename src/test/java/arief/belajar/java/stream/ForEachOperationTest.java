package arief.belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {

    @Test
    void testPeekBefore() {
        List.of("Arief Karditya","Hilmi Akbar","Aryo Kusumo").stream()
                .map(name ->{
                    System.out.println("Before change name to Upper: " + name);
                    String upper = name.toUpperCase();
                    System.out.println("Change name to Upper: "+ upper);
                    return upper;
                })
                .forEach(name -> System.out.println("Final name: "+ name));
    }

    @Test
    void testPeekAfter() {
        List.of("Arief Karditya","Hilmi Akbar","Aryo Kusumo").stream()
                .peek(name -> System.out.println("Before change name to Upper: "+ name))
                .map(name -> name.toUpperCase())
                .peek(upper -> System.out.println("Change name to Upper: "+ upper))
                .forEach(name -> System.out.println("Final name: "+ name));
    }
}
