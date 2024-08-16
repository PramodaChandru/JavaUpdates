package java10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImmutableCollections {
    public static void main(String[] args) {
            var list = new ArrayList<Integer>();
            list.add(100);
            list.add(200);
            list.add(300);

            List<Integer> result = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toUnmodifiableList());
            result.forEach(System.out::println);

            System.out.println();
            List<Integer> result1 = List.copyOf(list);
            result1.forEach(System.out::println);
    }
}
