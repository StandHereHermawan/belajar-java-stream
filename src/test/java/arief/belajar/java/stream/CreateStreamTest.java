package arief.belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(value -> {
            System.out.println(value);
        });

        Stream<String> oneStream = Stream.of("Java");
        oneStream.forEach(value -> {
            System.out.println(value);
        });

        String data = "null";
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(value -> {
            System.out.println(value);
        });
        
    }

    @Test
    void testCreateStreamFromArrays() {

        Stream<String> arrayStream = Stream.of(" ","Belajar","Java", "2023"," ");
        arrayStream.forEach(value -> {
            System.out.println(value);
        });

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17);
        integerStream.forEach(System.out::println);

        String[] array = new String[]{
                " ","Belajar","Java","2023","Stream","Data"
        };
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collection = List.of("Belajar","Java","2023","Bersama","Programmer","Zaman","Now");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);

        Stream<String> stringStream1 = collection.stream();
        stringStream1.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "Java, Spring");
        //stream.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
        iterate.forEach(System.out::println);
    }
}
