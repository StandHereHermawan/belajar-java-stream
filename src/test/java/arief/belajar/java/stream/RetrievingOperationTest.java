package arief.belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

    @Test
    void testLimit() {
        List.of("Arief", "Budi","Joko","Purnomo","Wildan","Dimas","Wildan","Purnomo","Arief", "Budi").stream()
                .limit(4)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Arief", "Budi","Joko","Purnomo","Wildan","Dimas","Wildan","Purnomo","Arief", "Budi").stream()
                .skip(4)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Arief", "Budi","Joko","Purnomo","Wildan","Dimas","Wildan","Purnomo","Arief", "Budi").stream()
                .takeWhile(name -> name.length() <= 5)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Arief", "Budi","Joko","Purnomo","Wildan","Dimas","Wildan","Purnomo","Arief", "Budi").stream()
                .dropWhile(name -> name.length() <= 6)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = List.of("Arief", "Budi","Joko","Purnomo","Wildan","Dimas","Wildan","Purnomo","Arief", "Budi").stream()
                .findAny();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testFindFirst() {
        Optional<String> optional = List.of("Arief", "Budi","Joko","Purnomo","Wildan","Dimas","Wildan","Purnomo","Arief", "Budi").stream()
                .findFirst();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }
}
