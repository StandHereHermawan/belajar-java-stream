package arief.belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyValuaionTest {

    @Test
    void testIntermediateOperation() {

        List<String> names = List.of("Arief", "Budi", "Joko");

        Stream<String> upper = names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                });

    }

    @Test
    void testTerminateOperation() {

        List<String> names = List.of("Arief", "Budi", "Joko");

        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                })
                .map(upper -> {
                    System.out.println("Change " + upper + " to Mr.");
                    return "Mr. " + upper;
                })
                .forEach(item -> {
                    System.out.println(item);
                });

    }

}
