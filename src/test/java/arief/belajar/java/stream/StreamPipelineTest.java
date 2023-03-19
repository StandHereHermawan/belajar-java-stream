package arief.belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

    @Test
    void testCreateStreamPipelineNovice() {
        List<String> list = List.of("Arief Karditya","Hilmi Akbar","Aryo Kusumo");
        Stream<String> stream = list.stream();
        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());
        Stream<String> streamMr = streamUpper.map(upper -> "Mr." + upper);
        streamMr.forEach(System.out::println);
    }

    @Test
    void testCreateStreamPipelineDev() {
        //CARA YANG BIASA DIGUNAKAN DEV JAVA
        List<String> list = List.of("Arief Karditya","Hilmi Akbar","Aryo Kusumo");
        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr." + upper)
                .forEach(System.out::println);
    }
}
