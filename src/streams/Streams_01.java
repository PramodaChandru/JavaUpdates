package streams;

import java.util.ArrayList;
import java.util.List;

/**
 * print even numbers using streams and method reference
 */
public class Streams_01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(i + (int)Math.random());
        }
        List<Integer> result = list.stream()
                .filter(num -> num % 2 == 0)
                .toList();
        result.forEach(System.out::println);
    }
}
