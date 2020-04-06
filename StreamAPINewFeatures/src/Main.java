import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        takeWhile();
        dropWhile();
        iterate();
    }

    private static void takeWhile(){
        System.out.print("*** Testing takeWhile ***\n");
        final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 1, 2, 3);
        numbers.stream()
                .takeWhile(n -> n <= 5)
                .forEach(n -> System.out.println(n));
    }

    private static void dropWhile(){
        System.out.print("*** Testing dropWhile ***\n");
        final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 1, 2, 3);
        numbers.stream()
                .dropWhile(n -> n <= 5)
                .forEach(n -> System.out.println(n));
    }

    private static void iterate(){
        System.out.print("*** Testing iterate ***\n");
        final List<Integer> numbers = List.of(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        Stream.iterate(0, x -> x < numbers.size(), x -> x + 1)
            .forEach(x -> System.out.println(numbers.get(x)));
    }
}
