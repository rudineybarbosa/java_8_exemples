package app04;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {

    public static long fibonacci(long i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    public static void main(String[] args) {
        List<Integer> numbers = 
                Arrays.asList(10, 20, 30, 40, 41, 42);

        Instant start = Instant.now();
        numbers.parallelStream()
                .map((input) -> fibonacci(input))
                .forEach(System.out::println);
        Instant end = Instant.now();
        System.out.printf(
                "Processing time with parallel stream : %dms\n",
                Duration.between(start, end).toMillis());

        start = Instant.now();
        numbers.stream()
                .map((input) -> fibonacci(input))
                .forEach(System.out::println);
        end = Instant.now();
        System.out.printf(
                "Processing time with sequential stream : %dms\n",
                Duration.between(start, end).toMillis());
    }
}