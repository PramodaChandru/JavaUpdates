package java9.collectionImmutableMethods;

import java.util.Set;

public class SetUpdates {
    public static void main(String[] args) {
        Set<String> set = Set.of("a", "b", "c", "d");

//        Set<String> setNew = Set.of("a", "b", "c", "c");
//        illegal argument exception - duplicate element c
//        at runtime collection tries to remove the duplicate element,
//        but set created using of is immutable hence it throws error
        set.forEach(System.out::println);
    }
}
