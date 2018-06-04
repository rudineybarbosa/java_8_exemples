package app04;
import java.util.stream.Stream;

public class StreamConcatDemo {
    public static void main(String[] args) {
        Stream<String> stream1 = 
                Stream.of("January", "Christie");
        Stream<String> stream2 = 
                Stream.of("Okanagan", "Sydney", "Alpha");
        Stream.concat(stream1, stream2).sorted().
                forEach(System.out::println);
    }
}