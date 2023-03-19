package arief.belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {

    @Test
    void testFilter() {
        List.of("Arief", "Budi","Joko","Purnomo","Wildan","Dimas").stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);

        List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15).stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of("Arief", "Budi","Joko","Purnomo","Wildan","Dimas","Wildan","Purnomo","Arief", "Budi").stream()
                .distinct()
                .forEach(System.out::println);
    }
}
