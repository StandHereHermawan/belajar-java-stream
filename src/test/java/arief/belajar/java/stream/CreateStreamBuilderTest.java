package arief.belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.stream.Stream;

public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder() {

        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Belajar ");
        builder.add("Java ").add("Stream ");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::print);
    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder()
                .add("Oleh ").add("Programmer ").add("Zaman ").add("Now ").build();
        stream.forEach(System.out::print);
    }
}
