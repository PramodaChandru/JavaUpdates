package java9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUpdates {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> result1 = list.stream()
                .filter(n -> n > 5)
                .toList();
        result1.forEach(System.out::println);

        System.out.println("********Take While********");
        // it will take elements from Stream as long as predicate returns true
        List<Integer> result2 = list.stream()
                .takeWhile(n -> n < 5)
                .toList();
        result2.forEach(System.out::println); // 1, 2, 3, 4

        System.out.println("********Drop While********");
        // it will skip elements from Stream as long as predicate returns true, return the remaining elements
        List<Integer> result3 = list.stream()
                .dropWhile(n -> n < 5)
                .toList();
        result3.forEach(System.out::println); // 5,4,6,7,8,9,10


        System.out.println("********Iterator********");
        List<Integer> result4 = Stream.iterate(100, x -> x + 1).limit(10).toList();
        result4.forEach(System.out::println); // 100,101,102,103,104,105,106,107,108,109
        System.out.println("**************************");
        result4 = Stream.iterate(100, x -> x < 110, x -> x + 1).toList();
        result4.forEach(System.out::println); // 100,101,102,103,104,105,106,107,108,109
    }
}
