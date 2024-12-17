package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * print even numbers using java8.streams and method reference
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

        Random random = new Random();
        random.ints().limit(5).forEach(System.out::println);

        // sequential and parallel streams
        List<String> strings = Arrays.asList("abc", "", "d", "", "e");

        int count = (int) strings.stream().
                            filter(s -> s.isEmpty()).
                            count();
        System.out.println("count " + count);

        count = (int) strings.parallelStream().
                filter(s -> s.isEmpty()).
                count();
        System.out.println("count " + count);

    }
}
