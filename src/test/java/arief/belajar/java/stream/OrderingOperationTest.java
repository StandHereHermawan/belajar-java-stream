package arief.belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OrderingOperationTest {

    @Test
    void testSorted() {
        List.of("Arief", "Budi","Joko","Purnomo","Wildan","Dimas","Wildan","Purnomo","Arief", "Budi").stream()
                .sorted()
                .forEach(System.out::println);
        }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();

        List.of("Arief", "Budi","Joko","Purnomo","Wildan","Dimas","Wildan","Purnomo","Arief", "Budi").stream()
                .sorted(reverseComparator)
                .forEach(System.out::println);
    }
}
