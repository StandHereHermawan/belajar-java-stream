package arief.belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {

    @Test
    void testMax() {
        List.of("Arief", "Budi", "Joko", "Purnomo", "Wildan", "Dimas", "Wildan", "Purnomo", "Arief", "Budi").stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        List.of("Arief", "Budi", "Joko", "Purnomo", "Wildan", "Dimas", "Wildan", "Purnomo", "Arief", "Budi").stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
        long count = List.of("Arief", "Budi", "Joko", "Purnomo", "Wildan", "Dimas", "Wildan", "Purnomo", "Arief", "Budi").stream()
                .count();
        System.out.println(count);
    }

    @Test
    void testSum() {
        var result = List.of(1, 2, 3, 4, 5).stream()
                .reduce(0, (value, item) -> value + item);

        System.out.println(result);

        /*
         * 0
         * 1. value=0 item=1 value + item = 1
         * 2. value=1 item=2 value + item = 3
         * 3. value=3 item=3 value + item = 6
         * 4. value=6 item=4 value + item = 10
         * 5. value=10 item=5 value + item = 15
         * Hasil Java Stream (value + item)= 15.
         * */
    }

    @Test
    void testSum2() {
        var result = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
                .reduce(0, (value, item) -> value + item);

        System.out.println(result);
    }

    @Test
    void testFactorial() {
        var result = List.of(1, 2, 3, 4, 5).stream()
                .reduce(1, (value, item) -> value * item);

        System.out.println(result);

        /*
         * 1
         * 1. value=1 item=1 value * item = 1
         * 2. value=1 item=2 value * item = 2
         * 3. value=2 item=3 value * item = 6
         * 4. value=6 item=4 value * item = 24
         * 5. value=24 item=5 value * item = 120
         * Hasil Java Stream (value * item) = 120.
         * */
    }
}